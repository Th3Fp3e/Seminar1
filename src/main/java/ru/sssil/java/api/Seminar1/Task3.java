package ru.sssil.java.api.Seminar1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String stringNew = sc.nextLine();
        System.out.println("task3(stringNew) = " + task3(stringNew));
;
    }

    /**
     * @apiNote Returns the string with its halves swapped
     * @param str string input
     * @return resulting string
     */
    private static String task3(String str) {
        String subStr1 = str.substring(0, str.length()/2);
        String subStr2 = str.substring(str.length()/2);
        return subStr2 + subStr1;
    }
}
