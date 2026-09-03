package com.ragnarok.rpg_api.Contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ragnarok.rpg_api.Service.ClassService;
import com.ragnarok.rpg_api.Entity.Class;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/classes")
public class ClassController {
    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping
    public ResponseEntity<List<Class>> findAll() {
        return ResponseEntity.ok(classService.findAllClasses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Class> findClassById(@PathVariable Integer id) {
        Class classEntity = classService.findClassById(id);
        if (classEntity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(classEntity);
    }
}
