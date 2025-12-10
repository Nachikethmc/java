class person12{
    String name1; int age1;int roll1;String branch1;
    person12(String name,  String branch, int age,int roll)
    {
        name1=name;
        age1=age;
        roll1=roll;
        branch1=branch;
    }
    public void details()
    {
        System.out.println(name1+" "+age1+" "+roll1+" "+branch1);
    }
}
class assignmyconst1 {
    public static void main(String[] args) {
        person12 obj=new person12("nachi","mca",23,45);
        obj.details();
    }
}