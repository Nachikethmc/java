import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class dog1
{
    String color;
    dog1(String color)
    {
        this.color=color;
    }
    public void ddetails()
    {
        System.out.println(color);
    }
}
class babydog extends dog1{
    String name;
    babydog(String name,String color)
    {
        super(color);
        this.name=name;
    }
    public void bddetails()
    {
        System.out.println(name+" "+color);
    }
}
public class sinleinhert2 {
    public static void main(String[] args) {
        babydog obj=new babydog("charli","black");
                obj.bddetails();
    }
}
