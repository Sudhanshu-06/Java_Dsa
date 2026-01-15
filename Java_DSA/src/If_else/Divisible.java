package If_else;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number % 5 == 0 && number % 3 == 0) {
            System.out.println("Apurva");
        } else if(number%5==0){
            System.out.println("Riya");
        }else if(number%3==0){
            System.out.println("Ranu");
        }else{
            System.out.println("isha");
        }
    }
}
