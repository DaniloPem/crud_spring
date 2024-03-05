package com.danilopezo.crud_spring.controller;

import com.danilopezo.crud_spring.model.Course;
import com.danilopezo.crud_spring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //Fala pro spring que essa classe contem um endpoint, uma url que vamos acessar nossa api (métodos post, get, delete)
@RequestMapping("/api/courses")
@AllArgsConstructor //cria construtor e getter e setter
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
