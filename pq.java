import java.util.*;
public class pq {
  public static void main(String[] args) {
    PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
    pq.add(10);
    pq.add(10);
    pq.add(10);
    pq.add(10);

    System.out.println(pq);
    System.out.println(pq.peek());
    pq.poll();
    System.out.println(pq);
  }
}
