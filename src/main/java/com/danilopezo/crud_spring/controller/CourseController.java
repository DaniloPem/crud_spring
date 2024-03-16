package com.danilopezo.crud_spring.controller;

import com.danilopezo.crud_spring.model.Course;
import com.danilopezo.crud_spring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //Fala pro spring que essa classe contem um endpoint, uma url que vamos acessar nossa api (métodos post, get, delete)
@RequestMapping("/api/courses")
@AllArgsConstructor //cria construtor e getter e setter
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        // @RequestBody: converte uma representação de recurso vinda de um cliente em um objeto.
        return courseRepository.save(course);
        //return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(course));
    }
}
