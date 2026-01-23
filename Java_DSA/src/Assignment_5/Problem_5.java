package Assignment_5;
// 5.  Write a program to print the first N odd natural numbers in reverse order.
import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        for(int i = num; i>=1; i= i-2){
            System.out.print(i + " ");
        }
    }
}
