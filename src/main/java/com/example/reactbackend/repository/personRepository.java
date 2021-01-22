package com.example.reactbackend.repository;
import com.example.reactbackend.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepository extends CrudRepository<Person, Long>{
}
