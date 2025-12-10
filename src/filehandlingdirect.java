import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filehandlingdirect {
    public static void main(String[] args) {
        String s="five.txt";
        try
        {
            Files.write(Paths.get(s),"hello java developers ".getBytes());
            System.out.println("file is created");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
