package jobsheet13.sc_code;

public class BinaryTreeArrayMain21 {
    public static void main(String[] args) {
        BinaryTreeArray21 bta = new BinaryTreeArray21();

        // Mahasiswa21 mhs1 = new Mahasiswa21("244160121", "Ali", "A", 3.57);
        // Mahasiswa21 mhs2 = new Mahasiswa21("244160185", "Candra", "C", 3.41);
        // Mahasiswa21 mhs3 = new Mahasiswa21("244160221", "Badar", "B", 3.75);
        // Mahasiswa21 mhs4 = new Mahasiswa21("244160220", "Dewi", "B", 3.35);
        // Mahasiswa21 mhs5 = new Mahasiswa21("244160131", "Devi", "A", 3.48);
        // Mahasiswa21 mhs6 = new Mahasiswa21("244160205", "Ehsan", "D", 3.61);
        // Mahasiswa21 mhs7 = new Mahasiswa21("244160170", "Fizi", "B", 3.86);

        // Mahasiswa21[] dataMahasiswa21s = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        // int idxLast = 6;
        // bta.populateData(dataMahasiswa21s, idxLast);
        // System.out.println("\nInOrder Traversal Mahasiswa: ");
        // bta.traverseInOrder(0);

        Mahasiswa21[] initialData = {
            new Mahasiswa21("123", "Ali", "A", 3.57),
            new Mahasiswa21("124", "Budi", "B", 3.85)
        };
        bta.populateData(initialData, 1);
        
        bta.add(new Mahasiswa21("125", "Citra", "C", 3.21));

        System.out.println("PreOrder Traversal:");
        bta.traversePreOrder(0);
    }
}
