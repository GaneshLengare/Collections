
import java.util.HashMap;


public class HashMap1 {

    //HashMap stores data in key-values pairs
    //key must be unique , values can be dulpicates
    //very fast:O(1) for add, remove, get(on avg)
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        /*Use cases:
                1. student roll -> student name
                2. Word -> frequency
                3. Employee ID  -> details

        Avoid: 
                need sorted keys(use Treeset)
                want insertion order(LinkedHashMap)
        */

        hm.put(1, "Ganesh");
        hm.put(4, "Nil");
        hm.put(2, "Shreya");
        hm.put(5, "Ganesh");
        hm.put(3, "Nil");

        System.out.println(hm);// {1=Ganesh, 2=Shreya, 3=Nil, 4=Nil, 5=Ganesh}

        System.out.println(hm.get(4));// Nil

        hm.remove(5);
        System.out.println(hm);// {1=Ganesh, 2=Shreya, 3=Nil, 4=Nil}

        System.out.println(hm.containsKey(3)); // true

        System.out.println(hm.containsValue("Ganesh"));// true

        for(int k : hm.keySet()){
            System.out.print(" "+k);
        }
        
        System.out.println();

        for(String j : hm.values()){
            System.out.print(" "+j);
        }

        System.out.println();

        for(var a : hm.entrySet()){ // var a -> Map.Entry<Integer, String>
            System.out.println(a);

        }

            
    }
    
}
