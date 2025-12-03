package string_manipulation;

import java.util.*;
import java.util.Scanner;

public class first_non_repeating_character {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Map<Character,Integer>map=new HashMap<Character, Integer>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }

        }
    }
}
