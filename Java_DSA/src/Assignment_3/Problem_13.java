// 13.  Write a program to check whether a given number is divisible by 3 and divisible by 2.

package Assignment_3;

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int number = sc.nextInt();
        if((number % 2== 0) && (number %3==0)){
            System.out.println("Number is divisible by 2 and 3");
        }else{
            System.out.println("Number is not divisible by 2 and 3");
        }
    }
}
