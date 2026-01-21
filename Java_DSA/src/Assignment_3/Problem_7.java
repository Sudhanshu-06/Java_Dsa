// 7. Write a program to check whether roots of a given quadratic equation are real &
//distinct, real & equal or imaginary roots

package Assignment_3;

public class Problem_7 {
    public static void main(String[] args) {
        int a = 2 , b = 5 , c = 4;
        int disc = b*b- 4*a*c;
        if(disc > 0){
            System.out.println("Two real and different roots");
        }else if(disc < 0){
            System.out.println("No real roots (complex roots)");
        }else{
            System.out.println("Two real and equal roots");
        }
    }
}
