package general;
import java.util.*;
public class CountingCharacters {
    public static void main(String[] args) {
            String str="aabbccdthh";
            Map<Character,Integer>map=new HashMap<Character,Integer>();
            char[] check=str.toCharArray();
            for(char ch:check){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        System.out.println("Repeated Characters are");
for(Map.Entry<Character,Integer>entry:map.entrySet()){
    if(entry.getValue()>1){
        System.out.print(entry.getKey()+" ");
    }
}
    }
}
