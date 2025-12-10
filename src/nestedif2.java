import java.util.Scanner;

public class nestedif2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a val :");
        int a= sc.nextInt();
        System.out.println("enter b val :");
        int b= sc.nextInt();
        System.out.println("enter c val :");
        int c= sc.nextInt();
        if (a>b)
        {
            if(a>c)
            {
                System.out.println(" a is greater");
            }
            else
            {
                System.out.println(" c is greatest");
            }
       }
        else
        {
         if (b>c)
         {
             System.out.println(" b is greatest");
         }
         else
         {
             System.out.println(" c is greatest");
         }
        }
    }
}
