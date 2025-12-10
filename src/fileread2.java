import java.io.FileInputStream;

public class fileread2 {
    public static void main(String[] args) {
        try(FileInputStream obj=new FileInputStream("six.txt"))
        {
            int c;
            while((c=obj.read())!=-1)
            {
                System.out.print((char) c);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
