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

    @Query("SELECT* FROM USER WHERE USER.USERNAME= :username")
    public User getUserByUsername(String username);

    @Query("SELECT* FROM USER ")
    public List<User> getUsers();

    @Query("SELECT* FROM USER WHERE USER.GENDER= :gender")
    public List<User> getUserByGender(String gender);

    @Query("UPDATE USER SET USER.LAST_NAME= :lastname WHERE USER.USER_ID = :userId")
    public User updateLastName(User user,String userId);
 

    //public void deleteUser(String id);
}


