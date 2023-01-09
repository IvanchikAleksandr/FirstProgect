package by.teachmeskills.lesson6;

import java.util.Scanner;

public class newcard1 {
    public static void main(String[] args) {

        int numbercard1;
        int balancecard1;
        int numbercard2;
        int balancecard2;
        int numbercard3;
        int balancecard3;


        Scanner Sc = new Scanner(System.in);

        System.out.print("Номер счёта1: ");
        numbercard1 = Sc.nextInt();

        System.out.print("Остаток1: ");
        balancecard1 = Sc.nextInt();

        System.out.print("Номер счёта2: ");
        numbercard2 = Sc.nextInt();

        System.out.print("Остаток2: ");
        balancecard2 = Sc.nextInt();

        System.out.print("Номер счёта3: ");
        numbercard3 = Sc.nextInt();

        System.out.print("Остаток3: ");
        balancecard3 = Sc.nextInt();

        balancecard1 = balancecard1 + Sc.nextInt();
        balancecard2 = balancecard2 + Sc.nextInt();
        balancecard3 = balancecard3 - Sc.nextInt();




        System.out.println("Номер счёта: " + numbercard1);
        System.out.println("Остаток: " + balancecard1);
        System.out.println("Номер счёта: " + numbercard2);
        System.out.println("Остаток: " + balancecard2);
        System.out.println("Номер счёта: " + numbercard3);
        System.out.println("Остаток: " + balancecard3);
        }
    }

