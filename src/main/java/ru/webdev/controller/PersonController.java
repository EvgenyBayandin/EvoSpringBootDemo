package ru.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.webdev.model.Person;
import ru.webdev.repository.PersonRepository;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public Iterable<Person> getPerson() {
        return personRepository.findAll();
    }
}
