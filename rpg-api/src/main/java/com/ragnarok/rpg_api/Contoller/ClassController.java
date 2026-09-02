package com.ragnarok.rpg_api.Contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ragnarok.rpg_api.Service.ClassService;
import com.ragnarok.rpg_api.Entity.Class;
import java.util.List;

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
    public List<Class> findAll() {
        return classService.findAllClasses();
    }

    @GetMapping("/{id}")
    public Class findClassById(@PathVariable Integer id) {
        return classService.findClassById(id);
    }
}
