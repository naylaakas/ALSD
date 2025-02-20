package sc_code;

import java.util.Scanner;
public class tugas2 {

    public static double hitungVolume(double s) {
        return s * s * s;
    }

    public static double hitungLuasPermukaan(double s) {
        return 6 * s * s;
    }
    
    public static double hitungKeliling(double s) {
        return 12 * s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean kondisi = true;
        while (kondisi) {
            System.out.println("Pilih perhitungan yang ingin dilakukan:");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.print("Masukkan pilihan (1-3): ");
        
        int menu = sc.nextInt();
        if (menu < 1 || menu > 3) {
            System.out.println("Invalid. Program dihentikan.");
            break;
        }
            
        System.out.print("Masukkan panjang sisi: ");
        double sisi = sc.nextDouble();
        if (sisi <= 0) {
            System.out.println("Panjang sisi harus positif.");
            break;
        }

        switch (menu) {
            case 1:
                System.out.println("Volume kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                break;
        }
        System.out.print("Ingin melakukan perhitungan lain? (y/n): ");
            String response = sc.next();
            if (!response.equalsIgnoreCase("y")) {
                kondisi = false;
            }
            System.out.println();
        }
        
        sc.close(); 
        System.out.println("Selesai");
    }
}
