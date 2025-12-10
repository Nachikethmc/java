import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class filehandelinsertdata {
    public static void main(String[] args) {
        File obj=new File("six.txt");
        try
        {
            if(obj.createNewFile())
            {
                System.out.println("file is created");
            }
            else
            {
                System.out.println("file is not created");
            }
            FileWriter obj1=new FileWriter("six.txt");
            obj1.write("vandana patel belongs to kengeri mori");
            obj1.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
