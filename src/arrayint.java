import java.util.Scanner;

public class arrayint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("enter the array elements : ");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.print("array elemets are :");
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
