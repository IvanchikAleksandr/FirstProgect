package by.teachmeskills.Lesson4massive.mnogomernye;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mass1 {
    public static void main(String[] args) {

    int[][][] array = new int[3][3][3];
    System.out.print("Введите число для увелечения: ");
    Scanner scanner = new Scanner(System.in);
    int numberToAdd = scanner.nextInt();
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                array[i][j][k] = random.nextInt(10);
            }
        }
    }

    System.out.println("Исходный массив: ");
    for (int[][] b : array) {
        System.out.println(Arrays.deepToString(b));
    }

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                array[i][j][k] += numberToAdd;
            }
        }
    }

    System.out.println("Результат массива: ");
    for (int[][] b : array) {
        System.out.println(Arrays.deepToString(b));
    }
  }
}
