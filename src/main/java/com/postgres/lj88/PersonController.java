package com.postgres.lj88;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.lj88.model.Person;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/add")
    public ResponseEntity<String> addPersons(@RequestBody List<Person> persons) {
        personService.addPerson(persons);
        return ResponseEntity.status(HttpStatus.CREATED).body("Persons added successfully");
    }
    
    @GetMapping("/details")
    public List<ShareDto> getPersonsBySharedWith(@RequestParam String sharedWith) {
        return personService.getPersonsBySharedWith(sharedWith);
    }	
    
}
