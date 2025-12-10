import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for a");
        int a=sc.nextInt();
        if (a>=0)
        {
            System.out.println("a is positive");
        }
        else
        {
            System.out.println("a is negative");
        }
    }
}
