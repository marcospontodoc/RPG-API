package com.ragnarok.rpg_api.Repository;

import com.ragnarok.rpg_api.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    
}
