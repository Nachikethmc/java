import java.sql.SQLOutput;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size of elements : ");
        int size= sc.nextInt();
        int[] array=new int[size];
        System.out.println("enter the array elements : ");
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("enter the element");
        int elements=sc.nextInt();
        int count=0;
        for (int i=0;i<size;i++)
        {
            if (array[i]==elements)
            {
               count++;
            }
        }
        System.out.println(elements +"is repeated "+count+"times");
    }
}

