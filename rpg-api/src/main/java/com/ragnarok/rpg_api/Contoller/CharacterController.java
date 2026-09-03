package com.ragnarok.rpg_api.Contoller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

import com.ragnarok.rpg_api.Entity.Character;
import com.ragnarok.rpg_api.Service.CharacterService;


import java.util.List;



@RestController
@RequestMapping("/characters")
public class CharacterController {
    private final CharacterService characterService;
    
    
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<List<Character>> findAll() {
        return ResponseEntity.ok(characterService.findAllCharacters());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Character> findById(@PathVariable Integer id) {
        Character character = characterService.findCharacterById(id);
        if (character == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(character);
    }

    @PostMapping
    public ResponseEntity<Character> create(@RequestBody Character character) {
        Character savedCharacter = characterService.saveCharacter(character);
        return ResponseEntity
                .status(201)
                .body(savedCharacter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Character> update(@PathVariable Integer id, @RequestBody Character character){
        Character updatedCharacter = characterService.updateCharacter(id, character);
        if (updatedCharacter == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedCharacter);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        Character character = characterService.findCharacterById(id);
        if (character == null) {
            return ResponseEntity.notFound().build();
        }
        characterService.deleteCharacter(id);
        return ResponseEntity.noContent().build();
    }
    
    
}
