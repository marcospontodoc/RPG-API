package com.ragnarok.rpg_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ragnarok.rpg_api.Entity.Class;

public interface ClassRepository extends JpaRepository<Class, Integer> {
    
}
