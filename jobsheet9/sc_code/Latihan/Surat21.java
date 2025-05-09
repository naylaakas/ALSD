package jobsheet9.sc_code.Latihan;

public class Surat21 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    Surat21() {
    }

    Surat21(String idSurat, String namaMahasiswa, String kelas,char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void cetakSurat() {
        System.out.println("-----------------------------");
        System.out.println("ID Surat        : " + idSurat);
        System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Jenis Izin      : " + jenisIzin);
        System.out.println("Durasi          : " + durasi);
        System.out.println("----------------------------");
    }
}
