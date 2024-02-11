import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class arraydouble {
 public static void main(String[] args) {
       char arr[]={'e','a','b','a','b','d','a'};
  HashMap<Character,Integer>mp=new HashMap<>();
  
    for(char i=0;i<arr.length;i++){
        if(mp.containsKey(arr[i]))
           mp.put(arr[i],mp.get(arr[i])+1);
    else
        mp.put(arr[i],1);
    } ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Character> single = new ArrayList<>();
        
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            int value = entry.getValue();
     if(value>1)
          characters.add(entry.getKey());
          else
           single.add(entry.getKey());
             
         

    }
    System.out.println("single data "+ characters);
    System.out.println("multiple data list "+ single);
 }

}
