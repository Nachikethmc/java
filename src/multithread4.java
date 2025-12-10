class nachivandu extends Thread
{
    public void run()
    {
        for (int i = 0; i < 1; i++)
        {
            try {
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("nachi loves vandana ");
            try {
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

        }
    }
}
class nachichinnamma1 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 1; i++)
        {
            System.out.println("vandana loves nachi");
            try {
                Thread.sleep(5000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class nachinagaraj extends Thread
{
    public void run()
    {
        for (int i = 0; i < 1; i++)
        {
            System.out.println("then nachi weds vandana");
        }
    }
}

public class multithread4 {
    public static void main(String[] args) {
        nachivandu obj1=new nachivandu();
        nachichinnamma1 obj2=new nachichinnamma1();
        nachinagaraj obj3=new nachinagaraj();
        obj1.start();
        obj2.start();
        obj3.start();


    }
}
