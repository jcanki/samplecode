/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author nurja
 */
public class Caller {
    public static void main(String[] args) {
        // Menggunakan constructor tanpa parameter
        Mahasiswaa mahasiswa1 = new Mahasiswaa();
        mahasiswa1.setNama("man");
        mahasiswa1.setNim("12345678");
        mahasiswa1.setJenisKelamin('L');
        mahasiswa1.setEmail("man@mail.com");
        mahasiswa1.setTelepon("08123456789");
        mahasiswa1.tampilkanData();

        // Menggunakan constructor dengan 3 parameter
        Mahasiswaa mahasiswa2 = new Mahasiswaa("Budi", "654321", "budi@mail.com");
        mahasiswa2.setJenisKelamin('L');
        mahasiswa2.setTelepon("08987654321");
        mahasiswa2.tampilkanData();

        // Menggunakan constructor dengan semua parameter
        Mahasiswa mahasiswa3 = new Mahasiswa("Cici", "112233", 'P', "cici@mail.com", "08775432198");
        mahasiswa3.tampilkanData();
    }
}

