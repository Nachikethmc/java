import java.util.Scanner;

public class ormstromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        int n=num;
        int r=0;
        while (num!=0)
        {
            int a=num%10;
            r=r+a*a*a;
            num=num/10;
        }
        if (r==n)
        {
            System.out.println(n+ " is a ormstrom number");
        }
        else {
            System.out.println(n+ " is not a ormstrom number");
        }

    }
}
