package com.grupoPAT.myExpenses.service;

import com.grupoPAT.myExpenses.model.User;

import java.util.List;

public interface ServiceUser {
    
    Iterable<User> getUser();
    List<User> getUsers();
    List<User> getUserByGender(String gender);

    //void deleteUser(String idUser);
    User getUserByUsername(String username);
    User updateLastName(String lastname, User user);

}