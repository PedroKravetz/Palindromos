package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        if (palavra.equals(reverse(palavra))) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        sc.close();
    }

    /**
     * Faz a String ser invertida, ou seja, de trás para frente
     *
     * @param string String - A String que será invertida
     * @return String - A String invertida
     */
    public static String reverse(String string) {
        if (string.length() == 0)
            return "";
        return reverse(string.substring(1)) + string.charAt(0);
    }
}