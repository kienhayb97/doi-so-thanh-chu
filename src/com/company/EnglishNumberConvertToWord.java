package com.company;

import java.util.Scanner;

public class EnglishNumberConvertToWord {
    public static String numberToWord(int number) {
        String toWord = "";
        switch (number) {
            case 1:
                toWord = "One";
                break;
            case 2:
                toWord = "Two";
                break;
            case 3:
                toWord = "Three";
                break;
            case 4:
                toWord = " Four";
                break;
            case 5:
                toWord = " Five";
                break;
            case 6:
                toWord = "Six";
                break;
            case 7:
                toWord = "Seven";
                break;
            case 8:
                toWord = "Eight";
                break;
            case 9:
                toWord = "Nine";
                break;
            case 10:
                toWord = "ten";
                break;
            case 11:
                toWord = "eleven";
                break;
            case 12:
                toWord = "twelve";
                break;
            case 13:
                toWord = "thirdteen";
                break;
            case 15:
                toWord = "fifteen";
                break;
        }
        return toWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if((number > 0 && number <= 13) || number == 15) {
            System.out.println(numberToWord(number));
        } else if (number != 15 && number > 13 && number <= 19) {
            int ones = number % 10;
            System.out.print(numberToWord(ones) + "teen");
        } else if (number >= 20 && number < 100) {
            int ones = number % 10;
            int tens = (number - ones) / 10;
            String tensName = "";
            switch (tens) {
                case 2:
                    tensName = "Twenty ";
                    break;
                case 3:
                    tensName = "Thirty ";
                    break;
                case 5:
                    tensName = "Fifty ";
                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    tensName = numberToWord(tens) + "ty ";
                    break;
            }
            System.out.println(tensName + numberToWord(ones));
        } else if (number >= 100 && number < 1000) {
            int ones = (number % 100) % 10;
            int tens = (number % 100) / 10;
            int hundreds = number / 100;
            String numberName = "";
            String hundredName = numberToWord(hundreds) + " hundred ";
            numberName += hundredName;

            switch (tens) {
                case 0:
                    numberName += " and " + numberToWord(ones);

                    break;
                case 1:
                    switch (ones) {
                        case 0:
                            numberName += " and " + numberToWord(10);
                            break;
                        case 1:
                            numberName += numberToWord(11);
                            break;
                        case 2:
                            numberName += numberToWord(12);
                            break;
                        case 3:
                            numberName += numberToWord(13);
                            break;
                        case 5:
                            numberName += numberToWord(15);
                            break;
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            numberName += numberToWord(ones) + "teen";
                            break;
                    }
                    break;
                case 2:
                    numberName += " Twenty " + numberToWord(ones);

                    break;
                case 3:
                    numberName += " Thirty " + numberToWord(ones);

                    break;
                case 5:
                    numberName += " Fifty " + numberToWord(ones);

                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    numberName += numberToWord(tens)+ "ty " + numberToWord(ones);
                    break;
            }
            System.out.println(numberName);
        }
    }
}
