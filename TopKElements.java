import java.util.PriorityQueue;
import java.util.*;

public class TopKElements
{
    public static int[] frequencyEle(int [] nums, int k){
    Map<Integer,Integer> frequencyMap = new HashMap<>();
       
    for(int num : nums){
        frequencyMap.put(num,frequencyMap.getOrDefault(num, 0)+1);
    }

      PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
     
      for(int num : frequencyMap.keySet()){
        minHeap.add(num);
        if(minHeap.size() > k){
               minHeap.poll();
        }
      }
           int [] result = new int[k];
           for(int i = k-1; i>=0; i--){
            result[i] = minHeap.poll();
           }
       return result;
    } 

    public static void main(String [] args){
        int [] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        System.out.println(Arrays.toString(frequencyEle(nums1, k1)));
        int [] nums2 = {1};
        int k2 = 1;
        System.out.println(Arrays.toString(frequencyEle(nums2, k2)));
 
    }
}
   