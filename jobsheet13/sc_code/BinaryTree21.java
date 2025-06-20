package jobsheet13.sc_code;

public class BinaryTree21 {
    Node21 root;

    BinaryTree21() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    void add(Mahasiswa21 mahasiswa) {
        Node21 newNode = new Node21(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        }
        else {
            Node21 current = root;
            Node21 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node21 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            }
            else if (ipk > current.mahasiswa.ipk){
                current = current.right;
            }
            else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node21 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node21 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node21 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node21 getSuccessor(Node21 del) {
        Node21 successor = del.right;
        Node21 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node21 parent = root;
        Node21 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            }
            else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }
            else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }
        else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                }
                else {
                    if (isLeftChild) {
                        parent.left = null;
                    }
                    else {
                        parent.right = null;
                    }
                }
            }
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                }
                else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    }
                    else{
                        parent.right = current.right;
                    }
                }
            }
            else if (current.right == null){
                if (current == root) {
                    root = current.left;
                }
                else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    }
                    else {
                        parent.right = current.left;
                    }
                }
            }
            else {
                Node21 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                }
                else {
                    if (isLeftChild) {
                        parent.left = successor;
                    }
                    else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    void addRekursif(Mahasiswa21 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    Node21 addRekursif(Node21 current, Mahasiswa21 mahasiswa) {
        if (current == null) {
            return new Node21(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        }
        else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        
        Node21 current = root;
        while (current.left != null) {
            current = current.left;
        }
        
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        
        Node21 current = root;
        while (current.right != null) {
            current = current.right;
        }
        
        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    void tampilMahasiswaIPKdiAtas(Node21 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
