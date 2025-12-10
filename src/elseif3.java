import java.util.Scanner;

public class elseif3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a marks:");
        int a=sc.nextInt();
      if (a>90)
      {
          System.out.println("nachi got a distinction marks");
      }
      else if (a>80)
      {
          System.out.println("nachi got a first class marks");
      }
      else if (a>70)
      {
          System.out.println("nachi got a second class marks");
      }
      else if (a>60)
      {
          System.out.println("nachi got a avreage marks");
      }
      else if (a>35)
      {
          System.out.println("nachi got a just pass marks");
      }
      else
      {
          System.out.println("fail marks");
      }
      }

    }

