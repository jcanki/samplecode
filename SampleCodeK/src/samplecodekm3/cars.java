/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samplecodekm3;

/**
 *
 * @author nurja
 */
public class cars {
    String name;
    String color;
    int year;
    // constructor tanpa parameter
    public cars(){
    }
    // constructor dengan saru parameter name
    public cars(String name){
        this.name = name;
    }
    // constructor dengan 3 parameter (semua variabel
    public cars(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }
}
