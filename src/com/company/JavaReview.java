package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class JavaReview {
        public static void main(String[] args) {
            //name of scanner 0 -> Scan0
            //name of scanner 1 -> Scan1
            //name of scanner 2 -> Scan2
            //name of scanner 3 -> Scan3 (for checking if re-entry is correct)
            //Name of scanner 4 -> Scan4
            //name of scanner 5 -> Scan5
            //name of username input variable -> UserName
            //name of password input variable -> PassWord
            //name of password input reentry variable -> Reenter

            //Username Input starts here
            String Analyzer = "CREATE";
            String CREATE = "CREATE";
            String BeginInputString = "";
            int Checksum = 0 ;

            Scanner Scan0 = new Scanner(System.in);  // Creates a Scanner object
            System.out.println("Write in verbatim CREATE or LOGIN");
            String BeginInput = Scan0.nextLine();

            while (Objects.equals(BeginInput, CREATE)) {
                Scanner Scan1 = new Scanner(System.in);  // Creates a Scanner object
                System.out.println("Enter Username");   //Text/prompt that is above the Input "field"
                String UserName = Scan1.nextLine();  // Reads user input, "nextLine();" is for reading strings, other data types can be there "
                System.out.println("Username is: " + UserName);  // Outputs user input
                //Username Input Done
                //Password Input starts
                String PassWord = null;
                String PassWordReenter = null;
                Scanner Scan2 = new Scanner(System.in);
                System.out.println("Enter Password");
                PassWord = Scan2.nextLine();
                //reenter scanner field
                Scanner Scan3 = new Scanner(System.in);
                System.out.println("Enter Password Again");
                PassWordReenter = Scan3.nextLine();
                while (Objects.equals(PassWord, PassWordReenter)==false) {
                    System.out.println("TWO PASSWORDS ENTRIES DID NOT MATCH ^_-RETRY-_^");
                    //Password Input starts
                    Scanner Scan4 = new Scanner(System.in);
                    System.out.println("Enter Password");
                    PassWord = Scan4.nextLine();
                    //reenter scanner field
                    Scanner Scan5 = new Scanner(System.in);
                    System.out.println("Enter Password Again");
                    PassWordReenter = Scan5.nextLine();
                }

                System.out.println("SUCCESS, DO NOT ATTEMPT TO LOGIN, SYSTEM STILL IN PROGRESS");
                CREATE = "0";

            }
            System.out.println("FAILED. REMEMBER TO WRITE ALL CAPS EXACTLY, CREATE OR LOGIN --- CREATE AGAIN - LOGIN SYSTEM STILL BEING BUILT");
            CREATE = "0";

        }

        }




