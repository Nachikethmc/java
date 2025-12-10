import java.util.Scanner;

public class multi3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and col of first matrix");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        System.out.println("enter the number of rows and col of second matrix");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        System.out.println("enter the elements of first matrix");
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of second matrix");
        for (int i=0;i<r2;i++)
        {
            for (int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix elements are");
        for (int i = 0; i <r1; i++) {
            for (int j = 0; j <c1; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("matrix elements are");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(b[i][j] + " ");
            }

            System.out.println();
        }
    }
}

