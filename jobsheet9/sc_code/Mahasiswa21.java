package jobsheet9.sc_code;

public class Mahasiswa21 {
    String nama, nim, kelas;
    int nilai;

    Mahasiswa21() {
    }

    Mahasiswa21(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
