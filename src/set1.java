import java.util.HashSet;
import java.util.Set;

public class set1 {
    public static void main(String[] args) {
        Set<Integer> name=new HashSet<>();
        name.add(3);
        name.add(44);
        name.add(1);
        name.add(2);
        name.add(54);
        System.out.println(name);
        name.remove(44);
        System.out.println(name);
        System.out.println(name.contains(1));
        name.clear();
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name);
        name.equals(name);
    }
}
