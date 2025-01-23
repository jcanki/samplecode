/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.L1;
//INI P5
/**
 *
 * @author nurja
 */
public class Main {
    public static void main(String[] args) {
        MobilElektrik myCar = new MobilElektrik(50);

        myCar.displayBatteryStatus();
        myCar.start();
        myCar.stop();
        
        myCar.chargeBattery();
        myCar.displayBatteryStatus();
        myCar.start();
    }
}

