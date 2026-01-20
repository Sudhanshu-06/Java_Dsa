// 1. Write a program to print unit digit of a given number
package Assignment_2;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        int result = num%10;
        System.out.println(result);
    }
}
