import java.io.File;
import java.io.FileOutputStream;

public class filehandleinsertFOS {
    public static void main(String[] args) {
        String content="hello nachi";
        try( FileOutputStream obj=new FileOutputStream("seven.jpg"))
        {
            byte[] bytes=content.getBytes();
            obj.write(bytes);
            System.out.println("file is created");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
