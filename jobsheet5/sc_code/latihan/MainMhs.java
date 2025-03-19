package jobsheet5.sc_code.latihan;

public class MainMhs {
    public static void main(String[] args) {
        mhs[] mahasiswa = {
            new mhs("Ahmad", "220101001", 2022, 78, 82),
            new mhs("Budi", "220101002", 2022, 85, 88),
            new mhs("Cindy", "220101003", 2021, 90, 87),
            new mhs("Dian", "220101004", 2021, 76, 79),
            new mhs("Eko", "220101005", 2023, 92, 95),
            new mhs("Fajar", "220101006", 2020, 88, 85),
            new mhs("Gina", "220101007", 2023, 80, 83),
            new mhs("Hadi", "220101008", 2020, 82, 84),
        };

        System.out.println("---------------------------");
        int utsTinggi = mahasiswa[0].tertinggiUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nilai UTS tertinggi : " + utsTinggi);
        int utsRendah = mahasiswa[0].terendahUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nilai UTS terendah  : " + utsRendah);
        double rerataUAS = mahasiswa[0].rataRataUAS(mahasiswa);
        System.out.println("Rata-rata nilai UAS : " + rerataUAS);
        System.out.println("---------------------------");

    }
}
