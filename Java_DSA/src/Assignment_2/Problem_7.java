// 7. Write a program to find the position of first 1 in LSB.

package Assignment_2;

public class Problem_7 {
    public static void main(String[] args) {
        int x = 6, count = 0;
        int result = 0;
        while(x != 0) {
            result = x & 1;
            count++;
            if(result == 1) {
                System.out.println(count);
                break;
            }
            x = x >> 1;
        }



        }
    }

