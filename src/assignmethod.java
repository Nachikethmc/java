import java.util.Scanner;
class company {
    public void Emp(String name,int salary,String Role) {
        System.out.println(name + " " + salary + " " + Role);
    }

    public int D_for_id(int D_id) {
        return D_id;
    }
    public void Dep(String Dname){
        System.out.println(Dname);
    }
}

public class assignmethod {
    public static void main(String[] args)
    {
        company obj = new company();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Employee details :");
        String name=sc.nextLine();
        String role=sc.nextLine();
        int salary =sc.nextInt();
        obj.Emp(name,salary,role);



        System.out.println("enter the D_id : ");
        int D_id = sc.nextInt();
        obj.D_for_id(D_id);
        System.out.println("enter the Dep details :");
        String Dname=sc.nextLine();
        obj.Dep(Dname);

    }


}
