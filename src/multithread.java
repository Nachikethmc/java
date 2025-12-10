class multi1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1 ");

    }
}
class multi4 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2 ");
    }
}
public class multithread {
    public static void main(String[] args) {
        Thread obj=new multi1();
        obj.start();
        Thread obj2=new multi4();
        obj2.start();
    }
}
