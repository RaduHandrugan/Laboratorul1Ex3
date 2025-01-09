/*
3. Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător.
 */


package Exercitiu3Tema;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        boolean OK = true;
        System.out.println("Introduceti numarul dorit: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("N=" + n);
        System.out.println("\n");

        System.out.println("Divizorii numarului ales sunt: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

                if (i != 1 && i != n) {
                    OK = false;
                }


            }
        }
            if (OK && n > 1) {
                System.out.println("Numarul ales este PRIM");
            } else {
                System.out.println("Numarul ales NU este PRIM");

            }


    }
}