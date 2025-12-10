import java.util.LinkedHashSet;

public class set3 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> name=new LinkedHashSet<>();
        name.add(3);
        name.add(44);
        name.add(1);
        name.add(2);
        name.add(54);
        System.out.println(name);
        name.remove(44);
        System.out.println(name);
    }
}
