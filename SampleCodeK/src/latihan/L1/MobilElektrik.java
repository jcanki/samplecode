/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.L1;

/**
 *
 * @author nurja
 */
public class MobilElektrik implements Mobil, Elektrik {
    private int batteryLevel;

    // Constructor
    public MobilElektrik(int initialBatteryLevel) {
        this.batteryLevel = initialBatteryLevel;
    }

    @Override
    public void start() {
        if (batteryLevel > 0) {
            System.out.println("Mobil elektrik menyala.");
        } else {
            System.out.println("Baterai habis, silakan cas dulu.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Mobil elektrik mati.");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Baterai sedang diisi.");
    }

    @Override
    public void displayBatteryStatus() {
        System.out.println("Sisa baterai: " + batteryLevel + "%");
    }
}

