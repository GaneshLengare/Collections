
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList2 {
    public static void main(String[] args) {
        Queue<Integer> l2 = new LinkedList<>();

        l2.offer(2);    //l2.add() ??
        l2.offer(1);
        l2.offer(4);
        l2.offer(5);
        l2.offer(3);
        System.out.println(l2);

        l2.poll();
        System.out.println(l2);  //deletes from the begining of the linkedList

        System.out.println(l2.peek());//1   =>/* Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.*/

        System.out.println(l2.element());//1  //head element if not return exception




    }
    
}
