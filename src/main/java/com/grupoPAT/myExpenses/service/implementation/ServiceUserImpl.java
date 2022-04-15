package com.grupoPAT.myExpenses.service.implementation;

import com.grupoPAT.myExpenses.model.User;
import com.grupoPAT.myExpenses.repository.UserRepository;
import com.grupoPAT.myExpenses.service.ServiceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceUserImpl implements ServiceUser{
    
    @Autowired
    private UserRepository userRepository;

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
    public User getUserByUsername(String username){
        return userRepository.getUserByUsername(username);
    }
    @Override
    @Transactional
    public User updateLastName(String id, User user){
        return userRepository.updateLastName(user, id);
    }

   

   
    
    
    
}