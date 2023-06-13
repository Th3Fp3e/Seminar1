package ru.sssil.java.api.Seminar1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(addBinary(first, second));
    }

    /**
     * @apiNote Take two binary strings and return their binary sum
     * @param a First input string
     * @param b Second input string
     * @return resulting string
     */
    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            addBinary(b, a);
        }
        int k = 0;
        int j = b.length() - 1;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                k++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                k++;
            }
            j--;
            res = k % 2 + res;
            k /= 2;
        }
        if (k == 1){
            res = k%2 + res;
        }
        return res;
    }
}
