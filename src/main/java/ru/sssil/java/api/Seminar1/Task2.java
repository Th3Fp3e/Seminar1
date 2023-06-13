package ru.sssil.java.api.Seminar1;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num1 = sc.nextInt();

        for (int i = 0; i < n; i++){
            int num2 = sc.nextInt();

            if (isNumPositive(num1, num2)){
                count++;
            }
            num1 = num2;
        }

        System.out.println("Count = " + count);
    }

    /**
     * @apiNote Checks if number is valid
     * @param a current number
     * @param b next number
     * @return
     */
    private static boolean isNumPositive(int a, int b) {
        return  a >= 0 && b < 0;
    }
}
