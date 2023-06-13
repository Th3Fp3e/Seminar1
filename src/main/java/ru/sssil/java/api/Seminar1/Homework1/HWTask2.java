package ru.sssil.java.api.Seminar1.Homework1;

import java.util.Scanner;

public class HWTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int num1 = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num2 = sc.nextInt();

            if (isNumPositive(num1, num2)) {
                res += num1;
            }
            num1 = num2;
        }

        System.out.println("res = " + res);
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
