import java.io.File;

public class filehandling {
    public static void main(String[] args) {
        File obj=new File("two.txt");
        try
        {
         if (obj.createNewFile())
         {
             System.out.println("file is created");
         }
         else
         {
             System.out.println("file is not created");
         }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
