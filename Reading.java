/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;


/**
 *
 * @author jrichey
 */
public class Reading {
    String dayOfTheWeek = "";
    int hourOfTheDay = 0;
    int temperature = 0;
    int windSpeed = 0;
    
    public Reading(String inputLine) {
        String[] elements = inputLine.split(", ");
        dayOfTheWeek = elements[0];
        hourOfTheDay = Integer.valueOf(elements[1]);
        temperature = Integer.valueOf(elements[2]);
        windSpeed = Integer.valueOf(elements[3]);
    }
    
    public String rateTemperature() {
        String temperatureStr = "";
        
        if (this.temperature < 55) {
            temperatureStr = "cold";
        }
        else if (this.temperature < 65) {
            temperatureStr = "mild";
        }
        else if (this.temperature < 80) {
            temperatureStr = "warm";
        }
        else if (this.temperature >= 80) {
            temperatureStr = "hot";
        }
        else {
            temperatureStr = "error occured with the temperature ";
        }
        return temperatureStr;
    }
    
    public String getTime() {
        String timeStr = "";
        
        if (this.hourOfTheDay == 9) {
            timeStr = this.dayOfTheWeek + " morning was ";
        }
        else if (this.hourOfTheDay == 15) {
            timeStr = this.dayOfTheWeek + " afternoon was ";
        }
        else if (this.hourOfTheDay == 21) {
            timeStr = this.dayOfTheWeek + " evening was ";
        }
        else {
            timeStr = "error occurred with a bad time ";
        }
            
        return timeStr;
    }
    
        
}
