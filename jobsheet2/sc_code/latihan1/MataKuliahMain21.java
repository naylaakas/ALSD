package jobsheet2.sc_code.latihan1;

import java.nio.channels.Pipe.SourceChannel;

public class MataKuliahMain21 {
    public static void main(String[] args) {
        
        MataKuliah21 matkul1 = new MataKuliah21();
        matkul1.nama = "CTPS";
        matkul1.kodeMK = "MKCTPS";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilkanInformasi();
        System.out.println();
        MataKuliah21 matkul2 = new MataKuliah21("MKPCL", "Pancasila", 2, 4);
        matkul2.tampilkanInformasi();

        System.out.println("--------------------");
        System.out.println("percobaan:");
        matkul1.ubahSKS(3);
        matkul1.tambahJam(2);
        matkul1.tampilkanInformasi();

        System.out.println();
        
        matkul2.ubahSKS(3);
        matkul2.kurangiJam(2);
        matkul2.tampilkanInformasi();
    }
}
