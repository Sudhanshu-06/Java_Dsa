//6.Write a program to print the first N even natural numbers

package Assignment_5;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:- ");
        int num = sc.nextInt();
        for(int i =2; i<=num; i=i+2){
            System.out.print(i + " ");
        }
    }
}
