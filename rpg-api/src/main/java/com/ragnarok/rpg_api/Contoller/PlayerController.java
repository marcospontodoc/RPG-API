package com.ragnarok.rpg_api.Contoller;

import com.ragnarok.rpg_api.Entity.Player;
import com.ragnarok.rpg_api.Service.PlayerService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<List<Player>> findAll() {
        return ResponseEntity.ok(playerService.findAllPlayers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> findById(@PathVariable Integer id) {

        Player player = playerService.findPlayerById(id);

        if (player == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(player);
    }

    @PostMapping
    public ResponseEntity<Player> create(@RequestBody Player player) {

        Player savedPlayer = playerService.savePlayer(player);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedPlayer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> update(
            @PathVariable Integer id,
            @RequestBody Player player) {

        Player updatedPlayer = playerService.updatePlayer(id, player);

        if (updatedPlayer == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedPlayer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        Player player = playerService.findPlayerById(id);

        if (player == null) {
            return ResponseEntity.notFound().build();
        }

        playerService.deletePlayer(id);

        return ResponseEntity.noContent().build();
    }
}