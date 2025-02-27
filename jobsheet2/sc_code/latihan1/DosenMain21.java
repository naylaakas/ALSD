package jobsheet2.sc_code.latihan1;

public class DosenMain21 {
    public static void main(String[] args) {
        Dosen21 dosen1 = new Dosen21();
        dosen1.idDosen = "Dos01";
        dosen1.nama = "Akbar";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Fisika";

        dosen1.tampilInformasi();
        System.out.println();

        Dosen21 dosen2 = new Dosen21("Dos2", "Daniel", false, 2011, "Kimia");
        dosen2.tampilInformasi();

        System.out.println("--------------------");
        System.out.println("Percobaan:");
        dosen1.setStatusAktif(false);
        dosen1.tampilInformasi();
        dosen1.hitungMasaKerja(2025);
        System.out.println("Masa Kerja Dosen " + dosen1.nama + " adalah " +dosen1.hitungMasaKerja(2025) + " tahun");
        System.out.println();

        dosen2.ubahKeahlian("Biologi");
        dosen2.setStatusAktif(true);
        dosen2.tampilInformasi();
        dosen2.hitungMasaKerja(2025);
        System.out.println("Masa Kerja Dosen " + dosen2.nama + " adalah " +dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
