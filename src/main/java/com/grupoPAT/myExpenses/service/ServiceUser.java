package com.grupoPAT.myExpenses.service;

import com.grupoPAT.myExpenses.model.User;

public interface ServiceUser {
    
    Iterable<User> getUser();
    //void deleteUser(String idUser);
    User getUserByUsername(String username);
    User updateLastName(String lastname, User user);
}