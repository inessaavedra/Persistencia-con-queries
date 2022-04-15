package com.grupoPAT.myExpenses.service.implementation;

import com.grupoPAT.myExpenses.model.User;
import com.grupoPAT.myExpenses.repository.UserRepository;
import com.grupoPAT.myExpenses.service.ServiceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ServiceUserImpl implements ServiceUser{
    
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Iterable<User> getUser(){
        return userRepository.findAll();
    }
    //@Override
    //public void deleteUser(String idUser){
     //   userRepository.deleteUser(idUser);
        
    //}
    @Override
    @Transactional
    public List<User> getUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toUnmodifiableList());
    }

    @Override
    @Transactional
    public List<User> getUserByGender(String gender) {
        return userRepository.getUserByGender(gender);
    }


    @Override
    public String addUser(String username, String first_name, String last_name, String contrasena, int estado){
        Optional<User> usuario1 = userRepository.findById(username);
        if(usuario1.isPresent()) {
            return "El usuario " + username + " ya está registrado";
        }else{
            User usuario = new User();
            usuario.setUsername(username);
            usuario.setFirst_name(first_name);
            usuario.setLast_name(last_name);
            usuario.setContrasena(contrasena);
            usuario.setEstado(estado);
            userRepository.addUser(usuario.getUsername(), usuario.getFirst_name(), usuario.getLast_name(), usuario.getContrasena(),usuario.getEstado());
            return "El usuario " + username + " se ha registrado correctamente";
        }

    //    jdbcTemplate.execute("INSERT INTO USER (USERNAME, FIRST_NAME, LAST_NAME, GENDER,CONTRASENA, ESTADO ) VALUES ('"+username+"',"+first_name+",'"+last_name+"','"+gender+"','"+contrasena+"','"+estado+"');");

    }

    @Override
    @Transactional
    public User getUserByUsername(String username){
        return userRepository.getUserByUsername(username);
    }
    @Override
    @Transactional
    public User updateLastName(String id, User user){
        return userRepository.updateLastName(user, id);
    }

   

   
    
    
    
}