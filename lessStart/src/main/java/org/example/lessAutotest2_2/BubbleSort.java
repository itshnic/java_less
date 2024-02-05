package org.example.lessAutotest2_2;
import java.io.File;
import java.io.FileWriter;

public class BubbleSort {
    private static File log;
    private static FileWriter (int[] arr){

    };

    public static void sort(int[] mas) {
        int n = mas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
            writeLog(mas);
        }
    }
}
