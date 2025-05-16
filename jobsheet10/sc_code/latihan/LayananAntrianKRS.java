package jobsheet10.sc_code.latihan;

import java.util.Scanner;

public class LayananAntrianKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Terakhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa yang Sudah Melakukan Proses KRS");
            System.out.println("8. Jumlah Mahasiswa yang Belum Melakukan Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                
                case 2:
                    Mahasiswa[] dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani[0].tampilkanData();
                        dilayani[1].tampilkanData();
                    }
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.lihatDuaDepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    antrian.getJumlahAntrian();
                    break;

                case 7:
                    antrian.getSudahProses();
                    break;

                case 8:
                    antrian.getBelumProses();
                    break;

                case 9:
                    antrian.clear();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
