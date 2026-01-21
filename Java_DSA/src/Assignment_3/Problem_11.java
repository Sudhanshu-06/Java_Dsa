// 11. Write a program to take marks of 5 subjects from the user. Assume marks are given
//out of 100 and passing marks is 33. Now display whether the candidate passed the
//examination or failed.

package Assignment_3;

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the subject1:- ");
        int sub1= sc.nextInt();
        System.out.println("Enter the subject2:- ");
        int sub2= sc.nextInt();
        System.out.println("Enter the subject3:- ");
        int sub3= sc.nextInt();
        System.out.println("Enter the subject4:- ");
        int sub4= sc.nextInt();
        System.out.println("Enter the subject5:- ");
        int sub5= sc.nextInt();

        if(sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && sub4 >= 33 && sub5 >= 33 ){
            System.out.println("Candidate is passed");
        }else{
            System.out.println("Candidate is fialed");
        }

    }
}
