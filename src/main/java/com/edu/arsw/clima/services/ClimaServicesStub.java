/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.arsw.clima.services;

import com.edu.arsw.clima.persistence.ClimaPersistence;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2104481
 */
@Service
public class ClimaServicesStub  implements ClimaServices {
    
    @Autowired
    @Qualifier("Cache")
    ClimaPersistence climaP;

    @Override
    public String getClima(String ciudad) throws IOException {
        return climaP.getClimaCiudad(ciudad);
    }
    
}
