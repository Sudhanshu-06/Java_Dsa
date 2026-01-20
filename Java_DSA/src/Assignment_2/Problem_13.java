// 13. Write a program to take a three-digit number from the user and rotate its digits by
//one position towards the right.

package Assignment_2;

public class Problem_13 {
    public static void main(String[] args) {
        int number = 456;
        int q= number / 10;
        int r= number % 10;
        number = r *100 + q;
        System.out.println(number);

    }
}
