import javafx.scene.chart.ScatterChart;

import java.io.File;
import java.io.FileOutputStream;

public class fileaddingdata {
    public static void main(String[] args) {
       try(FileOutputStream obj=new FileOutputStream("four.txt"))
        {
            System.out.println("file is created");
        }
        catch(Exception e)
        {
            System.out.println("file not created");
        }

    }
}

