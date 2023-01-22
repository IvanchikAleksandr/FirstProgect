package by.teachmeskills.Lesson4massive;

import java.util.Arrays;

public class Massive4 {
    public static void main(String[] args) {
    final int min = 0;
    final int max = 10;

    int[] firstArray = new int[5];
    int[] secondArray = new int[5];

    for (int i = 0; i < firstArray.length; i++) {
        firstArray[i] = (int) (Math.random() * (max - min));
    }
    for (int i = 0; i < secondArray.length; i++) {
        secondArray[i] = (int) (Math.random() * (max - min));
    }

    System.out.println("Первый массив: " + Arrays.toString(firstArray));
    System.out.println("Второй массив: " + Arrays.toString(secondArray));

    int sumFirstArray = 0;
    int sumSecondArray = 0;

    for (int firstArrayElement : firstArray) {
        sumFirstArray += firstArrayElement;
    }
    for (int secondArrayElement : secondArray) {
        sumSecondArray += secondArrayElement;
    }

    double averageFirstArray = (double) sumFirstArray / firstArray.length;
    double averageSecondArray = (double) sumSecondArray / secondArray.length;

    if (averageFirstArray > averageSecondArray) {
        System.out.println("Среднее для первого массива больше = " + averageFirstArray);
    }
    else if (averageFirstArray == averageSecondArray) {
        System.out.println("Среднее значение для первого массива " + averageFirstArray + " = Среднее значение для второго массива " + averageSecondArray);
    }
    else {
        System.out.println("Среднее значение для второго массива больше = " + averageSecondArray);
    }
}
}

