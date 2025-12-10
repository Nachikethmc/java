class java
{
    public void greet()
    {
        System.out.println("Hello Developer");
    }
    public int min(int a,int b)
    {
        return a-b;
    }
}
public class userdifmethod {
    public static void main(String[] args) {
        java obj=new java();
        obj.greet();
        int r=obj.min(7,1 );
        System.out.println(r);
    }
}

