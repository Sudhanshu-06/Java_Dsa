// 2.  Write a program to check whether a given number is divisible by 5 or not

package Assignment_3;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.println(num + " Numner is divisible by 5");
        }else{
            System.out.println(num +" Number is not divisible by 5");
        }
    }
}
