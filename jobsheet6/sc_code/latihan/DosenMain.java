package jobsheet6.sc_code.latihan;

import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DataDosen dataDosen = new DataDosen();
    int pilihan;

    do {
        System.out.println("-------* Menu *-------");
        System.out.println("1. Tambah Data Dosen");
        System.out.println("2. Tampilkan Data Dosen");
        System.out.println("3. Sorting ASC Dosen");
        System.out.println("4. Sorting DSC Dosen");
        System.out.println("5. Keluar");
        System.out.print("Pilih opsi: ");
        pilihan = sc.nextInt();
        System.out.println("----------------------");
        sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Kode Dosen: ");
                String kode = sc.nextLine();
                System.out.print("Masukkan Nama Dosen: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Jenis Kelamin (true=Lk, false=Pr): ");
                boolean jenisKelamin = sc.nextBoolean();
                System.out.print("Masukkan Usia Dosen: ");
                int usia = sc.nextInt();
                System.out.println("----------------------");
                sc.nextLine();

                Dosen dsn = new Dosen(kode, nama, jenisKelamin, usia);
                dataDosen.tambah(dsn);
                break;
            case 2:
                dataDosen.tampil();
                break;
            case 3:
                dataDosen.SortingASC();
                dataDosen.tampil();
                System.out.println("Data telah diurutkan secara ASC");

                break;
            case 4:
                dataDosen.SortingDSC();
                dataDosen.tampil();
                System.out.println("Data telah diurutkan secara DSC");
                break;
            case 5:
                System.out.println(" Keluar dari Program");
                System.out.println("----------------------");
                break;
            default:
                System.out.println("Pilihan Invalid!");
            }
        } while (pilihan != 5);
    }
}
