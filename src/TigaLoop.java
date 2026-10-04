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
