public class arraysmall {
    public static void main(String[] args) {
        int array[]={11,5,6,2,5};
        int small=array[0];
        for (int i=1;i<array.length;i++)
        {
            if(array[i]<small)
            {
                small=array[i];
            }
        }
        System.out.println("smalleat element is : "+small);
    }
}
