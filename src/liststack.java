import java.util.Stack;

public class liststack {
    public static void main(String[] args) {
        Stack<Integer> number=new Stack<>();
        number.push(3);
        number.push(4);
        number.push(5);
        number.push(6);
        number.push(7);
        number.push(8);
        System.out.println(number);
        number.pop();
        System.out.println(number);
        System.out.println(number.isEmpty());
        System.out.println(number.capacity());
        System.out.println (number.iterator());
        System.out.println(number.size());
    }
}
