package If_else;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1side: ");
        int a= sc.nextInt();
        System.out.println("Enter 2side: ");
        int b= sc.nextInt();
        System.out.println("Enter 3side: ");
        int c= sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("valid triangle");
        }else{
            System.out.println("not valid triangle");
        }

    }
}
