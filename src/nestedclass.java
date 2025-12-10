class outer5
{
    static class inner8
    {
        void demo12()
        {
            System.out.println("static nested class");
        }
    }
}
public class nestedclass {
    public static void main(String[] args) {
     outer5.inner8 obj=new outer5.inner8();
     obj.demo12();
    }
}
