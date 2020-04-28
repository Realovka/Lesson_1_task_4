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

        if (a>0 & b>0 & c>0){
            System.out.println("Количество положительных чисел - 3");
        } else
        if ((a>0 & b>0 & c<0)||(a>0 & b<0 & c>0)||(a<0 & b>0 & c>0) || (a==0 & b>0 & c>0) || (a>0 & b>0 & c==0)
                || ( a>0 & b==0 & c>0)) {
            System.out.println("Количество положительных чисел - 2");
        } else
        if ((a>0 & b<0 & c<0) || (a<0 & b<0 & c>0) || (a<0 & b>0 & c<0)||(a>0 & b==0 & c==0)|| (a==0 & b==0 & c>0)
                || ( a==0 & b>0 & c==0) ||( a>0 & b<0 & c==0) ||(a<0 & b>0 & c==0)|| (a==0 & b<0 & c>0) ||(a==0 & b>0 & c<0)
                || (a>0 & b==0 & c<0) || (a<0 & b==0 & c>0)) {
            System.out.println("Количество положительных чисел - 1");
        } else {
            System.out.println("Количество положительных чисел - 0");
        }
    }
}
