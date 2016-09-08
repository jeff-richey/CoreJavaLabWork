/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author jrichey
 */
public class Weather {

    /**
     * @param args the command line arguments
     */

        // TODO code application logic here
    public static void main(String[] args) throws Throwable {    
        BufferedReader br = Files.newBufferedReader(Paths.get("weather.csv"));
        Reading[] readings = new Reading[12];
        String line;
        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());
        }
        
        // remaining code here
        for (int j = 0; j < readings.length; j++) {
            System.out.println(readings[j].getTime() + readings[j].rateTemperature());
        }
    }
    
}

