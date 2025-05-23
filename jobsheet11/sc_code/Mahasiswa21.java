package jobsheet11.sc_code;

public class Mahasiswa21 {

    String nim, nama, kelas;
    double ipk;

    public Mahasiswa21() {    
    }

    public Mahasiswa21(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk );
    }
}
