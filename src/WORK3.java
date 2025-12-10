import java.util.Scanner;

class tatastrive{
    String cou_name1; String bat_name1; String cou_duration1;
    tatastrive(String cou_name,String bat_name,String cou_duration)
    {
        cou_name1 = cou_name;
        bat_name1=bat_name;
        cou_duration1=cou_duration;
    }
    public void cou_details(String add, double ph)
    {
        System.out.println(" the corse selected "+cou_name1);
        System.out.println(" batch :"+bat_name1);
        System.out.println(" course durtion :"+cou_duration1);
        System.out.println(" the center of course :"+add);
        System.out.println("the phone number : "+ph);
    }
}
public class WORK3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the course name : ");
        String cou_name=sc.nextLine();
        System.out.println("enter the batch name : ");
        String bat_name=sc.nextLine();
        System.out.println(" enter the duration : ");
        String cou_duration= sc.nextLine();
        System.out.println(" enter the center name :");
        String ad=sc.nextLine();
        System.out.println("enter the phone number :");
        String ph=sc.nextLine();
    }
}
