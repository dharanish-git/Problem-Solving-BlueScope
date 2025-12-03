package string_manipulation;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome Check\n");
        System.out.print("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("No,It is not a Palindrome");
        }
    }
}
