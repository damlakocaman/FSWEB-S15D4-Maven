package org.example;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // Palindrome testleri
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        // Binary dönüşüm testleri
        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));
    }

    // Palindrome kontrolü
    public static boolean checkForPalindrome(String text) {

        text = text.toLowerCase();

        text = text.replaceAll("[^a-z0-9]", "");

        String reversed = new StringBuilder(text).reverse().toString();

        return text.equals(reversed);
    }

    // Decimal -> Binary dönüşümü
    public static String convertDecimalToBinary(int number) {

        if (number == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {

            int remainder = number % 2;

            stack.push(remainder);

            number = number / 2;
        }

        StringBuilder binary = new StringBuilder();

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}