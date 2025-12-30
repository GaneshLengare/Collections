
//****************************HEAP**********************
/*A heap is a Complete Binary Tree that follows a heap property.

There are two types:
1️⃣ Min Heap
2️⃣ Max Heap */

//MAXHEAP --> Maximum element is always at the root

import java.util.*;
class MaxHeap{
    public static void main(String[] args) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());

        int[] arr = {30,60,70};
        minheap.add(30);
        minheap.add(20);
        minheap.add(60);
        minheap.add(70);
        minheap.add(10);

        System.out.println(minheap.peek());   //70  only peek

        System.out.println(minheap.poll());   // 70 delete + peek

        minheap.remove();                     // deletes 60
        System.out.println(minheap.peek());   // 30

        System.out.println(minheap.isEmpty()); // false
        
        

        
    }

}