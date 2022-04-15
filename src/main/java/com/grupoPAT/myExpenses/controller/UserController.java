package com.grupoPAT.myExpenses.controller;
import com.grupoPAT.myExpenses.model.User;
import com.grupoPAT.myExpenses.repository.UserRepository;
import com.grupoPAT.myExpenses.service.ServiceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//CLASE AÑADIDA



@RestController
@RequestMapping("/api/v1")


public class UserController {

    @Autowired
    private ServiceUser serviceUser;
   @Autowired
    private UserRepository userRepository;

    @Transactional
    @GetMapping("/users/username/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username){
        User user= serviceUser.getUserByUsername(username);
        return ResponseEntity.ok().body(user);
     
    }
    @Transactional
    @GetMapping("/users/gender/{gender}")
    public ResponseEntity<List<User>> getUserByGender(@PathVariable("gender") String gender){
        List<User> usuarios= serviceUser.getUserByGender(gender);
        return ResponseEntity.ok().body(usuarios);

    }
    @Transactional
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> usuarios = serviceUser.getUsers();
        return ResponseEntity.ok().body(usuarios);
    }
    
    @PutMapping("/users/{id}/")
    public ResponseEntity<User> updateLastName(@PathVariable String id, @RequestBody User user) {
        User newUser = serviceUser.updateLastName(id, user);
        if (newUser == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newUser);
    }
   

    /*@DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable String id) {
        userRepository.deleteUser(id);
        return ResponseEntity.noContent().build();
    }*/

}
