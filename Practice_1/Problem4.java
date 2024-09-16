package Practice_1;

import java.util.Scanner;
//check Armstrong number
class A{
    void Armstrong(int n){
        double arm=0;
        int temp=n;
        double l=0;
        while(n!=0){
            l++;
            n = n/10;
        }
        n=temp;
        while(n!=0){
            double rem = n%10;
            arm = arm + Math.pow(rem,l);
            n = n/10;
        }
        n=temp;
        //System.out.println(arm);

        if(arm==n){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is Not Armstrong");
        }
    }
}

public class Problem4 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        a.Armstrong(n);
    }
}
