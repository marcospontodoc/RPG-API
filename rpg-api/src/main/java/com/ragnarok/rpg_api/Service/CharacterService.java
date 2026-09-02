package com.ragnarok.rpg_api.Service;

import org.springframework.stereotype.Service;
import com.ragnarok.rpg_api.Repository.CharacterRepository;
import com.ragnarok.rpg_api.Entity.Character;
import java.util.List;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> findAllCharacters() {
        return characterRepository.findAll();
    }

    public Character findCharacterById(Integer id) {
        return characterRepository.findById(id).orElse(null);
    }

    public Character saveCharacter(Character character) {
        return characterRepository.save(character);
    }

    public Character updateCharacter(Integer id, Character characterDetails) {
        Character character = characterRepository.findById(id).orElse(null);
        if (character != null) {
            character.setIdPlayer(characterDetails.getIdPlayer());
            character.setIdClass(characterDetails.getIdClass());
            character.setName(characterDetails.getName());
            character.setLevel(characterDetails.getLevel());
            return characterRepository.save(character);
        }
        return null;
    }

    public void deleteCharacter(Integer id) {
        characterRepository.deleteById(id);
    }
    
}
