import java.util.Scanner;

class person
{
    public void details(String name,int age)
    {
        System.out.println(name +" "+ age);
    }
}
public class userdif2 {
    public static void main(String[] args) {
        person obj=new person();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the person details :");
        String name=sc.nextLine();
        int age=sc.nextInt();
        obj.details(name,age);
        obj.details("nachi",21);
    }
}