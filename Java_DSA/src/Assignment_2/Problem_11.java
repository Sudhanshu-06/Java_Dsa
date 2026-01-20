// 11. . Write a program to input a number from the user and also input a digit. Append a
//digit in the number and print the resulting number. (Example - number=234 and
//digit=9 then the resulting number is 2349)

package Assignment_2;

public class Problem_11 {
    public static void main(String[] args) {
        int number = 234;
        int digit = 9;
        int result = number * 10 + digit ;
        System.out.println(result);
    }
}
