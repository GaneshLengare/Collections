import java.util.*;

//A linkedList is where the each element is points to next one
//Unlike Arrays, it does not use indexes internally
//best when you want insert/remove elements often, espacially at start or middle
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
       /*Use:
            when you want fast insertion/deletion
            you working with data where  you want add/remove from both ends
            you need Queue or Stack structure
        Avoid:
            when you faster access of an element by index- ArrayList is better
        */

        l1.add(3);
        
        l1.addFirst(2);

        l1.addLast(4);

        System.out.println(l1);//[2, 3, 4]

        l1.removeFirst();
        System.out.println(l1);//[3, 4]

        
        System.out.println(l1.removeLast());//4
        System.out.println(l1);//[3]

        System.out.println(l1.getFirst());//3
        System.out.println(l1.getLast());//3

        l1.add(5);

        System.out.println(l1.get(1));//5
        System.out.println(l1.remove(0));//3

        

    }
    
}
