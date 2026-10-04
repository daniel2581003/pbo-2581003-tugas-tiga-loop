import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        //looping for
        System.out.print("for      : ");
        for (int a = 1; a <= n; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        //looping while
        System.out.print("while    : ");
        int b = 1;
        while (b <= n) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();

        //looping do-while
        System.out.print("do-while : ");
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        } while (c <= n);
        System.out.println();

        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println();
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // ===== 4. Saring deret 1-10 dengan continue dan break =====
        int sampaiPrintln = 0;
        System.out.print("Disaring : ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.print(i + " ");
            sampaiPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + sampaiPrintln + " kali");

    }
}

//Batas deret (n) : 5
//
//===== SATU DERET, TIGA LOOP =====
//for      : 1 2 3 4 5
//while    : 1 2 3 4 5
//do-while : 1 2 3 4 5
//
//i <  n berputar : 4 kali
//i <= n berputar : 5 kali
//Disaring : 1 3 5 7
//Sampai println  : 4 kali
//
//Process finished with exit code 0

//Batas deret (n) : 0
//
//===== SATU DERET, TIGA LOOP =====
//for      :
//while    :
//do-while : 1
//
//i <  n berputar : 0 kali
//i <= n berputar : 0 kali
//Disaring : 1 3 5 7
//Sampai println  : 4 kali
//
//Process finished with exit code 0

//Kesimpulan:
//do-while mengecek kondisinya sesudah badan loop dijalankan,
//jadi badannya pasti jalan minimal sekali.


//Loop tidak berhenti di i = 8 karena di dalam badan loop, continue
//ditulis sebelum break. Saat i = 8, kondisi (i % 2 == 0) bernilai true,
//sehingga continue langsung lompat ke iterasi berikutnya dan baris
// "if (i > 7) break;" tidak pernah dieksekusi untuk i = 8.
//Angka ganjil pertama yang lebih besar dari 7 adalah i = 9; baru di sini
//continue tidak aktif, sehingga break tercapai dan loop berhenti.
//
