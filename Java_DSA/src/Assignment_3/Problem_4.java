// 4. Write a program to check whether a given number is an even number or an odd
//number without using % operator.

package Assignment_3;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = sc.nextInt();
        int result = num & 1;
        if(result == 1){
            System.out.println(num + " Number is Odd");
        }else{
            System.out.println(num + " Number is even ");
        }
    }
}
