package jobsheet3.sc_code.tugas;

import java.util.Scanner;
public class Dosen21 {
    Scanner sc = new Scanner(System.in);
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen21(String kode,String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }

    void tambahData() {
        System.out.print("Kode                                           : ");
        kode = sc.nextLine();
        System.out.print("Nama                                           : ");
        nama = sc.nextLine();
        System.out.print("Jenis Kelamin (true = laki, false = perempuan) : ");
        jenisKelamin = sc.nextBoolean();
        System.out.print("Usia                                           : ");
        usia = sc.nextInt();    
    }

    void cetakData() {
        String gender = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + gender);
        System.out.println("Usia           : " + usia);
    }
}
