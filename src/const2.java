class AA
{
    AA()
    {
        System.out.println("nachi");
    }
    AA(int a)
    {
        System.out.println(a);
    }
    AA(int a,int b)
    {
        System.out.println(a+" "+b);
    }
}
public class const2 {
    public static void main(String[] args) {
        AA obj=new AA();
        AA obj1=new AA(143);
        AA obj2=new AA(143,45);
    }
}
