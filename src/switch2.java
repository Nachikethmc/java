import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a marks from 1 to 100");
        int marks= sc.nextInt();
        switch (marks)
        {
            case 90:
                    System.out.println("A grade");
                    break;
            case 80:
                System.out.println(" B+ grade");
                break;
            case 70:
                System.out.println("B grade");
                break;
            case 60:
                System.out.println("C+ grade");
                break;
            case 40:
                System.out.println("c grade");
                break;
            default:
                System.out.println("fail");


        }
    }

}
