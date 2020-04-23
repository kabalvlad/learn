
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author VALERA
 */
//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
// из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
public class task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n; // число точек
        int ln; // порзиция первой точки с макс раст 
        int jn; // позиция второй точки с макс раст
        double dist; // расстояние
        double max; // максиммальное расстояние

        max = 0; // инициализация максимального расстояния  и др переменных
        ln = 0;
        jn = 0;

        System.out.print("Введите количество точек >> ");
        n = inputINT();
        System.out.println("----------------");

        int[][] pointArray;
        pointArray = new int[n][2];

        for (int i = 0; i < n; i++) { // присвоение значений точкам 
            System.out.print("Введите координату X" + (i + 1) + " точки >> ");
            pointArray[i][0] = inputX(i);
            System.out.print("Введите координату Y" + (i + 1) + " точки >> ");
            pointArray[i][1] = inputY(i);
            System.out.println(" x" + (i + 1) + " = " + pointArray[i][0] + " y" + (i + 1) + " = " + pointArray[i][1]);
            System.out.println("----------------");
        }

        // цикл для расчёта длинны
        for (int i = 0; i < (n - 1); i++) {
            int l = i;
            for (int j = (l + 1); j < n; j++) {
                dist = distance(pointArray[l][0], pointArray[l][1], pointArray[j][0], pointArray[j][1]);
                // System.out.println(dist);
                if (max < dist) { //проверка в каких ячейках находиться точки из задания
                    ln = l + 1;
                    jn = j + 1;
                }
                max = Math.max(max, dist); // нахождение максимальной длинны

            }
        }
        System.out.println("Максимальное расстояние = " + max);
        System.out.println("Между точками  " + ln + " и " + jn + " где X" + ln + " = " + pointArray[ln][0] + " а Y" + ln + " = " + pointArray[ln][1]);
        System.out.println(" где X" + jn + " = " + pointArray[jn][0] + " а Y" + jn + " = " + pointArray[jn][1]);
    }

    // ввод числа инт
    public static int inputINT() {
        Scanner in = new Scanner(System.in);
        int j;
        int per;
        youWillNotPass:
        while (!in.hasNextInt()) {
            System.out.print("Введите количество точек >> ");
            String i = in.nextLine();
            j = in.nextInt();
            if (j < 3) {
                System.out.println("Ваше число точек введено не вернно или не подходит");
                System.out.println("Число точек должно быть минимум 3, пожалуйста повторите ввод");
                break youWillNotPass;
            }
        }
        per = in.nextInt();
        return per;
    }

    // нахождение длинны
    public static double distance(int x1, int y1, int x2, int y2) {
        double dist;
        dist = Math.hypot(x2 - x1, y2 - y1);
        return dist;
    }

    // ввод координаты х
    public static int inputX(int n) {
        Scanner is = new Scanner(System.in);
        while (!is.hasNextInt()) {
            System.out.print("Введите координату X" + (n + 1) + " точки >> ");
            String i = is.nextLine();
        }
        int per = is.nextInt();

        return (per);
    }

    // ввод координаты У
    public static int inputY(int n) {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Введите координату Y" + (n + 1) + " точки >> ");
            String i = in.nextLine();
        }
        int per = in.nextInt();
        in.reset();
        return (per);
    }

}
