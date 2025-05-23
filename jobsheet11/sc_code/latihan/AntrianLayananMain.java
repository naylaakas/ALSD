package jobsheet11.sc_code.latihan;
import java.util.Scanner;

public class AntrianLayananMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan maksimal jumlah antrian: "); 
        int jml = sc.nextInt();
        sc.nextInt(); 
        AntrianLayanan antrian = new AntrianLayanan(jml);
    }
}