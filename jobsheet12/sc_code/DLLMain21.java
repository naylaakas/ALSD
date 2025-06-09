package jobsheet12.sc_code;

import java.util.Scanner;

public class DLLMain21 {
    public static void main(String[] args) {
        DLL21 list = new DLL21();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data setelah NIM tertentu");
            System.out.println("4. Tambah data di indeks tertentu");
            System.out.println("5. Hapus data di awal");
            System.out.println("6. Hapus data di akhir");
            System.out.println("7. Hapus data setelah NIM tertentu");
            System.out.println("8. Hapus data di indeks tertentu");
            System.out.println("9. Tampilkan semua data");
            System.out.println("10. Tampilkan data paling awal");
            System.out.println("11. Tampilkan data paling akhir");
            System.out.println("12. Tampilkan data di indeks tertentu");
            System.out.println("13. Tampilkan jumlah data saat ini");
            System.out.println("14. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                Mahasiswa21 mhs = inputMahasiswa(sc);
                list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa21 mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("Masukkan NIM yang ditentukan: ");
                    String key = sc.nextLine();
                    list.insertAfter(key, inputMahasiswa(sc));
                }
                case 4 -> {
                    System.out.print("Masukkan index yang ditentukan: ");
                    int indexTambah = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa21 mhs = inputMahasiswa(sc);
                    list.add(mhs, indexTambah);
                }
                case 5 -> {
                    Mahasiswa21 dataDihapus = list.head.data;
                    list.removeFirst();
                    System.out.println("Data berhasil dihapus. Data yang terhapus adalah:");
                    dataDihapus.tampil();
                }
                case 6 -> {
                    Mahasiswa21 dataDihapus = list.tail.data;
                    list.removeLast();
                    System.out.println("Data berhasil dihapus. Data yang terhapus adalah:");
                    dataDihapus.tampil();
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang ditentukan: ");
                    String key = sc.nextLine();
                    list.removeAfter(key);
                }
                case 8 -> {
                    System.out.print("Masukkan index yang akan dihapus: ");
                    int indexHapus = sc.nextInt();
                    sc.nextLine();
                    list.remove(indexHapus);
                }
                case 9 -> list.print();
                case 10 -> {
                    if (list.isEmpty()) {
                        System.out.println("List masih kosong");
                    } else {
                        System.out.println("Data paling awal:");
                        list.head.data.tampil();
                    }
                }
                case 11 -> {
                    if (list.isEmpty()) {
                        System.out.println("List masih kosong");
                    } else {
                        System.out.println("Data paling akhir:");
                        list.tail.data.tampil();
                    }
                }
                case 12 -> {
                    System.out.print("Masukkan index yang ingin ditampilkan: ");
                    int indexTampil = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa21 dataIndex = list.getIndex(indexTampil);
                    if (dataIndex != null) {
                        System.out.println("Data pada indeks " + indexTampil + ":");
                        dataIndex.tampil();
                    }
                }
                case 13 -> System.out.println("Jumlah data saat ini: " + list.size);
                case 14 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node21 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    }
                    else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 0 -> System.out.println("Keluar dari program");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    public static Mahasiswa21 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa21(nim, nama, kelas, ipk);
    }
}
