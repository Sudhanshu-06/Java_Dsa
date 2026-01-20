// 8. Write a program to check whether the given number is even or odd using a bitwise
//operator.

package Assignment_2;

public class Problem_8 {
    public static void main(String[] args) {
        int num= 76;
        int result = num & 1;
        if(result == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

    }
}
