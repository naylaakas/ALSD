package sc_code;

import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUas = sc.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("nilai tidak valid");
        System.out.println("==============================");
        System.out.println("==============================");
        return; 
        }

        double nilaiFinal = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUts) + (0.4 * nilaiUas);

        String huruf;

        if (nilaiFinal >= 80) {
            huruf = "A";
        } 
        else if (nilaiFinal >= 73) {
            huruf = "B+";
        } 
        else if (nilaiFinal >= 65) {
            huruf = "B";
        }
        else if (nilaiFinal >= 60) {
            huruf = "C+";
        }
        else if (nilaiFinal >= 50) {
            huruf = "C";
        }
        else if (nilaiFinal >= 39) {
            huruf = "D";
        }
        else {
            huruf = "E";
        }

        System.out.printf("Nilai Akhir: %.2f%n", nilaiFinal);
        System.out.println("Nilai Huruf: " + huruf);

        System.out.println("==============================");
        System.out.println("==============================");

        String keterangan = (huruf.equals("A") || huruf.equals("B+") || huruf.equals("B") || huruf.equals("C+") || huruf.equals("C")) ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS";
        System.out.println(keterangan);
    }
}
