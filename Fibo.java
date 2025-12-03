package general;

import java.util.Scanner;

public class Fibo
{
    public static void main(String[] args) {
        System.out.println("Enter the N: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i <n-2 ; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
