package com.example.demo.controller;

//import lombok.AllArgsConstructor;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    private final PersonRepository personRepository;
    public PersonController(PersonService personService, PersonRepository personRepository) {
        this.personService = personService;
        this.personRepository = personRepository;
    }
    // get all persons
    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return this.personRepository.findAll();
    }

    // get a person by its id
    @GetMapping("/person/${id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Person person = this.personService.getPersonById(id);
        return ResponseEntity.ok(person);
    }

    // create a person
    @PostMapping("/person")
    public ResponseEntity<Person> createPerson(@RequestBody Person p) {
        Person person = this.personService.createPerson(p);
        return ResponseEntity.ok(person);
    }

    // update employee by id
//    @PutMapping("/person/${id}")
//    public ResponseEntity<Person> getPersonById(
//            @PathVariable Long id,
//            @RequestBody Person personDetails
//    ) {
//        Person person = this.personService.getPersonById(id);
//
//        Person updatedPersonDetail = personRepository.save(person);
//        return ResponseEntity.ok(updatedPersonDetail);
//    }
}
