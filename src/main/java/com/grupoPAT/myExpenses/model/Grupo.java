package com.grupoPAT.myExpenses.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("GRUPO")
public class Grupo {
    
    private @Column("GRUPO_CODE") @Id Integer grupo_code;
    private @Column("PERIODO_CODE") Integer periodo_code;

    private @Column("NOMBRE_GRUPO") String nombre;
    private @Column("FOTO") String foto;
}

