package jobsheet2.sc_code.latihan1;

public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Dosen21(){
    }

    Dosen21(String id, String nm, boolean aktif, int th, String keahlian){
        idDosen = id;
        nama = nm;
        statusAktif = aktif;    
        tahunBergabung = th;
        bidangKeahlian = keahlian;
    }
    
    void tampilInformasi(){
        System.out.println("ID Dosen: "+ idDosen);
        System.out.println("Nama Dosen: "+ nama);
        System.out.println("Status Aktif: "+ statusAktif);
        System.out.println("Tahun Bergabung: "+ tahunBergabung);
        System.out.println("Bidang Keahlian: "+ bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
        
    }

    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}