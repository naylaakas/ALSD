package jobsheet2.sc_code;

public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        System.out.println();
        Mahasiswa21 mhs2 = new Mahasiswa21("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        System.out.println();
        Mahasiswa21 mhs3 = new Mahasiswa21("Nayla Akas Oktavia", "244107020038", 3.42, "TI 1H");
        mhs3.updateIpk(3.50);
        mhs3.tampilkanInformasi();
    }
}
