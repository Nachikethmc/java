abstract class demo555{
    abstract void add(int a,int b);
}
public class anonymusclass {
    public static void main(String[] args){
    demo555 obj=new demo555()
    {
        void add(int a,int b)
        {
            System.out.println(a+b);
        }
    };
    obj.add(6,5);
    }
}

