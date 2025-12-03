package general;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int original=num;
        int length = Integer.toString(num).length();
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            count += Math.pow(digit, length);
            num /= 10;
        }
        if (original == count) {
            System.out.println("It is Armstrong");
        }
        else {
            System.out.println("It is Not");
        }

        System.out.print("Enter a Range");
        int range=s.nextInt();
        for(int i=1;i<=range;i++){
            int temp=i;
            int len=Integer.toString(i).length();
            int digits=i%10;
            int count1=0;
            while (temp > 0) {
                int digit = temp % 10;
                count1 += Math.pow(digit, len);
                temp /= 10;
                if (count1 == i)
                    System.out.println(i);
            }

        }
        }
    }
