package Basic_java;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        //   Area pi*r*r


//        double radius = 9;
//        double area = 3.14*radius*radius;
//        System.out.println(area);


//        Taking input from user
        System.out.println("Enter radius of a circle: ");
        Scanner sc =new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("Area is: ");
        System.out.println(area);
    }
}
