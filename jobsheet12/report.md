|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020038|
| Nama |  Nayla Akas Oktavia|
| Kelas | TI - 1H |
| Repository | [link] () |

# Jobsheet 12 - DOUBLE LINKED LIST
## Percobaan 1

Ikuti langkah-langkah yang ada pada jobsheet 12 percobaan 1. 
berikut merupakan hasil running dari percobaan 1:

![Screenshot](output/p1.png)

*Jawaban Pertanyaan:* 

1. 

2. 

3. 

4.

5.

6. Modifikasi dengan menambahkan kondisi pada fungsi ```print()```
```java
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
```

7. 

8. Modifikasi menu pilihan dan switch-case agar fungsi ```insertAfter()``` masuk ke dalam menu pilihan

## Percobaan 2: Elemen pada Single Linked List

Ikuti langkah-langkah yang ada pada jobsheet 12 percobaan 2.
berikut merupakan hasil running dari percobaan 2:

![Screenshot](output/p2.png)

*Jawaban Pertanyaan:*

1. 

2. Modfikasi pada method ```removeFirst()``` dan ```removeLast()``` agar menampilkan pesan jika berhasil menghapus data

# Latihan

Menambahkan  fungsi ```add()```
Menambhakan ```removeAfter()```
Menambahkan fungsi ```remove()```
Menambahkan fungsi ```getFirst()```, ```getLast()```, ```getIndex()```
Menambahkan 


berikut hasil running latihan:

![Screenshot](output/lat1.png)

![Screenshot](output/lat2.png)

![Screenshot](output/lat3.png)

![Screenshot](output/lat4.png)

![Screenshot](output/lat5.png)



