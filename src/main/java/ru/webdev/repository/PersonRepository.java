package ru.webdev.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.webdev.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

    Iterable<Person> findPersonByNameContainingIgnoreCase(String name);
}
