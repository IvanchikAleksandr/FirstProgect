package by.teachmeskills.Lesson4massive.mnogomernye;

import java.util.Arrays;

public class Chess {
    public static void main(String[] args) {

    String[][] stringArray = new String[8][8];

    for (int i = 0; i < stringArray.length; i++) {
        for (int j = 0; j < stringArray[i].length; j++) {
            if ((i + j) % 2 == 0) {
                stringArray[i][j] = "W";
            } else {
                stringArray[i][j] = "B";
            }
        }
    }

    for (String[] strings : stringArray) {
        System.out.println(Arrays.toString(strings)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim());
    }
  }
}