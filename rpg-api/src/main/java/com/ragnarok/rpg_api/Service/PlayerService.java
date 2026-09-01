package com.ragnarok.rpg_api.Service;

import com.ragnarok.rpg_api.Entity.Player;
import com.ragnarok.rpg_api.Repository.PlayerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }
}
