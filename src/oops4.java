class car
{
    String name="audi";
    int price=1500000;
    String color="black";
    String model="ABS";
    String regno="KA 11 HR 2251";
}
class bike
{
    String name="HIMALAYN 450";
    int price=422000;
    String color="kammet white";
}
public class oops4 {
    public static void main(String[] args) {
        car obj=new car();
        bike obj2=new bike();
        System.out.println("car name is : "+obj.name+ " car price is : "+obj.price+ "car color is : "+obj.color+ "car model is : "+obj.model+ " car regno is : "+obj.regno);
        System.out.println(" bike name is : "+obj2.name+ " bike price is : "+obj2.price+ "bike color is : "+obj2.color);
    }
}
