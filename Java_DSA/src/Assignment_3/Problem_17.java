// 17.  Write a program which takes the length of the sides of a triangle as an input. Display
//whether the triangle is valid or not.

package Assignment_3;

import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter angle 1:");
        int angle1= sc.nextInt();
        System.out.println("Enter angle 2:");
        int angle2= sc.nextInt();
        System.out.println("Enter angle 3:");
        int angle3= sc.nextInt();

        if(angle1+angle2> angle3 && angle2+angle3>angle1 && angle3+angle1>angle2){
            System.out.println("Triangle is valid");
        }else{
            System.out.println("Triangle is not valid");
        }
    }
}
