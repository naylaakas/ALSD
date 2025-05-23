package jobsheet11.sc_code;

public class SLLpercobaan2 {
    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21();

        sll.addFirst(new Mahasiswa21("11111", "Adit", "1A", 3.7));
        sll.addFirst(new Mahasiswa21("22222", "Bimon", "1A", 3.8));
        sll.addFirst(new Mahasiswa21("33333", "Cintia", "1A", 3.5));
        sll.addFirst(new Mahasiswa21("44444", "Dirga", "1A", 3.6));

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
