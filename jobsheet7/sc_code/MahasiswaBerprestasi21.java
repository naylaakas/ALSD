package jobsheet7.sc_code;

public class MahasiswaBerprestasi21 {
    Mahasiswa21[] listMhs = new Mahasiswa21[5];
    int idx;

    void tambah(Mahasiswa21 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
    }

    void tampil() {
        for (Mahasiswa21 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("------------------------------");
            }
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j <listMhs.length; j++) {
            if (listMhs[j] != null && listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearching(double cari, int left, int right) {
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk < cari) {
                return findBinarySearching(cari, left, mid-1);
            }
            else {
                return findBinarySearching(cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK: " + x + " ditemukan pada indeks " + pos);
        } 
        else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM    : " + listMhs[pos].nim);
            System.out.println("Nama   : " + listMhs[pos].nama);
            System.out.println("Kelas  : " + listMhs[pos].kelas);
            System.out.println("IPK    : " + listMhs[pos].ipk);
            System.out.println("------------------------------");
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
