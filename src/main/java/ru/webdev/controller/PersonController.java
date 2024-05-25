package ru.webdev.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.webdev.model.Person;
import ru.webdev.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public Iterable<Person> getPersons() {
        return personRepository.findAll();
    }

    @PostMapping("save")
    public Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("{id}")
    public Optional<Person> findById(@PathVariable int id) {
        return personRepository.findById(id);
    }

    @GetMapping("find")
    public Iterable<Person> findByNameIgnoreCase(@RequestParam String name) {
        return personRepository.findPersonByNameContainingIgnoreCase(name);
    }
}
