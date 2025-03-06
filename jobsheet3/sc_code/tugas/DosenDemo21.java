package jobsheet3.sc_code.tugas;

import java.util.Scanner;
public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen yang diinginkan: ");
        int jmlDosen = sc.nextInt();
        Dosen21[]arrayOfDosen21 = new Dosen21[jmlDosen];

        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayOfDosen21[i] = new Dosen21("", "", false, 0);
            arrayOfDosen21[i].tambahData();
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("-------------------------------------------------------");

        int i = 1;
        for (Dosen21 dosen21 : arrayOfDosen21) {
            System.out.println("Data Dosen ke-" + i);
            dosen21.cetakData();
            System.out.println("-------------------------------------------------------");
            i++;
        }

        DataDosen21 dataDosen21 = new DataDosen21();
        dataDosen21.dataSemuaDosen(arrayOfDosen21);
        dataDosen21.jumlahDosenPerJenisKelamin(arrayOfDosen21);
        dataDosen21.rerataUsiaDosenPerJenisKelamin(arrayOfDosen21);
        dataDosen21.infoDosenPalingTua(arrayOfDosen21);
        dataDosen21.infoDosenPalingMuda(arrayOfDosen21);
    }
}
