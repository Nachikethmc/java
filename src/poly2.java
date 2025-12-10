class java2
{
    public int area(int s)
    {
        return s*s;
    }
    public int area(int l,int b)
    {
        return l*b;
    }
    public double area(double r)
    {
        return 3.14*r*r;
    }
}
public class poly2 {
    public static void main(String[] args) {
        java2 obj=new java2();
        System.out.println(" area of square : "+obj.area(6));
        System.out.println(" area of rectangle : "+obj.area(6,3));
        System.out.println("area of circle : "+obj.area(9.1));
    }
}
