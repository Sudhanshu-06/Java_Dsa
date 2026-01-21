// 1.  Write a program to check whether a given number is positive or non-positive.

package Assignment_3;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num= sc.nextInt();
        if(num>0){
            System.out.println(num +"Number is positive");
        }
        if(num<=0){
            System.out.println(num +"Number is Non-positive");
        }
    }
}
