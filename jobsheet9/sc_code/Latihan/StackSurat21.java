package jobsheet9.sc_code.Latihan;

public class StackSurat21 {
    Surat21[] stack;
    int top, size;

    public StackSurat21(int size) {
        this.size = size;
        stack = new Surat21[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void push(Surat21 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        }
        else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Surat21 pop() {
        if (!isEmpty()) {
            Surat21 s = stack[top];
            top--;
            return s;
        }
        else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Surat21 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }

    public void cariSurat(String cari) {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return;
        } 
        else {
            boolean found = false;
            for (int i = 0; i <= top; i++) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                    System.out.println("-----------------------------");
                    System.out.println("Surat yang ditemukan: " + stack[i].namaMahasiswa);
                    stack[i].cetakSurat();
                    found = true;
                }
            }
            if (!found) {
                System.out.printf("Surat dengan nama %s tidak ditemukan.", cari);
            }
        }
    }
}
