package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][][][][] threeD = new int[5][5][5][5][5];


        //2d arrays
        //int n = new Scanner(System.in).nextInt();
//
//        int[][] newArr = new int[10][5];
//
//        //is an array of arrays
//
//        //0 [0][] --> 0
//        //1 [1][]
//
//        for(int i = 0; i < newArr.length; i++) {
//            for(int j = 0; j < newArr[0].length; j++) {
//                newArr[i][j] = 5;
//            }
//        }
//
//        for(int i = 0; i < newArr.length; i++) {
//            for(int j = 0; j < newArr[0].length; j++) {
//                System.out.print(newArr[i][j]);
//            }
//
//            System.out.println();
//        }
//
//        System.out.println("_________________");
//        for(int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
        System.out.println("Please enter a number");
        simpleSquare(new Scanner(System.in).nextInt());


    }

    public static void simpleSquare(int n){

        int mid = n / 2;

        for(int i = 0 ; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j == 0 || j == n - 1) {
                    System.out.print(" 1 ");
                } else if(i == 0 || i == n - 1) {
                    System.out.print(" 2 ");
                } else if(i == j) {
                    System.out.print(" 3 ");
                } else if(i + j == n - 1) {
                    System.out.print(" 4 ");
                } else if(i == mid) {
                    System.out.print(" 5 ");
                } else if(j == mid) {
                    System.out.print(" 6 ");
                }
                else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

    }
}