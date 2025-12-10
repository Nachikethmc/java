class nachivandu2 implements Runnable
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
class nachichinnamma2 implements Runnable
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
public class MTI {
    public static void main(String[] args) {
        nachivandu2 obj1=new nachivandu2();
        nachichinnamma2 obj2=new nachichinnamma2();
        Thread T1=new Thread(obj1);
        Thread T2=new Thread(obj2);
        T1.start();
        T2.start();
    }
}

