package controller;

import lombok.AllArgsConstructor;
import model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.PersonRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    private PersonRepository repository;

    @GetMapping(value = "/persons")
    public List<Person> getAllPersons(){
        return repository.findAll();
    }
}
