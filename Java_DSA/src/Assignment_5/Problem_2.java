// 2.  Write a program to print the first N natural numbers.

package Assignment_5;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:- ");
        int num = sc.nextInt();
        for(int i= 1; i<num; i++){
            System.out.print(i + " ");
        }
    }
}
