package com.grupoPAT.myExpenses.repository;


import com.grupoPAT.myExpenses.model.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface UserRepository extends CrudRepository<User, String> {

    @Query("SELECT* FROM USER WHERE USER.USERNAME= :username")
    public User getUserByUsername(String username);

    @Query("UPDATE USER SET USER.LAST_NAME= :lastname WHERE USER.USER_ID = :userId")
    public User updateLastName(User user,String userId);
   /* @Query("SELECT * FROM USER WHERE USER.USER_ID = :user_id")
    public Iterable <User> getUserById(String userId);

    //query para actulizar la base de datos
    @Modifying
    @Query("UPDATE USER  SET PASSWORD = :password WHERE USERNAME = :username")
    void updatePassword(@Param(value = "username") String username, @Param(value = "password") String password);

    @Modifying
    @Transactional
    @Query("INSERT INTO USER (USERNAME, FIRST_NAME, LAST_NAME, PASSWORD) VALUES (:username, :firstname, :lastname, :password)")
    void addUser(@Param(value = "username") String username, @Param(value = "firstname") String firstname, @Param(value = "lastname") String lastname, @Param(value = "password") String password);

    @Query("DELETE FROM USER WHERE USER.USER_ID = :username")
    public void deleteUser(String username);*/

    public void deleteUser(String id);
}


