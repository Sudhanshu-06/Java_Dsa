// 14. . Write a program to check whether a given number is divisible by 7 or divisible by 3.

package Assignment_3;

import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int number = sc.nextInt();
        if((number % 7== 0) && (number %3==0)){
            System.out.println("Number is divisible by 7 and 3");
        }else{
            System.out.println("Number is not divisible by 7 and 3");
        }
    }
}
