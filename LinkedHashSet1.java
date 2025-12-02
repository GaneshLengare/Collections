
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    //LinkedHashSet is similar to the HashSet(Stores the unique elements)
    //But it preserves the insertion order , unlike HashSet
    //Internally use :1.Hash table (for the fast search)
    //                2.Linked List(to maintain order)

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        /*Avoid: 
                you need sorted elements -> use Tree set
         */

        set.add(3);
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(1);
        set.add(5);
        System.out.println(set); //[3, 2, 1, 4, 5]

        set.remove(1);
        System.out.println(set); //[3, 2, 4, 5]

        System.out.println(set.contains(4)); // true

        System.out.println(set.size()); //4

        System.out.println(set.isEmpty()); //false


        //set.clear();


        
    }
    
}
