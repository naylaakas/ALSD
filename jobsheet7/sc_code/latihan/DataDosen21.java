package jobsheet7.sc_code.latihan;

public class DataDosen21 {
    Dosen21[] dataDosen = new Dosen21[10];
    int idx = 0;

    void tambah(Dosen21 dsn) {
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
                        Dosen21 tmp = dataDosen[j];
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
            Dosen21 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void PencarianDataSequential21(String nama) {
        Dosen21[] hasilPencarian = new Dosen21[idx];
        int count = 0; 

        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                hasilPencarian[count] = dataDosen[i];
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu data dosen dengan nama '" + nama + "'");
        } else if (count == 1) {
            System.out.println("Data Dosen Ditemukan:");
            hasilPencarian[0].tampil();
        } else {
            System.out.println("Data Dosen dengan nama '" + nama + "' tidak ditemukan");
        }
    }

    void PencarianDataBinary21(int usia) {
        SortingASC(); 
        int left = 0;
        int right = idx - 1;
        Dosen21[] hasilPencarian = new Dosen21[idx]; 
        int count = 0; 

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (dataDosen[mid].usia == usia) {
                hasilPencarian[count] = dataDosen[mid];
                count++;

                for (int tmp = mid - 1; tmp >= 0 && dataDosen[tmp].usia == usia; tmp--) {
                    hasilPencarian[count] = dataDosen[tmp];
                    count++;
                }
                
                for (int tmp = mid + 1; tmp < idx && dataDosen[tmp].usia == usia; tmp++) {
                    hasilPencarian[count] = dataDosen[tmp];
                    count++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu data dosen dengan usia '" + usia + "'");
        } else if (count == 1) {
            System.out.println("Data Dosen Ditemukan:");
            hasilPencarian[0].tampil();
        } else {
            System.out.println("Data Dosen dengan usia '" + usia + "' tidak ditemukan");
        }
    }
}
