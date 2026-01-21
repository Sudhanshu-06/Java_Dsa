// 16. Write a program to check whether a given character is an alphabet (uppercase), an
//alphabet (lower case), a digit or a special character.

package Assignment_3;

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:- ");
        char character = sc.next().charAt(0);

        if (character >= 'A' && character <= 'Z') {
            System.out.println("Uppercase Alphabet");
        }
        else if (character >= 'a' && character <= 'z') {
            System.out.println("Lowercase Alphabet");
        }
        else if (character >= '0' && character <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
