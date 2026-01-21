// 12. Write a program to check whether a given alphabet is in uppercase or lowercase.

package Assignment_3;

public class Problem_12 {
    public static void main(String[] args) {
        char ch= 'P';
        if((97<=ch)&& (ch<=122))
            System.out.println("Lowercase");
        if((65<=ch) && (ch<=90))
            System.out.println("Uppercase");
    }
}
