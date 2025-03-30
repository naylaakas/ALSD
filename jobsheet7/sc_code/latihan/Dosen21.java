package jobsheet7.sc_code.latihan;

public class Dosen21 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen21(String kd, String nm, boolean jk, int us) {
        this.kode = kd;
        this.nama = nm;
        this.jenisKelamin = jk;
        this.usia = us;
    }

    void tampil() {
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
    }
}
