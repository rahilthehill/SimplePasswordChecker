//package com.company;
//
//public class Random1 {
//
//    public static void main(String[] args) {
//
//        class solution {
//
//            public int romanToInt(String roman) {
//                int s = 0; // real value //
//                for (int i = 0; i < roman.length(); i++) {
//                    char CharacterVariable = roman.charAt(i);
//                    CharacterVariable = CDLV;
//
//                    switch (CharacterVariable) {
//                        case 'I':
//                            s = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'V' || roman.charAt(i + 1) == 'X'))
//                                    ? s - 1
//                                    : s + 1;
//                            break;
//                        case 'V':
//                            s += 5;
//                            break;
//                        case 'X':
//                            s = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'L' || roman.charAt(i + 1) == 'C'))
//                                    ? s - 10
//                                    : s + 10;
//                            break;
//                        case 'L':
//                            s += 50;
//                            break;
//                        case 'C':
//                           s = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'D' || roman.charAt(i + 1) == 'M'))
//                                    ? s - 100
//                                    : s + 100;
//                            break;
//                        case 'D':
//                            s += 500;
//                            break;
//                        case 'M':
//                            s += 1000;
//                            break;
//                    }
//                }
//                System.out.println(s);
//                return s;
//            }
//
//
//            }
//        }
//
//    }
//
//
//
