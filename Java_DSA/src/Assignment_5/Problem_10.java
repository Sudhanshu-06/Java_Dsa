// 10.  Write a program to print a table of N

package Assignment_5;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table num- ");
        int num = sc.nextInt();
        for(int i=1;i<=10; i++){
            System.out.print(num*i + " ");
        }
    }
}
