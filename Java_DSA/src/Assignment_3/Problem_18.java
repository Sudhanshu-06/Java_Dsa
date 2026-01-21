// 18. Write a program which takes the month number as an input and display number of
//days in that month

package Assignment_3;

import java.util.Scanner;

public class Problem_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        if (month == 1) {
            System.out.println("31 days");
        }
        else if (month == 2) {
            System.out.println("28 days");
        }
        else if (month == 3) {
            System.out.println("31 days");
        }
        else if (month == 4) {
            System.out.println("30 days");
        }
        else if (month == 5) {
            System.out.println("31 days");
        }
        else if (month == 6) {
            System.out.println("30 days");
        }
        else if (month == 7) {
            System.out.println("31 days");
        }
        else if (month == 8) {
            System.out.println("31 days");
        }
        else if (month == 9) {
            System.out.println("30 days");
        }
        else if (month == 10) {
            System.out.println("31 days");
        }
        else if (month == 11) {
            System.out.println("30 days");
        }
        else if (month == 12) {
            System.out.println("31 days");
        }
        else {
            System.out.println("Invalid month number");
        }

    }
}

