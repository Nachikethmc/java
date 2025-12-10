class appa{
    public void home1()
    {
        System.out.println(" hello appa ");
    }
}
class maga extends appa{
    public void home2()
    {
        System.out.println(" hello maga and appa");
    }
}
public class singleint {
    public static void main(String[] args) {
       maga obj=new maga();
       obj.home1();
       obj.home2();
    }
}
