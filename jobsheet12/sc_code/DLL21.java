package jobsheet12.sc_code;

public class DLL21 {
    Node21 head;
    Node21 tail;
    int size;

    public DLL21() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa21 data) {
        Node21 newNode = new Node21(data);
        if (isEmpty()) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa21 data) {
        Node21 newNode = new Node21(data);
        if (isEmpty()) {
            head = tail = newNode;
        }
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(Mahasiswa21 data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index salah");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node21 newNode = new Node21(data);
        Node21 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;

        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List masih kosong, tidak bisa dihapus");
            return;
        }

        Mahasiswa21 removed = head.data;
        if (head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
        size--;

        System.out.println("Data yang dihapus: ");
        removed.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List masih kosong, tidak bisa dihapus");
            return;
        }

        Mahasiswa21 removed = tail.data;
        if (head == tail) {
            head = tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;

        System.out.println("Data yang dihapus: ");
        removed.tampil();
    }

    public void removeAfter(String keyNim) {
        Node21 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }

        Node21 toDelete = current.next;

        if (toDelete == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
        size--;

        System.out.println("Data yang dihapus: ");
        toDelete.data.tampil();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        Node21 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;

        System.out.println("Data yang dihapus: ");
        current.data.tampil();
    }

    public Node21 search(String keyNim) {
        Node21 current = head;
        while (current != null) {
            if (current.data.nim.equals(keyNim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa21 data) {
        Node21 current = head;

        //cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node21 newNode = new Node21(data);

        //jika current adlh tail, cukup tambah di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }
        else {
            //sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (!isEmpty()) {
            Node21 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
            System.out.println("");
        }
        else {
            System.out.println("Linked list masih kosong");
        }
    }

    public Node21 getFirst() {
        return head;
    }

    public Node21 getLast() {
        return tail;
    }

    public Mahasiswa21 getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid");
            return null;
        }

        Node21 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        return size;
    }
}