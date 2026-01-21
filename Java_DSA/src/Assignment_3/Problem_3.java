// 3. Write a program to check whether a given number is an even number or an odd
//number.

package Assignment_3;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: -");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " Even Number");
        }else{
            System.out.println(num + " Odd Number");
        }

    }
}
