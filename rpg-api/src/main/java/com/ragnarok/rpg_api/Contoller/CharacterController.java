package com.ragnarok.rpg_api.Contoller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    public List<Character> findAll() {
        return characterService.findAllCharacters();
    }

    @GetMapping("/{id}")
    public Character findById(@PathVariable Integer id) {
        return characterService.findCharacterById(id);
    }

    @PostMapping
    public Character create(@RequestBody Character character) {
        return characterService.saveCharacter(character);
    }

    @PutMapping("/{id}")
    public Character update(@PathVariable Integer id, @RequestBody Character character){
        return characterService.updateCharacter(id, character);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        characterService.deleteCharacter(id);
    }
    
    
}
