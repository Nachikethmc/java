import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number greater than 2 digit");
        int num= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*num);
        }
    }
}
