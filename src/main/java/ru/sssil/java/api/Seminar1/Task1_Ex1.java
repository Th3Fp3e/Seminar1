package ru.sssil.java.api.Seminar1;

import java.util.Scanner;

public class Task1_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int n = sc.nextInt();
        int res = task1(n);
        System.out.println("res = " + res);
;
    }

    private static int task1(int n) { // todo: Change method name!
        int multi = 1, sum = 0;
        while (n!=0) {
            multi *= n%10;
            sum+=n%10;
            n/=10;
        }
        return multi-sum;
    }
}
