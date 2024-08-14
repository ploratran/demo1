package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PersonRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    // get all persons
    public List<Person> getAllPersons() {
        return this.personRepository.findAll();
    }

    // get person by its id
    public Person getPersonById(Long id) {
        return this.personRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    // create a new person
    public Person createPerson(Person person) {
        return this.personRepository.save(person);
    }
}
