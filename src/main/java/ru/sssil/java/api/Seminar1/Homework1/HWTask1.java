package ru.sssil.java.api.Seminar1.Homework1;

import java.util.Scanner;

public class HWTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("reverseString(s) = " + reverseString(s));
    }

    /**
     * @apiNote Takes one string and reverses all the words inside it, ignoring spaces
     * @param str input string
     * @return resulting string
     */
    private static String reverseString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        String res = " ";
        String[] words = str.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; i--) {
            res += words[i] + " ";
        }
        return res + words[0];
    }
}
