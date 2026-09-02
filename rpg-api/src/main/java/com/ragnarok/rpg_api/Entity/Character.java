package com.ragnarok.rpg_api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "character")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_character")
    private Integer idCharacter;

    @Column(name="id_player", nullable = false)
    private Integer idPlayer;

    @Column(name="id_class", nullable = false)
    private Integer idClass;

    @Column(name ="name", nullable = false)
    private String name;

    @Column(name="level", nullable = false)
    private Integer level;

    public Character() {
    }

    public Integer getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(Integer idCharacter) {
        this.idCharacter = idCharacter;
    }

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public Integer getIdClass() {
        return idClass;
    }

    public void setIdClass(Integer idClass) {
        this.idClass = idClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
