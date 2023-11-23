package org.tpi_arg_prog.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_especialidad")
@Data
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;


}
