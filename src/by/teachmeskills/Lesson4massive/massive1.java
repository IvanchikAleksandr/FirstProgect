package by.teachmeskills.Lesson4massive;

import java.util.Scanner;

public class massive1 {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println(" Введите число для поиска в массиве ");
        int numberforsearch = scanner.nextInt();
        int [] integers={1,2,3,4,5,6,7,8,9,11,22};
        boolean isFound = false;
        for (int integer: integers ){
            if (numberforsearch == integer) {
                isFound= true;
                break;
               }
           }
        System.out.println(!isFound ? numberforsearch + " - нет такого числа" : numberforsearch + "число поиска" );
       }
}


