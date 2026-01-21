// 5.Write a program to check whether a given number is a three-digit number or not.

package Assignment_3;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        if(num>99 && num<=999){
            System.out.println("Number is three digit");

        }else{
            System.out.println("Number is not three digit number");
        }

    }
}
