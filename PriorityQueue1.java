import java.util.*;

public class PriorityQueue1 {
    //PriorityQueue is queue where elements are removed in priority order not by insertion order
    //By default smallest comes out first(min-Heap)->i.e smallest element gets higher priority
    //Internally uses a heap
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder()); <--Max Priority queue

        /*Use:
            when you want to always get the minimum or maximum element quickly
            use in :
                    Dijkstra's algorithm
                    task shedular
                    job pririty systems
         */
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println(pq);//[10, 20, 30, 40]
        // Note: order on printing is NOT sorted, but smallest has priority

        System.out.println(pq.peek());// 10

        System.out.println(pq.poll());// 10
        System.out.println(pq);// [20, 40, 30]

        System.out.println(pq.contains(40));// true

        pq.remove(40);
        System.out.println(pq);// [20,30]

        System.out.println(pq.size());// 2

        System.out.println(pq.isEmpty());// false





    }
    
}
