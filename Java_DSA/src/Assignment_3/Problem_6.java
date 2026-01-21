//6. Write a program to print greater between two numbers. Print one number of both are
//the same.

package Assignment_3;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:- ");
        int a = sc.nextInt();

        System.out.println("Enter the second number:- ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a);
        }else if(a<b){
            System.out.println(b);
        }else{
            System.out.println("both are same");
        }

    }
}
