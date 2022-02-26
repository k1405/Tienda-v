package com.Tienda.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
}
