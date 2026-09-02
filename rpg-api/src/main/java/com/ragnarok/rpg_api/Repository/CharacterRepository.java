package com.ragnarok.rpg_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ragnarok.rpg_api.Entity.Character;

public interface CharacterRepository extends JpaRepository<Character, Integer> {
    
}
