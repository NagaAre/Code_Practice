import java.util.*;
class MedianFinder {
    private PriorityQueue<Integer> minHeap, maxHeap;
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b) -> b - a);
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
        return maxHeap.peek();
    }
}
  class Main {
    public static void main(String [] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println("Median after adding 1 and 2: " + medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println("Median after adding 3: " + medianFinder.findMedian());
        medianFinder.addNum(4);
        System.out.println("Median after adding 3: " + medianFinder.findMedian());

        }    }

