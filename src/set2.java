import java.util.TreeSet;

public class set2 {
    public static void main(String[] args) {
        TreeSet<Integer> name=new TreeSet<>();
        name.add(3);
        name.add(44);
        name.add(1);
        name.add(2);
        name.add(54);
        System.out.println(name);
        name.remove(44);
        System.out.println(name);
        System.out.println(name.first());
        System.out.println(name.last());
        System.out.println(name.ceiling(43));//greater than or equal to
        System.out.println( name.floor(22));//less than or equal to
        System.out.println(name);
        System.out.println(name.higher(2));
        System.out.println(name.lower(2));
    }
}
