package jobsheet6.sc_code.latihan;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }
        else {
            System.out.println("Data Penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Data Dosen ke-" + (i +1) + " :");
            dataDosen[i].tampil();
            System.out.println("----------------------");
        }
    }

    void SortingASC() {
        if (idx > 1) {
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 0; j < idx - i - 1; j++) {
                    if (dataDosen[j] != null && dataDosen[j+1] != null && dataDosen[j].usia > dataDosen[j+1].usia) {
                        Dosen tmp = dataDosen[j];
                        dataDosen[j] = dataDosen[j+1];
                        dataDosen[j+1] = tmp;
                    }
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
}
