// 3.  Write a program to print the first N natural numbers in reverse order

package Assignment_5;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        for(int i= num; i>=1; i--){
            System.out.print(i + " ");
        }
    }
}
