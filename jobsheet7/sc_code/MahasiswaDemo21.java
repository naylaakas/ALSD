package jobsheet7.sc_code;

import java.util.Scanner;
public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        System.out.println("------------------------------");
        sc.nextLine();

        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            System.out.println("------------------------------");
            sc.nextLine();

            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        System.out.println("------------------------------");
        list.tampil();
        System.out.println("------------------------------");
        System.out.println("         Pencarian Data       ");
        System.out.println("------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("Menggunakan binary Search");
        double posisi = list.findBinarySearching(cari, 0, jumMhs-1);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }    
}