package com.company;

import java.util.Scanner;
import java.util.Locale;

public class FifthBox {

    public static void main(String[] args) {
        System.out.println("Выберите задачу,нажав на соответсвующую цифру");
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
//                    case 5:
//                        act5();
//                        break;
//                    case 6:
//                        act6();
//                        break;
//                    case 7:
//                        act7()  ;
//                        break;
//                    case 8:
//                        act8();
//                        break;
            default:
                System.out.println("В разработке");}

            //    act1();
   //             act2();
   //             act3();
//                act4();
//                act5();
//                act6();
//                act7();
//                act8();
                //  act9();
                //  act10();
                //  act11();
                //  act12();
                //  act13()


        }


    private static void act1() {//метод для определения параллельности прямой оси ординат или оси абсцисс.Прямая задана 2-мя точками

        System.out.println("1 задача. Параллельность прямой одной из осей");
        Scanner scInp = new Scanner(System.in).useLocale(Locale.UK);

        System.out.println("Введите координаты для 1 -ой точки: ");
        System.out.println("Введите х: ");

        int x1 = scInp.nextInt();

        System.out.println("Введите y: ");

        int y1 = scInp.nextInt();


        System.out.println("Введите координаты для 2 -ой точки: ");
        System.out.println("Введите х: ");

        int x2 = scInp.nextInt();

        System.out.println("Введите y: ");

        int y2 = scInp.nextInt();


        if (y1 == y2) {
            //((x1>-2000000)&&(x2>-2000000)&&(x1<2000000)&&(x2<2000000)&&(y1==y2)){
            System.out.println("Прямая параллельна оси абсцисс");
        } else if (x1 == x2) {
            //((x1==x2)&&(y1>-2000000)&&(y2>-2000000)&&(y1<20000000)&&(y2<2000000)) {
            System.out.println("Прямая парралельна оси ординат");
        } else {
            System.out.println("Прямая пересекает оси");
        }
    }

    private static void act2(){// метод для опреления вещественности чисел


        System.out.println("Введите число");
        Scanner scInp = new Scanner(System.in).useLocale(Locale.UK);

       double r = scInp.nextDouble();
        int f= (int) r;
       double t = r % f ;
        System.out.println(r);
        System.out.println(t);
        String a= "Число имеет вещественную часть";
        String b="у числа нет вещественноц части";
        System.out.println(((t>0)&&(t<1))?a:b);
    }

        private static  void act3(){//метод вывода названия дня недели в ответ на номер дня неделии


            System.out.println("Введите номер дня недели");
            Scanner scInp =new Scanner(System.in);

            int a = scInp.nextInt();

            String d1="Понедельник";//0
            String d2="Вторник";//////1
            String d3="Среда";////////2
            String d4="Четверг";//////3
            String d5="Пятница";//////4
            String d6="Суббота";//////5
            String d7="Воскресенье";//7
            String e="Введите число от 1 до 7";

            System.out.println((a==1)?d1:(a==2)?d2:(a==3)?d3:(a==4)?d4:(a==5)?d5:(a==6)?d6:(a==7)?d7:e);
        }

        private static void  act4() {



        }



}



