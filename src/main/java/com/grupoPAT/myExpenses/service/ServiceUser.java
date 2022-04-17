package com.grupoPAT.myExpenses.service;

import com.grupoPAT.myExpenses.model.Gasto;
import com.grupoPAT.myExpenses.model.Periodo;
import com.grupoPAT.myExpenses.model.User;

import java.util.List;

public interface ServiceUser {

    String addUser(String username, String first_name, String last_name, String contrasena,int estado);


    Iterable<User> getUser();
    List<User> getUsers();
    List<User> getUserByGender(String gender);

    //void deleteUser(String idUser);
    User getUserByUsername(String username);
    User updateLastName(String lastname, User user);

}