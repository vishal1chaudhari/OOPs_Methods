package Practice_1;

import java.util.Scanner;

//read and add two distances using class
class Distance{
    void Sum(int d1, int d2){
        int sum=d1 + d2;
        float feet;
        if(sum>=12){
            feet = (float)sum/12;
            System.out.println("Sum of Distance : "+feet+" Feets");
        }
        else{
            System.out.println("Sum of Distance : "+sum+" Inches");
        }
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Distance dis = new Distance();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Distances");
        int d1=sc.nextInt();
        int d2=sc.nextInt();

        dis.Sum(d1,d2);
    }
}
