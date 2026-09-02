package com.ragnarok.rpg_api.Service;

import java.util.List;
import com.ragnarok.rpg_api.Entity.Class;
import org.springframework.stereotype.Service;
import com.ragnarok.rpg_api.Repository.ClassRepository;

@Service
public class ClassService {
    private final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

   public List<Class> findAllClasses() {
        return classRepository.findAll();
    }

    public Class findClassById(Integer id) {
        return classRepository.findById(id).orElse(null);
    }

    
}
