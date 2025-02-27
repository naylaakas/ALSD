package jobsheet2.sc_code;

public class Mahasiswa21 {

    String nama, nim, kelas;
    double ipk;

    public Mahasiswa21() {
    }

    public Mahasiswa21 (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi () {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk (double ipkBaru) {
        if (ipkBaru > 4.0 || ipkBaru <0) {  
        System.out.println("IPK tidak valid. Harus antara 0.0 - 4.0");
        }
        else {
        ipk = ipkBaru;
        }
    }

    String nilaiKinerja () {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }
        else if (ipk >= 3.0) {
            return "Kinerja baik";
        }
        else if (ipk >= 2.0) {
            return "Kinerja cukup";
        }
        else {
            return "Kinerja kurang";
        }
    }
}
