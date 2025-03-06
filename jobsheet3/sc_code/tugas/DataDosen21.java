package jobsheet3.sc_code.tugas;

public class DataDosen21 {

    void dataSemuaDosen (Dosen21[] arrayOfDosen21) {
        System.out.println("--------------------Data Semua Dosen-------------------");
        for (Dosen21 dosen21 : arrayOfDosen21) {
            dosen21.cetakData();
            System.out.println("-------------------------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin (Dosen21[] arrayOfDosen21) {
        int lk = 0;
        int pr = 0;

        for (Dosen21 dosen21 : arrayOfDosen21) {
            if (dosen21.getJenisKelamin()) {
                lk++;
            }
            else {
                pr++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki: " + lk);
        System.out.println("Jumlah Dosen Perempuan: " + pr);
        System.out.println();
    }

    void rerataUsiaDosenPerJenisKelamin (Dosen21[] arrayOfDosen21) {
        int jmlLk = 0, lk = 0;
        int jmlPr = 0, pr = 0;

        for (Dosen21 dosen21 : arrayOfDosen21) {
            if (dosen21.getJenisKelamin()) {
                jmlLk += dosen21.getUsia();
                lk++;
            }
            else {
                jmlPr += dosen21.getUsia();
                pr++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Laki-laki: " + (lk > 0 ? (double) jmlLk / lk : 0));
        System.out.println("Rata-rata Usia Dosen Perempuan: " + (pr > 0 ? (double) jmlPr / pr : 0));
    }

    void infoDosenPalingTua (Dosen21[] arrayOfDosen21) {
        Dosen21 dosenPalingTua = arrayOfDosen21[0];

        for (Dosen21 dosen21 : arrayOfDosen21) {
            if (dosen21.getUsia() > dosenPalingTua.getUsia()) {
                dosenPalingTua = dosen21;
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Dosen Paling Tua: ");
        dosenPalingTua.cetakData();
        System.out.println("-------------------------------------------------------");
    }

    void infoDosenPalingMuda (Dosen21[] arrayOfDosen21) {
        Dosen21 dosenPalingMuda = arrayOfDosen21[0];

        for (Dosen21 dosen21 : arrayOfDosen21) {
            if (dosen21.getUsia() < dosenPalingMuda.getUsia()) {
                dosenPalingMuda = dosen21;
            }
        }

        System.out.println("Dosen Paling Muda: ");
        dosenPalingMuda.cetakData();
        System.out.println("-------------------------------------------------------");
    }
}
