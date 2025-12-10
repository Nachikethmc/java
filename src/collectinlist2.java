import sun.awt.image.ImageWatched;

import java.util.LinkedList;


public class collectinlist2 {
    public static void main(String[] args) {
        LinkedList<String> cars=new LinkedList();
        cars.add("BMW");
        cars.add(1,"Audi");
        cars.addFirst("Benz");
        cars.addLast("Ferrari");
        System.out.println(cars);
        cars.indexOf("Benz");
        System.out.println(cars);
        System.out.println(cars.peek());
        System.out.println(cars);
        System.out.println(cars.poll());
        System.out.println(cars);
    }
}
