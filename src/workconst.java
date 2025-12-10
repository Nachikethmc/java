import java.util.Scanner;

class vehicle{
    String name1; String reg_no1; double price1;
    vehicle(String name, String reg_no, double price)
    {
        name1=name;
        reg_no1=reg_no;
        price1=price;
    }
    public void v_detiles(String color)
    {
        System.out.println("bike brand : "+name1);
        System.out.println("bike reg_no : "+reg_no1);
        System.out.println("bike price : "+price1);
        System.out.println("bike color : "+color);
    }
}
public class workconst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("emter the bike brand : ");
        String name=sc.nextLine();
        System.out.println("enter reg_no :");
        String reg_no=sc.nextLine();
        System.out.println("enter price :");
        double price=sc.nextDouble();
        sc.nextLine();
        System.out.println(" enter bike color :");
        String color=sc.nextLine();
    }
}
