import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    ///LinkedHashMap is just like HashMap (key-value pairs).
    // BUT it preserves insertion order.
    // Internally uses:
        // Hash table → fast operations
        // Doubly linked list → maintains order
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        /*Example uses:
                Cache systems
                Settings/preferences
                Ordered key–value data 
        */

        map.put(101, "Ganesh");
        map.put(103, "Rahul");
        map.put(102, "Sita");

        System.out.println(map);// {101=Ganesh, 103=Rahul, 102=Sita}

        System.out.println(map.get(102)); // sita

        System.out.println(map.containsKey(103));// true

        System.out.println(map.containsValue("ganesh"));// false

        System.out.println(map.size()); // 3

        System.out.println(map.keySet()); //[101, 103, 102]

        System.out.println(map.values());// [Ganesh, Rahul, Sita]

        System.out.println(map.remove(103)); //Rahul
        System.out.println(map);//{101=Ganesh, 102=Sita}

        for(var a : map.entrySet()){
            System.out.println(a);
        }

    }
    
}
