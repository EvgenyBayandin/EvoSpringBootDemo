package ru.webdev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.webdev.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

}
