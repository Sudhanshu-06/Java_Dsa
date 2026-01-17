/*
4. WAP to find the area of the circle. Take radius of circle from user as input and print the
result in below given format.
Expected output format – “Area of circle is A having the radius R”. Replace A with area
& R with radius.
*/

package Assignment_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle:- ");
        double Radius = sc.nextDouble();
        double Area = 3.14*Radius*Radius;
        System.out.println("Area of circle is " + Area + " having the radius " + Radius);
    }
}
