/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolios.PortafoliosSpring.controller;

import com.portafolios.PortafoliosSpring.model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis-W10F
 */

@RestController
public class Controller {
    
    List<Persona> listaPersonas = new ArrayList();
    
    @GetMapping("/hola/{nombre}/{apellido}/{edad}")
    public String decirHola(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad){
    return "Hola Mundo " + nombre + " \nApellido: " + apellido + " \nEdad: " + edad;
    
    }
    
    @GetMapping("/chau")
    public String decirChau(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String edad){
    return "Chau Mundo " + nombre+ " \nApellido: " + apellido + " \nEdad: " + edad;
    }
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
    
    listaPersonas.add(pers);
    
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
    return listaPersonas;
    
    }
}
