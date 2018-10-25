/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.arsw.clima.persistence.impl;

import com.edu.arsw.clima.persistence.ClimaPersistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2104481
 */

@Service("Cache")
public class CacheClimaPersistence  implements ClimaPersistence{

    @Override
    public String getClimaCiudad(String nombreCiudad) throws IOException {
        String url = "api.openweathermap.org/data/2.5/weather?q=" + nombreCiudad
                + "&appid=f70fd1eb9fb8c63c6a242766f8f90670";
        return getUrlData(url);
    }
    
    /**
     * Obtiene todo los datos de una url 
     * @param GET_URL
     * @return
     * @throws IOException
     */
    public String getUrlData(String GET_URL) throws IOException {

        String USER_AGENT = "Mozilla/5.0";

        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {
            return "GET request not worked";
        }
        
 
    }
}
