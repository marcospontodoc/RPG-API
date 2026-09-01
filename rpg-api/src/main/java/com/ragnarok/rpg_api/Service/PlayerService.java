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

    public Player findPlayerById(Integer id) {
        return playerRepository.findById(id).orElse(null);
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Integer id, Player playerDetails) {
        Player player = playerRepository.findById(id).orElse(null);
        if (player != null) {
            player.setName(playerDetails.getName());
            return playerRepository.save(player);
        }
        return null;
    }

    public void deletePlayer(Integer id) {
        playerRepository.deleteById(id);
    }
    
}
