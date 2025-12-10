import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if (n>0)
        {
            System.out.println("number " +n+ " is positive(+):");
        }
        else if(n<0)
        {
            System.out.println("number " +n+ " is negative(-):");
        }
        else
        {
            System.out.println("number is 0");
        }

    }
}
