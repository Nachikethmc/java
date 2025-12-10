import java.util.Scanner;

public class swapping1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter greater than 2 digit");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("a:"+num1 +"b:"+num2);
        int age1= sc.nextInt();
        int age2= sc.nextInt();
        int temp=age1;
        age1=age2;
        age2=temp;
        System.out.println("age1:" +age1+"age2:"+age2);

    }
}
