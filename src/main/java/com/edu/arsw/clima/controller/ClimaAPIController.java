/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.arsw.clima.controller;

import com.edu.arsw.clima.services.ClimaServices;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2104481
 */

@RestController
@RequestMapping(value = "/ciudades")
public class ClimaAPIController {
    
    @Autowired
    ClimaServices ClimaServicios;
    
    /**
     *
     * @param nombreCiudad
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{ciudad}")
    public ResponseEntity<?> getClimaCiudad(@PathVariable("nombreCiudad") String nombreCiudad){
        try {
            return new ResponseEntity<>(ClimaServicios.getClima(nombreCiudad),
                    HttpStatus.ACCEPTED);
        } catch (IOException ex) {
            return new ResponseEntity<>("No se ha podido obtener el dato del clima para esta ciudad", HttpStatus.NOT_FOUND);
        }        
    }
}