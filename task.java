
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

        int n; // tocki

        System.out.println("Введите количество точек >>");
        n = inputINT();

        int[][] pointArray;
        pointArray = new int[n][2];

        for (int i = 0; i < (n - 1); i++) {
            pointArray[i][0] = inputX(i);
            pointArray[i][1] = inputY(i);
            System.out.println(" x" + i + " = " + pointArray[i][0] + " y" + i + " = " + pointArray[i][1]);
        }

    }

    // ВВод числа инт
    public static int inputINT() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.print(" >> ");
            String i = in.nextLine();
        }
        int per = in.nextInt();
        in.reset();
        return (per);
    }

    // нахождение длинны
    public static double distance(int x1, int y1, int x2, int y2) {
        double dist;
        dist = Math.hypot(x2 - x1, y2 - y1);
        return dist;
    }

    // Ввод координаты х
    public static int inputX(int n) {
        Scanner is = new Scanner(System.in);
        while (!is.hasNextInt()) {
            System.out.print("Введите координату X " + n + " точки >>");
            String i = is.nextLine();
        }
        int per = is.nextInt();

        return (per);
    }

    // ввод координаты У
    public static int inputY(int n) {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Введите координату Y " + n + " точки >>");
            String i = in.nextLine();
        }
        int per = in.nextInt();
        in.reset();
        return (per);
    }

}
