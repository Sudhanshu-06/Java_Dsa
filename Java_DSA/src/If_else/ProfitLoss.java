package If_else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP: ");
        int cp = sc.nextInt();
        System.out.println("Enter SP: ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("profit:- "+(sp-cp));
        }else if(sp<cp){
            System.out.println("Loss:- "+(cp-sp));
            }else{
            System.out.println("No profit No loss");
            }
    }
}
