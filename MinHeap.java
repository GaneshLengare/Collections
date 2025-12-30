
//****************************HEAP**********************
/*A heap is a Complete Binary Tree that follows a heap property.

There are two types:
1️⃣ Min Heap
2️⃣ Max Heap */

//MINHEAP --> Minimum element is always at the root

import java.util.*;
class MinHeap{
    public static void main(String[] args) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        int[] arr = {30,60,70};
        minheap.add(30);
        minheap.add(20);
        minheap.add(60);
        minheap.add(70);
        minheap.add(10);

        System.out.println(minheap.peek());   //10  only peek  -- > smallest

        System.out.println(minheap.poll());   //delete + peek

        minheap.remove();                     //delete
        System.out.println(minheap.peek());

        
        

        
    }

}