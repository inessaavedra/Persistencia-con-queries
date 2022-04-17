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
@Table("PERIODO")
public class Periodo {
    
    private @Column("PERIODO_CODE") @Id Integer periodo_code;
    private @Column("USER_ID") Integer user_id;

    private @Column("NOMBRE_PERIODO") String nombre_periodo;
    private @Column("MES") String mes;
}
