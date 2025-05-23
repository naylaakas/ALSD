package jobsheet11.sc_code;

import java.util.Scanner;
public class SLLMain21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList21 sll = new SingleLinkedList21();
        int pilihan;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa di Awal");
            System.out.println("2. Tambah Data Mahasiswa di Akhir");
            System.out.println("3. Tambah Data Mahasiswa Setelah Nama Tertentu");
            System.out.println("4. Tambah Data Mahasiswa pada Index Tertentu");
            System.out.println("5. Tampilkan Semua Data Mahasiswa");
            System.out.println("6. Tampilkan Data Mahasiswa Berdasarkan Index");
            System.out.println("7. Mencari Index Mahasiswa Berdasarkan Nama");
            System.out.println("8. Hapus Data Mahasiswa di Awal");
            System.out.println("9. Hapus Data Mahasiswa di Akhir");
            System.out.println("10. Hapus Data Mahasiswa Berdasarkan Nama");
            System.out.println("11. Hapus Data Mahasiswa Berdasarkan Index");
            System.out.println("0. Keluar");
            System.out.print("Pilihan menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    sll.addFirst(inputMhs(sc));
                    break;

                case 2:
                    sll.addLast(inputMhs(sc));
                    break;

                case 3:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String key = sc.nextLine();
                    sll.insertAfter(key, inputMhs(sc));
                    break;

                case 4:
                    System.out.print("Masukkan index: ");
                    int indexTambah = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(indexTambah, inputMhs(sc));
                    break;

                case 5:
                    sll.print();
                    break;

                case 6:
                    System.out.print("Masukkan index: ");
                    int indexTampil = sc.nextInt();
                    sc.nextLine();
                    sll.getData(indexTampil);
                    break;

                case 7:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaDicari = sc.nextLine();
                    int posisi = sll.indexOf(namaDicari);
                    if (posisi != -1) {
                        System.out.println("Index mahasiswa " + namaDicari + " adalah " + posisi);
                    }
                    else {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                    break;

                case 8:
                    sll.removeFirst();
                    break;

                case 9:
                    sll.removeLast();
                    break;

                case 10:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaDihapus = sc.nextLine();
                    sll.remove(namaDihapus);
                    break;

                case 11:
                    System.out.print("Masukkan index: ");
                    int indexHapus = sc.nextInt();
                    sc.nextLine();
                    sll.removeAt(indexHapus);
                    break;
                    
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default: 
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
    
    public static Mahasiswa21 inputMhs(Scanner sc) {
        System.out.print("Masukkan NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK  : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa21(nim, nama, kelas, ipk);
    }
}