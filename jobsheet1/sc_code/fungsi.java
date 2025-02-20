package sc_code;

public class fungsi {

    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;
    
    public static void tampilkanPendapatan (int[][] stok) {
        System.out.println("Pendapatan per cabang: ");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = (stok[i][0] * hargaAglonema) + (stok[i][1] * hargaKeladi) + (stok[i][2] * hargaAlocasia) + (stok[i][3] * hargaMawar) ;
            System.out.println("RoyalGarden " + (i+1) + ": Rp " + pendapatan);
        }
    }

    public static void tampilkanStokTotal(int[][] stok) {
        int totalAglonema = 0; 
        int totalKeladi = 0;
        int totalAlocasia = 0;
        int totalMawar = 0;
        
        for (int i = 0; i < stok.length; i++) {
            totalAglonema += stok[i][0];
            totalKeladi += stok[i][1];
            totalAlocasia += stok[i][2];
            totalMawar += stok[i][3];
        }

        System.out.println();
        System.out.println("Jumlah total stok bunga: ");
        System.out.println("Aglonema: " + totalAglonema);
        System.out.println("Keladi: " + totalKeladi);
        System.out.println("Alocasia: " + totalAlocasia);
        System.out.println("Mawar: " + totalMawar);
    }
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}
        };

        stokBunga[0][0] -= 1;
        stokBunga[1][1] -= 2;
        stokBunga[2][2] -= 0;
        stokBunga[3][3] -= 5;

        tampilkanPendapatan(stokBunga);
        tampilkanStokTotal(stokBunga);
    }
}
