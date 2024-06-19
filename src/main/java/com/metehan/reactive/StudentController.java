package com.metehan.reactive;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    Mono<Student> save(@RequestBody Student student) {
        return service.save(student);

    }

    @GetMapping
    Flux<Student> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable Integer id) {
        return service.findById(id);
    }




}
