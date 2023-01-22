package by.teachmeskills.Lesson4massive;

import java.util.Arrays;
import java.util.Scanner;

public class mass2 {


       public static void main(String[] args) {
            int[] initialArray = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
           System.out.println("Исходный массив" + Arrays.toString(initialArray));
           System.out.print("Введите число для удаления из исходного массива: ");
           Scanner scanner = new Scanner(System.in);
           int numberConsole = scanner.nextInt();

           int a= 0;
           for (int i : initialArray) {
               if (numberConsole == i) {
                   a++;
               }
           }

           if (a == 0) {
               System.out.println(numberConsole + " Нет такого числа в массиве " + Arrays.toString(initialArray));
           } else {
               int[] newArray = new int[initialArray.length - a];
               for (int i = 0, j = 0; i < initialArray.length; i++) {
                   if (initialArray[i] != numberConsole) {
                       newArray[j] = initialArray[i];
                       j++;
                   }
               }
               System.out.println("Результат массива без числа " + Arrays.toString(newArray));
           }
       }
}


