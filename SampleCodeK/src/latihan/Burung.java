/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author nurja
 */
public class Burung extends Hewan {
    
    // Constructor
    public Burung(String nama, int umur) {
        super(nama, umur);
    }
    
    // Implementasi method suara
    @Override
    public void suara() {
        System.out.println(nama + " mengeluarkan suara: Tweet!");
    }
    
    // Implementasi method bergerak
    @Override
    public void bergerak() {
        System.out.println(nama + " sedang terbang.");
    }
}
