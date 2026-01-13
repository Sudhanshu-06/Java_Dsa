package Basic_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time: ");
        double time = sc.nextDouble();

        double simpleInterest = principal*rate*time/100;
        System.out.print("simpleInterest is: ");
        System.out.println(simpleInterest);
        double Final_amount = principal+simpleInterest;
        System.out.print("total amount is: "+ Final_amount);

    }
}
