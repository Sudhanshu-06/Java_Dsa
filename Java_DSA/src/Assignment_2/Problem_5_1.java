package Assignment_2;

public class Problem_5_1 {
    public static void main(String[] args) {
        int number = 966;
        int rem=0, sum=0;
        while(number!=0){
            rem = number % 10;
            number = number /10;
            sum= sum+rem;

        }
        System.out.print(sum);
    }
}
