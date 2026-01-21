// 10.  Write a program which takes the cost price and selling price of a product from the
//user. Now calculate and print profit or loss percentage.

package Assignment_3;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:- ");
        int c_p = sc.nextInt();
        System.out.println("Enter the selling price:- ");
        int s_p = sc.nextInt();

        int Profit = s_p - c_p;
        int ProfitPercent = (Profit * 100) / c_p;

        int Loss = c_p - s_p;
        int LossPercent = (Loss * 100) / c_p;

        if(c_p>s_p){
            System.out.println("Loss = " + Loss + ", Loss % = " + LossPercent);
        }else{
            System.out.println("Profit = " + Profit + ", Profit % = " + ProfitPercent);
        }



    }
    }

