package com.devian;

import java.util.Random;

public class Main {

    private static char[] special = {33, 35, 36, 37, 38, 43, 63, 64, 95}; // ! # $ % & + ? @ _

    public static void main(String[] args) {
        char[] uppers = new char[26];
        char[] lowers = new char[26];
        char[] numbers = new char[10];
        for (int i = 0; i < 26; i++) {
            uppers[i] = (char) (65 + i);
            lowers[i] = (char) (97 + i);
        }
        for (int i = 0; i < 10; i++) {
            numbers[i] = (char) (48 + i);
        }
        char[][] chars_1 = {uppers, lowers, numbers};
        char[][] chars_2 = {uppers, lowers, numbers, special};

        int length = 16;
        char[][] chars = chars_1;
        StringBuilder pass = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int type = random.nextInt(chars.length);
            int element = chars[type][random.nextInt(chars[type].length)];

            pass.append((char) element);
        }
        System.out.println(pass.toString());
    }
}
