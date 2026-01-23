// 4. Write a program to print the first N odd natural numbers

package Assignment_5;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i= i+2){
            System.out.print(i + " ");
        }
    }
}
