package com.company;

import java.util.Scanner;

public class VietnameseNumberToWord {
    public static String numberToWord(int number) {
        String toWord = "";
        switch (number) {
            case 1:
                toWord = "Một";
                break;
            case 2:
                toWord = "Hai";
                break;
            case 3:
                toWord = "Ba";
                break;
            case 4:
                toWord = "Bốn";
                break;
            case 5:
                toWord = "Năm";
                break;
            case 6:
                toWord = "Sáu";
                break;
            case 7:
                toWord = "Bảy";
                break;
            case 8:
                toWord = "Tám";
                break;
            case 9:
                toWord = "Chín";
                break;
        }
        return toWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        if (number > 0 && number < 10) {
            System.out.println(number + " is: " + numberToWord(number));
        } else if (number >= 10 && number < 20) {
            int donvi = number % 10;
            System.out.println(number + " is: " + numberToWord(donvi));
        } else if (number >= 20 && number < 100) {
            int hangChuc = number / 10;
            int hangDonvi = number % 10;
            System.out.println(number + " is: " + numberToWord(hangChuc) + " mươi " + numberToWord(hangDonvi));
        } else if (number > 100 && number < 1000 && number % 100 != 0) {
            int hangTram = number / 100;
            int hangChuc = (number % 100) / 10;
            int hangDonvi = (number % 100) % 10;
            System.out.println(number + " is " + numberToWord(hangTram) + " trăm " + numberToWord(hangChuc) + " mươi " + numberToWord(hangDonvi));
        } else if (number >= 100 && number < 1000 && number % 100 == 0) {
            int hangTram = number / 100;
            int hangChuc = (number % 100) / 10;
            System.out.println(number + " is " + numberToWord(hangTram) + " trăm " + numberToWord(hangChuc));
        }
    }
}
