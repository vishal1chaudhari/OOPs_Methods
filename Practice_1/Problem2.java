package Practice_1;
//find sum and product of all digits of a number using class

import java.util.Scanner;

class Digit{
    void SumProd(int n){
        int sum=0;
        int prod=1;
        while(n!=0){
            int rem = n%10;
            sum += rem;
            prod *= rem;
            n = n/10;
        }
        System.out.println("Sum of Digits : "+sum);
        System.out.println("Product of Digits : "+prod);
    }

}

public class Problem2 {
    public static void main(String[] args) {
        Digit dg = new Digit();
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        dg.SumProd(n);
    }
}
