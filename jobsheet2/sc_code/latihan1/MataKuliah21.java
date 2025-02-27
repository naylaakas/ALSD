package jobsheet2.sc_code.latihan1;

public class MataKuliah21 {

    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah21() {
    }

    public MataKuliah21(String kode, String nm, int sks, int jam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilkanInformasi () {
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("Kode: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS (int newSks) {
        if (newSks < 2 || newSks > 6) {
            System.out.println("SKS antara 2 - 6");
        }
        else {
            sks = newSks;
        }
    }

    void tambahJam (int jam) {
        jumlahJam += jam;
    }

    void kurangiJam (int jam) {
        if (jam > jumlahJam) {
            System.out.println("Tidak dapat dilakukan");
        }
        else {
            jumlahJam -= jam;
        }  
    }
}
