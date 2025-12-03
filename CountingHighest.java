package general;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingHighest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        char[] check=str.toCharArray();
        for(char ch:check){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int highest=0;
        char highestChar=' ';
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
    if(entry.getValue()>highest){
        highest=entry.getValue();
        highestChar=entry.getKey();
    }

        }
        System.out.println(highestChar);
    }
}
