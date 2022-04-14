package com.grupoPAT.myExpenses.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("USER")
public class User {

    
    private @Column("USER_ID") @Id String user_id;
    private @Column("USERNAME") String username;
    private @Column("FIRST_NAME") String first_name;
    private @Column("LAST_NAME") String last_name;
    private @Column("GENDER") String gender;
    private @Column("CONTRASENA") String contrasena;
    private @Column("ESTADO") Integer estado;

    

}