/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;
//INI UNTUK CLASS HEWAN
/**
 *
 * @author nurja
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Tom", 3);
        Hewan burung = new Burung("Tweety", 1);

        kucing.suara();
        kucing.bergerak();

        burung.suara();
        burung.bergerak();
    }
}

