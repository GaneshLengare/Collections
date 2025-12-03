import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //Sorted keys + unique keys + key–value pairs

        TreeMap<Integer, String> map = new TreeMap<>();

        // put()
        map.put(30, "Apple");
        map.put(10, "Banana");
        map.put(20, "Cherry");
        map.put(40, "Mango");

        System.out.println("TreeMap: " + map);
        // Output: {10=Banana, 20=Cherry, 30=Apple, 40=Mango}

        // get()
        System.out.println("Value for key 20: " + map.get(20));

        // containsKey() & containsValue()
        System.out.println("Contains key 30? " + map.containsKey(30));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // Navigation methods
        System.out.println("Smallest key: " + map.firstKey());
        System.out.println("Largest key: " + map.lastKey());
        System.out.println("Just higher than 20: " + map.higherKey(20));
        System.out.println("Just lower than 30: " + map.lowerKey(30));

        // size()
        System.out.println("Size: " + map.size());

        // remove()
        map.remove(20);
        System.out.println("After removing key 20: " + map);

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // clear()
        map.clear();
        System.out.println("After clear: " + map); // {}
    }
}
