package com.grupoPAT.myExpenses.repository;


import com.grupoPAT.myExpenses.model.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserRepository extends CrudRepository<User, String> {
///get
    @Query("SELECT* FROM USER WHERE USER.USERNAME= :username")
    public User getUserByUsername(String username);

    @Query("SELECT* FROM USER ")
    public List<User> getUsers();

    @Query("SELECT* FROM USER WHERE USER.GENDER= :gender")
    public List<User> getUserByGender(String gender);
///put
    @Query("UPDATE USER SET USER.LAST_NAME= :lastname WHERE USER.USER_ID = :userId")
    public User updateLastName(User user,String userId);
 //post        jdbcTemplate.execute("INSERT INTO USER (USERNAME, FIRST_NAME, LAST_NAME, GENDER,CONTRASENA, ESTADO) VALUES ('"+username+"',"+first_name+",'"+last_name+"','"+gender+"','"+contrasena+"','"+estado+"');");
    @Query("INSERT INTO USER (USERNAME, FIRST_NAME, LAST_NAME, GENDER,CONTRASENA, ESTADO) VALUES (:username,:first_name,:last_name,:gender,:contrasena,:estado)")
    //
    // @Modifying
    void addUser(String username, String first_name, String last_name, String contrasena,int estado);

    //public void deleteUser(String id);
}


