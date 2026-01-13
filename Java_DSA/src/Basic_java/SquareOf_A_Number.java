package Basic_java;

import java.util.Scanner;

public class SquareOf_A_Number {
    public static void main(String[] args) {

        System.out.println("Enter a Number: ");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int square = number*number;
        System.out.println("square is: ");
        System.out.println(square);
    }
}
