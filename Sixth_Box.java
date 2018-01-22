package com.company;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Locale;


public class Sixth_Box {

    public static void main(String[] args) {

        System.out.println("Выберите задачу,нажав на соответсвующую цифру, такую как 1,2,3,5,8");
        System.out.println();
        Scanner chsel = new Scanner(System.in);//выбор задачи из 4 блока
        int choice = chsel.nextInt();
        switch (choice) {
            case 1:
                act1();
                break;
            case 2:
                act2();
                break;
            case 3:
                act3();
                break;
            case 4:
                act4();
                break;
            case 5:
                act5();
                break;
//            case 6:
//                act6();
//                break;
//            case 7:
//                act7();
//                break;
            case 8:
                 act8();
                 break;
            default:
                System.out.println("В разработке");
        }
    }

    private static void act1() {

        //метод для вывода на экран горизонтальной линии из звездочек.Это первая задача из 6 блока

        System.out.println("1 задача. Горизонтальная линия из звездочек");
        Scanner scInp = new Scanner(System.in).useLocale(Locale.UK);

        System.out.println("Введите число звездочек: ");

        int x = scInp.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }

    }

    private static void act2() {// Данный метод для вывода только четных чисел из  диапозона от 1 до 100. 2 задача

        System.out.println("2 задача. Четные чила от 1 до 100");

        for (int x = 2; x < 100; x += 2) {
            System.out.print(x + " ");
        }
    }

    private static void act3() {// Данный метод для вывода суммы чисел из  диапозона от m до n . 3 задача

        System.out.println("3 задача. Сумма чисел от m до n");
        System.out.println("Введите числа m и  n");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int s = 0;

        for (int t = m; t <= n; t++) s = s + t;
        System.out.print("Сумма чисел в диапозоне от " + m + " по " + n + " равна " + s);
    }


    private static void act4() {//Пока предполагается сделать таблицу соотвветсвия ткмператур Цельсия и Фаренгецйта

        System.out.println("В разработке. Пока предполагается сделать таблицу соотвветсвия ткмператур Цельсия и Фаренгецйта");
    }

    private static void act5() {// метод для вычисления факториала введенного числа, НО С Огромным НО считает верно факториал только чиисел до 20 более точнее, ито после обьявления
        System.out.println("Введите положительное целое число до 20 ");
        Scanner scInp = new Scanner(System.in);
        long x = scInp.nextLong();
        if (x <= 0) {
            System.out.println("Настоятельно рекомендую вам ввести положительное чило, иначе вторая неудачная попытка закончится форматированием ваших данных))");
        } else {
              long fact = 1;
            for (int i = 1; i <= x; i++) {
                fact = fact * i;
            }
            System.out.println("Факториал " + x + " равен " + fact);

        }
    }

    private static void act8() {//метод -решение 8 задачи. С клавиатуры ввести целое число. Вывести на экран все числа,на которые введенное число делится без остатка.Для расширения значения больше 20 возможно понадобится использование классов под типы данных-спросить у преподавателя,или специалистов по Java  или использовать конструкцию иф с выводом значением превышающим 20
            Scanner scInp = new Scanner(System.in);
            System.out.println("Введите число");
            int x = scInp.nextInt();
            System.out.println();
            System.out.println("Введенное число делится на следующие числа:");
            for (int i=1;i<=x;i++){
                if (x%i==0) {
                    System.out.print(i+" ");
                }
            }

    }

}





