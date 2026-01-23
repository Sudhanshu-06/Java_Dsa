// 7. Write a program to print the first N even natural numbers in reverse order

package Assignment_5;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:- ");
        int num = sc.nextInt();
        for(int i =num; i>=2; i=i-2){
            System.out.print(i + " ");
        }
    }
}
