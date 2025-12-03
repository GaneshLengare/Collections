
import java.util.Collections;
import java.util.PriorityQueue;




public class ProrityQueue2 {

    static int kthsmallest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : arr){
            pq.add(n);

            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();

        


    }
    public static void main(String[] args) {

        int[] arr = {15, 7, 3, 4, 10, 20};
        int k = 4;

        System.out.println(ProrityQueue2.kthsmallest(arr, k));
        
        
    }

    
}
