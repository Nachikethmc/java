import java.io.File;

public class filedelete1 {
    public static void main(String[] args) {
        File obj=new File("seven.txt");
        if (obj.exists())
        {
            if (obj.delete())
            {
                System.out.println("file delted");
            }
            else {
                System.out.println("file is not deleted");
            }
        }
        else
        {
            System.out.println("file is not avilable");
        }
    }
}

