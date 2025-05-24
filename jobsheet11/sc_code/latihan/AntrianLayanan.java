package jobsheet11.sc_code.latihan;

public class AntrianLayanan {
    NodeMhs head;
    NodeMhs tail;
    int size;
    int currentSize;

    public AntrianLayanan(int size) {
        head = null;
        tail = null;
        this.size = size;
        currentSize = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return currentSize == size;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMhs temp = head;
            System.out.println( "Mahasiswa yang mengantri:\t");
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
            System.out.println("");
        }
        else {
            System.out.println("Antrian kosong");
        } 
    }

    public void clear() {
        head = null;
        tail = null;
        currentSize = 0;
        System.out.println("Antrian sudah dikosongkan");
    }

    public void tambah(Mhs data) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        NodeMhs temp = new NodeMhs(data, null);
        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        currentSize++;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
        else {
            System.out.println("Mahasiswa terdepan: ");
            head.data.tampilInformasi();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
        else {
            System.out.println("Mahasiswa terakhir: ");
            tail.data.tampilInformasi();
        }
    }

    public void layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
        else {
            System.out.println("Melayani 1 mahasiswa");
            head.data.tampilInformasi();
            head = head.next;
            currentSize--;
        }
    }
}