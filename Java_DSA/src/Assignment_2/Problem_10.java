// 10. . Write a program to make the last digit of a number stored in a variable as zero.
//(Example - if x=2345 then make it x=2340)

package Assignment_2;

public class Problem_10 {
    public static void main(String[] args) {
        int digit = 2345;
        digit = digit / 10;
        digit = digit * 10;
        System.out.println(digit);

    }
}
