package jobsheet11.sc_code.latihan;
import java.util.Scanner;

public class AntrianLayananMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan maksimal jumlah antrian: "); 
        int jml = sc.nextInt();
        AntrianLayanan antrian = new AntrianLayanan(jml);

        int pilihan;
        do {
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1. Menambah Antrian");
            System.out.println("2. Melayani Antrian");
            System.out.println("3. Menampilkan Seluruh Antrian");
            System.out.println("4. Menampilkan Antrian Terdepan");
            System.out.println("5. Menampilkan Antrian Terakhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Cek Antrian Kosong");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh, tidak bisa menambah antrian");
                        break;
                    }
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mhs mhs = new Mhs(nim, nama, kelas);
                    antrian.tambah(mhs);
                    break;
            
                case 2:
                    antrian.layaniMahasiswa();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.lihatTerdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getCurrentSize()); 
                    break;

                case 7:
                    System.out.println(antrian.isFull() ? "Antrian penuh" : "Antrian tidak penuh");
                    break;

                case 8:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong" : "Antrian penuh");
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