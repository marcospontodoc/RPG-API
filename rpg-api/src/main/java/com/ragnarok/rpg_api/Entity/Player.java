package com.ragnarok.rpg_api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_player")
    private Integer idPlayer;
    
    @Column(nullable = false)
    private String name;

    public Player() {
    }

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
