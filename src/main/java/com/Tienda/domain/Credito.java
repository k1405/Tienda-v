package com.Tienda.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")
    private Long idCredito;
    
   public double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }

    
}
