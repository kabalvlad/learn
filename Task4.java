/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder3;

import java.util.Scanner;

/**
 *
 * @author VALERA
 */
//  Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).
public class Task4 {

    public static void main(String[] args) {
        int n;
        int max;
        int min;
        int num;

        System.out.print("Введите количество чисел в массиве >> ");
        n = inputINT();
        System.out.println("----------------");

        int[] numberArray;
        numberArray = new int[n];

        System.out.println("ЗАПОЛНИТЕ МАССИВ ");
        System.out.println("----------------");

        // нициалитзации максимума первой ячекой массива 
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число >> ");
            numberArray[i] = inputNumber();
            System.out.println("     ");
        }

        // находим минимальное занчение 
        min = numberArray[0];
        for (int i = 0; i < n; i++) {
            min = comparison(numberArray[i], min);
        }

        // находим максимальное значение
        max = numberArray[0];
        for (int i = 0; i < n; i++) {
            max = comparison(numberArray[i], max, min); // переменная мин нужна только для работы перегрузки методов
        }
        System.out.println("max - " + max + "   min - " + min);

        // находим  ответ 
        num = min;
        for (int i = 0; i < n; i++) {
            num = comparison(numberArray[i], num, min, max);
            
        }

        System.out.println("----------------");
        System.out.println("Вторым максимальным числом является " + num);
        System.out.println("----------------");
    }

    // ввод числа инт
    public static int inputINT() {
        Scanner in = new Scanner(System.in);
        int j;
        int per;
        youWillNotPass:
        while (!in.hasNextInt()) {
            System.out.print("Введите число >> ");
            String i = in.nextLine();
            j = in.nextInt();
            if (j < 2) {
                System.out.println("Ваше число введено не вернно или не подходит");
                break youWillNotPass;
            }
        }
        per = in.nextInt();
        return per;
    }

    // ввод числа инт в массив
    public static int inputNumber() {
        Scanner in = new Scanner(System.in);
        int per;
        while (!in.hasNextInt()) {
            System.out.print("Введите число >> ");
            String i = in.nextLine();
        }
        per = in.nextInt();
        return per;
    }

    // поиск мин занчения массива 
    public static int comparison(int x, int y) {
        int per;
        per = Math.min(y, x);
        return per;
    }

    //поиск макс значения из массива
    public static int comparison(int x, int y, int min) { // переменная мин нужна только для работы перегрузки методов
        int per;
        per = Math.max(y, x);
        return per;
    }

    // поиск воторого максимального значения из массива 
    public static int comparison(int x, int y, int min, int max) {
        int per;
        if (x == max) { // исключаем максимальное занчение
            per = y;
        } else {
            per = Math.max(y, x);
        }
        return per;
    }
}
