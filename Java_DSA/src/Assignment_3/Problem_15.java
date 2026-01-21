// 15.  Write a program to check whether a given number is positive, negative or zero.

package Assignment_3;

import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num= sc.nextInt();
        if(num>0){
            System.out.println("Positive no");
        }else if(num<0){
            System.out.println("Negative no");
        }else{
            System.out.println("No is zero");
        }
    }
}
