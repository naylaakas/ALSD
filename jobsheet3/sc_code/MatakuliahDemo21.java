package jobsheet3.sc_code;

import java.util.Scanner;
public class MatakuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Matakuliah yang diinginkan: ");
        int elemenMk = sc.nextInt();
        Matakuliah21[]arrayOfMatakuliah21 = new Matakuliah21[elemenMk];
        

        for (int i = 0; i < elemenMk; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah21[i] = new Matakuliah21("", "", 0, 0);
            arrayOfMatakuliah21[i].tambahData();
            System.out.println("-----------------------------------");
        }
        System.out.println("-----------------------------------");

        for (int i = 0; i < elemenMk; i++) {
            arrayOfMatakuliah21[i].cetakInfo();
            System.out.println("-----------------------------------");
        }
    }
}
