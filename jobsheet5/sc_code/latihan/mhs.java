package jobsheet5.sc_code.latihan;

public class mhs {
    String nama, nim;
    int tahunMasuk, nilaiUTS, nilaiUAS;

    public mhs(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilai;
    }

    int tertinggiUTS(mhs[] mahasiswa, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return mahasiswa[rendah].nilaiUTS;
        }
        int mid = (rendah + tinggi)/2;
        int lMax = tertinggiUTS(mahasiswa, rendah, mid);
        int rMax = tertinggiUTS(mahasiswa, mid + 1, tinggi);
        return Math.max(lMax, rMax);
    }

    int terendahUTS(mhs[] mahasiswa, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return mahasiswa[rendah].nilaiUTS;
        }
        int mid = (rendah + tinggi)/2;
        int lMin = terendahUTS(mahasiswa, rendah, mid);
        int rMin = terendahUTS(mahasiswa, mid + 1, tinggi);
        return Math.min(lMin, rMin);
    }

    double rataRataUAS(mhs[] mahasiswa) {
        int total = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            total = total + mahasiswa[i].nilaiUAS;
        }
        return (double) total / mahasiswa.length;
    }
}
