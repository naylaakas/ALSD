package jobsheet3.sc_code;

import java.util.Scanner;

public class Matakuliah21 {
    Scanner sc = new Scanner(System.in);
    public String kode, nama, dummy;
    public int sks, jumlahJam;

    public Matakuliah21 (String kode, String nama, int sks, int jumlahJam) {
        this.kode =  kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        System.out.print("Kode        : ");
        kode = sc.nextLine();
        System.out.print("Nama        : ");
        nama = sc.nextLine();
        System.out.print("SKS         : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam  : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);    
    }

    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }
}
