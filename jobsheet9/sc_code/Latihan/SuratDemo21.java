package jobsheet9.sc_code.Latihan;
import java.util.Scanner;

public class SuratDemo21 {
    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);
        StackSurat21 stack = new StackSurat21(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.println("------------------------");
                    System.out.println("Masukkan Data Surat Izin");
                    System.out.println("------------------------");
                    System.out.print("ID Surat Izin    : ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa   : ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas            : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenisIzin = Character.toUpperCase(sc.next().charAt(0));
                    if (jenisIzin != 'S' && jenisIzin != 'I') {
                        System.out.println("Jenis Izin tidak valid");
                        break;
                    }
                    System.out.print("Durasi Surat     : ");
                    int durasi = sc.nextInt();
                    Surat21 surat = new Surat21(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("------------------------");
                    System.out.printf("Surat Izin %s berhasil dikumpulkan\n", surat.namaMahasiswa);
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Tidak ada Surat Izin yang dikumpulkan");
                        break;
                    }
                    Surat21 diproses = stack.pop();
                    System.out.println();
                    System.out.println("Memproses Surat Izin Dari " + diproses.namaMahasiswa);
                    diproses.cetakSurat();
                    break;

                case 3:
                    Surat21 lihatSurat = stack.peek();
                    if (lihatSurat != null) { 
                        System.out.println();
                        System.out.println("Surat Izin terakhir dikumpulkan oleh " + lihatSurat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Cari Surat Izin Berdasarkan Nama Mahasiswa");
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String dicari = sc.next();
                    stack.cariSurat(dicari.toLowerCase());
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
        while (pilih >= 1 && pilih <= 4);
    }
}
