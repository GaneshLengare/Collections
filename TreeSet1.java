import java.util.TreeSet;

public class TreeSet1 {

    //TreeSet stores unique elements like HashSet and LinkedHashSet
    //But it sorts the elements automatically
    //Internally it uses red-black tree
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println(set); 
        // Output: [10, 20, 40, 50]

        System.out.println(set.first());  // 10
        System.out.println(set.last());   // 50
        System.out.println(set.higher(20)); // 40 =>Just greater than
        System.out.println(set.lower(40));  // 20 =>Just smaller than

        System.out.println(set.contains(20)); // true

        System.out.println(set.size()); // 4

        set.remove(50);
        set.remove(5); //if element not in set & also we want to remove it, so this line not gives any error
        System.out.println(set); //[10, 20, 40]

        //set.clear();


        

    }
    
}
