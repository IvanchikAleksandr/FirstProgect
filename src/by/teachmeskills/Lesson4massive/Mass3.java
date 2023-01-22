package by.teachmeskills.Lesson4massive;

import java.util.Arrays;
import java.util.Scanner;

public class Mass3 {
    public static void main(String[] args) {

    System.out.print("Размер массива: ");
    Scanner scanner = new Scanner(System.in);

    int sizeArray = scanner.nextInt();
    int[] array = new int[sizeArray];
    final int min = 0;
    final int max = 10;

    for ( int i = 0; i<array.length; i++) {
        array[i] = (int) (Math.random() * (max - min));
    }
    System.out.println("Массив: " + Arrays.toString(array));

    int Maxmassive = array[0];
    int Minmassive = array[0];
    int sum = 0;
    for(
    int arrayElement :array)

    {
        if (arrayElement > Maxmassive) {
            Maxmassive = arrayElement;
        }
        if (arrayElement < Minmassive) {
            Minmassive = arrayElement;
        }
        sum += arrayElement;
    }
    System.out.println("Максивальное значение массива : " + Maxmassive);
    System.out.println("Минимальное значение массива: " + Minmassive);

    double average = (double) sum / array.length;
    int averageNumber = (int) average;
    System.out.println("Среднее значение: " + averageNumber);

}

}
