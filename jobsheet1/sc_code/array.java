package sc_code;

import java.util.Scanner;
public class array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mataKuliah[] = new String[8];
        int sks[] = new int[mataKuliah.length];
        String nilaiHuruf[] = new String[mataKuliah.length];
        double nilaiAngka[] = new double[mataKuliah.length];
        double bobotNilai[] = new double[mataKuliah.length];

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        int totalSks = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nama MK ke-" + (i+1) + ": ");
            mataKuliah[i] = sc.nextLine();
            System.out.print("Masukkan nilai MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            System.out.print("Masukkan jumlah SKS MK " + mataKuliah[i] + ": ");
            sks[i] = sc.nextInt();

            totalSks += sks[i];
            sc.nextLine();
        }

        for (int i = 0; i < mataKuliah.length; i++) {
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
        }
        
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobotNilai = 0;
        for (int i =0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-20s %-20s %-20s\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobotNilai += bobotNilai[i];
        }

        double ip = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            ip += sks[i] * bobotNilai[i];
        }

        ip /= totalSks;
        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ip);
    }
}
