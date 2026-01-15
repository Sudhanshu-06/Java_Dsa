package If_else;

import java.util.Scanner;

public class FourDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n>999 && n<10000 ){
            System.out.println("four digit no");
        }else{
            System.out.println("Not a four digit no");
        }
    }
}
