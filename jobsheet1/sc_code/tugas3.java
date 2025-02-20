package sc_code;

import java.util.Scanner;
public class tugas3 {
    
    static int n;
    static String[] mk;
    static String[] hari;
    static int[] sks;
    static int[] semester;
    static String inputanhari, inputannama;
    static int inputansemester;

    public static void inputdata() {
    Scanner sc = new Scanner(System.in);    
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama MK ke-" + (i + 1) + ": ");
            mk[i] = sc.nextLine();
            System.out.print("Masukkan jumlah SKS MK: ");
            sks[i] = sc.nextInt();
            System.out.print("Masukkan semester MK: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Masukkan hari MK: ");
            hari[i] = sc.nextLine();
        }
        System.out.println();
    }

    public static void tampildata() {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-20d %-20d %-20s\n", mk[i], sks[i], semester[i], hari[i]);
        }
    }

    public static void carihari() {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

        boolean found = false;
        for (int i = 0; i < mk.length; i++) {
            if (hari[i].equalsIgnoreCase(inputanhari)) {
                System.out.printf("%-40s %-20d %-20d %-20s\n", mk[i], sks[i], semester[i], hari[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Mata kuliah pada hari " + inputanhari + " tidak ditemukan");
        }
    }

    public static void searchnama() {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

        boolean found = false;
        for (int i = 0; i < mk.length; i++) {
            if (mk[i].equalsIgnoreCase(inputannama)) {
                System.out.printf("%-40s %-20d %-20d %-20s\n", mk[i], sks[i], semester[i], hari[i]);
                found = true; 
            }
        }
        if (!found) {
            System.out.println("Mata kuliah dengan nama " + inputannama + " tidak ditemukan");
        }
    }

    public static void carisemester() {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

        boolean found = false;
        for (int i = 0; i < mk.length; i++) {
            if (semester[i] == inputansemester) {
                System.out.printf("%-40s %-20d %-20d %-20s\n", mk[i], sks[i], semester[i], hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah pada semester " + inputansemester + " tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = sc.nextInt();
        sc.nextLine(); 

        // Initialize arrays
        mk = new String[n];
        hari = new String[n];
        sks = new int[n];
        semester = new int[n];

        inputdata();

        while (true) {
            System.out.println("DATA MATA KULIAH");
            System.out.println("1. Menampilkan data mata kuliah");
            System.out.println("2. Mencari mata kuliah berdasarkan hari");
            System.out.println("3. Mencari mata kuliah berdasarkan semester");
            System.out.println("4. Mencari mata kuliah berdasarkan nama matkul");
            System.out.println("5. Keluar");
            System.out.println();

            System.out.print("Masukkan pilihan menu: ");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (menu) {
                case 1:
                    tampildata();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Masukkan hari mata kuliah: ");
                    inputanhari = sc.nextLine();
                    carihari();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Masukkan semester mata kuliah: ");
                    inputansemester = sc.nextInt();
                    carisemester();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    inputannama = sc.nextLine();
                    searchnama();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Menu selesai");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }
}
