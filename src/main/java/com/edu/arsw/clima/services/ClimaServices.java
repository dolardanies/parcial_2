/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.arsw.clima.services;

import java.io.IOException;

/**
 *
 * @author 2104481
 */

public interface ClimaServices {
    
    /**
     *
     * @param ciudad
     * @return
     * @throws IOException
     */
    public String getClima(String ciudad) throws IOException;

}