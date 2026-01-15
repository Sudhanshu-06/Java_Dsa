package If_else;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");

        double number = sc.nextDouble();
        int x = (int)number;
        if(number-x == 0){
            System.out.println("Not an integer");
        }else{
            System.out.println("Is an integer");
        }
    }
}
