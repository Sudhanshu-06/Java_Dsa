package Assignment_2;

public class Problem_5 {
    public static void main(String[] args) {
        int num = 987;
        int rem =0,sum=0;
         rem = num%10;
         num= num/10;

         sum= sum+rem;

        rem = num%10;
        num= num/10;

        sum= sum+rem;

        rem = num%10;
        num= num/10;

        sum= sum+rem;

        System.out.println(sum);
    }
}
