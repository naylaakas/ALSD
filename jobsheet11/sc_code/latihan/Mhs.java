package jobsheet11.sc_code.latihan;

public class Mhs {
    String nim, nama, kelas;

    public Mhs() {    
    }

    public Mhs(String nm, String name, String kls) {
        nim = nm;
        nama = name;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas);
    }
}