import java.util.PriorityQueue;

public class queaue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers=new PriorityQueue<>();
        numbers.offer(111);
        numbers.offer(5);
        numbers.offer(8);
        numbers.offer(15);
        System.out.println(numbers.iterator());
        System.out.println(numbers);
        System.out.println(numbers.poll());
        System.out.println(numbers.peek());
        System.out.println(numbers.size());
        System.out.println(numbers.add(2));
        System.out.println(numbers);
}
}
