package com.company;

public class SimplePasswordChecker {

    public class Main {

        //
        //
        //
        public static void main(String[] args) {

            System.out.println(roman("IIIVVXX"));

        }

        public static int roman(String s) {
            int total = 0;
            char currentChar = 'a';
            char prevChar = 'a';

            for(int i = 0; i < s.length(); i++) {
                currentChar = s.charAt(i);

                switch(currentChar) {
                    case 'I' -> total = total + 1;
                    case 'V' -> total += prevChar == 'I'  ? 3 : 5;
                    case 'X' -> total += prevChar == 'I'  ? 8 : 10;
                    case 'D' -> total += prevChar == 'I'  ? 12 : 14;
                }
                prevChar = currentChar;

            }

            return total;
        }
    }




}
