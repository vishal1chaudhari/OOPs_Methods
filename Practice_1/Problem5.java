package Practice_1;
//check whether entered number is palindrome or not using a class

import java.util.Scanner;

class Check{
    void Pelindrome(int n){
        int rev=0;
        int rem;
        int temp=n;
        while(n!=0){
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        n=temp;
        if(rev==n){
            System.out.println("Pelindrome");
        }
        else{
            System.out.println("Not Pelindrome");
        }
    }
}

public class Problem5 {
    public static void main(String[] args) {

        Check ch = new Check();

        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ch.Pelindrome(n);
    }
}
