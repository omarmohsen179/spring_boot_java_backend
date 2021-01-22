package com.example.reactbackend.conntroller;

import java.util.List;

import com.example.reactbackend.model.Person;
import com.example.reactbackend.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RestController
public class Mycontroller  {
    @Autowired
    private personService cityService;


    @GetMapping("/allperson.json")
    public List<Person> getallperson(Model model) {

        List<Person> cities = (List<Person>) cityService.findAllperson();
        model.addAttribute("person", cities);

        return cities;
    }
    @PostMapping("/insertperson")
    @ResponseStatus(HttpStatus.CREATED)
    public Person addPerson(
            @RequestBody Person company)
    {
        return cityService.insertPerson(company);
    }
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)
    public Person login(@RequestBody Person company){
        Person temp=new Person();
      for(Person p : cityService.findAllperson()){
          if(company.getUsername().equals(p.getUsername())
          && company.getPassword().equals(p.getPassword())){
          /*    if(!p.getLoggedin()){
                p.setLoggedin(true);
                return cityService.insertPerson(p);
              }
              else{
                  return temp;
              }*/
          }
      }
        return temp;
    }
}
