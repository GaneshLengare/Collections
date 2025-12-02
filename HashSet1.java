
import java.util.HashSet;

//Hashset is collection that stores only unique values
//It removes duplicates automatically
//It does not maintain order

public class HashSet1 {
    public static void main(String[] args) {
        /*Use:
                You want to avoid duplicates.
                You need fast searching (contains → O(1)).
                Order does not matter.
        Avoid:
                You need the insertion order (then use LinkedHashSet).
                You need sorted data (then use TreeSet).
        */
        
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(4);
        set.add(5);
        set.add(5);
        set.add(4);
        set.add(6);
        set.add(7);
        System.out.println(set);  //[4, 5, 6, 7]

        set.remove(4);    //removes by using values/object
        System.out.println(set);  //[5, 6, 7]

        System.out.println(set.contains(6));  //true

        System.out.println(set.isEmpty());  //false

        System.out.println(set.size());  //3

        set.clear();
        System.out.println(); //
    }
    
}
