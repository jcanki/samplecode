/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author nurja
 */
public class Mahasiswaa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private String email;
    private String telepon;

    // Constructor tanpa parameter
    public Mahasiswaa() {
    }

    // Constructor dengan 3 parameter
    public Mahasiswaa(String nama, String nim, String email) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
    }

    // Constructor dengan semua parameter
    public Mahasiswaa(String nama, String nim, char jenisKelamin, String email, String telepon) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.email = email;
        this.telepon = telepon;
    }

    // Getter and Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    // Metode untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Email: " + email);
        System.out.println("Telepon: " + telepon);
    }
}

