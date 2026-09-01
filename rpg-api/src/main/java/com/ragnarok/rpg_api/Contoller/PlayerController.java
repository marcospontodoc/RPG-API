package com.ragnarok.rpg_api.Contoller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ragnarok.rpg_api.Entity.Player;
import com.ragnarok.rpg_api.Service.PlayerService;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;


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

    @GetMapping("/{id}")
    public Player findById(@PathVariable Integer id) {
        return playerService.findPlayerById(id);
    }

    @PostMapping
    public Player create(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    @PutMapping("/{id}")
    public Player update(@PathVariable Integer id, @RequestBody Player player){
        return playerService.updatePlayer(id, player);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        playerService.deletePlayer(id);
    }
}
