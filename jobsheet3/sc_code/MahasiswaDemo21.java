package jobsheet3.sc_code;

import java.util.Scanner;
public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa21[] arrayofMahasiswa21 = new Mahasiswa21[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa21[i] = new Mahasiswa21();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayofMahasiswa21[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayofMahasiswa21[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayofMahasiswa21[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayofMahasiswa21[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------------");
        }
        System.out.println("---------------------------------------");
        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa21[i].cetakInfo();
            System.out.println("---------------------------------------");
        }
    }
}
