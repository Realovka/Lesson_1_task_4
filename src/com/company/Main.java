package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.println("Введите второе число");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        System.out.println("Введите третье число");
        Scanner scan3 = new Scanner(System.in);
        int c = scan3.nextInt();

        int  d= 0;

        if (a > 0)
            d++;
            if (b > 0)
                d++;
                if (c > 0)
                    d++;


        System.out.println("Количесво положительных цифр "+d);

    }
}
