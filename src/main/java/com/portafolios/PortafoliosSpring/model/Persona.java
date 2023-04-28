/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolios.PortafoliosSpring.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Luis-W10F
 */
@Getter @Setter
public class Persona {
    
    private Long id;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
}
