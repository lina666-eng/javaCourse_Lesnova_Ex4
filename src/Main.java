package com.company;
import java.io. *;
import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] number;
        int k = 1;
        Scanner scan = new Scanner(System.in);
        int[][] ag = new int[3][4];
        int[] res = new int[12];
        for (int i = 0; i < ag.length; i++) {
            for (int j = 0; j < ag[i].length; j++) {
                ag[i][j] = scan.nextInt();
            }
        }
        scan.close();
        //Просто выводит, для удобства проверки
        for (int i = 0; i < ag.length; i++) {
            for (int j = 0; j < ag[i].length; j++) {

                System.out.print(ag[i][j] + "\t");
            }
            System.out.println();
        }
        //Задание 1
        for (int i = 0; i < ag.length; i++) {
            for (int j = 0; j < ag[i].length; j++) {
            }
            sum = IntStream.of(ag[i]).sum();
            System.out.print("Line "+k+":"+sum);
            k++;
            System.out.println();
        }
        k = 1;
        //Задание 2
        for (int j = 0; j < 4; j++) {
            sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += ag[i][j];
            }
            System.out.print("Column "+k+":"+sum);
            k++;
            System.out.println();
        }
        //Задание 3

        for (int i = 0; i < ag.length; i++) {
            for (int j = 0; j < ag[i].length; j++) {
                if (ag[i][j]%2==0){
                    System.out.print(0 + "\t");
                }
                else{
                    System.out.print(1 + "\t");
                }
            }
            System.out.println();
        }
        //Задание 4
        int s = 0;
        k=1;
        for (int i = 0; i < ag.length; i++) {
            for (int j = 0; j < ag[i].length; j++) {
            }
            s = IntStream.of(ag[i]).sum();
            System.out.print("Среднее "+k+":"+s/4);
            k++;
            System.out.println();
        }
        //Задание 5
        k=0;
        for (int i = ag.length - 1; i >= 0; i--) {
            for (int j = ag[i].length - 1; j >= 0; j--) {
                res[k]=ag[i][j];
                k++;
            }
        }
        for (int i : res) {
            System.out.print(i + "\t");
        }

    }
}




