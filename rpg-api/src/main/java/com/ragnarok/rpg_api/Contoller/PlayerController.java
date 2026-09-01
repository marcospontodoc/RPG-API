package com.ragnarok.rpg_api.Contoller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.ragnarok.rpg_api.Entity.Player;
import com.ragnarok.rpg_api.Service.PlayerService;
import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> findAll() {
        return playerService.findAllPlayers();
    }
}
