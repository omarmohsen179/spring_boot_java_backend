package com.example.reactbackend.service;

import com.example.reactbackend.model.Person;
import com.example.reactbackend.repository.personRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ipersonService implements personService{

    @Autowired
    private personRepository repository;


    @Override
    public List<Person> findAllperson() {
        return (List<Person>) repository.findAll();
    }

    @Override
    public Person insertPerson(Person f) {
        return repository.save(f);
    }

}
