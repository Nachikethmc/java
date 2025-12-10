import java.util.Scanner;

public class elseif2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        System.out.println("enter c value:");
        int c=sc.nextInt();
        if (a>b && a>c)
        {
            System.out.println("a is largest number.......");
        }
        else if (b>a && b>c)
        {
            System.out.println("b is largest number........");
        }
        else
        {
            System.out.println("c is largest number.......");
        }
    }
}
