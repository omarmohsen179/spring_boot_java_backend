package com.example.reactbackend.service;

import com.example.reactbackend.model.Person;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
public interface personService {
    List<Person> findAllperson();
    Person insertPerson(Person f);

}
