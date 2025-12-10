public class arraymain {
    public static void main(String[] args) {
        int array[]={11,14,11,16,11,12};
        int large=array[0];
        for (int i=1;i<array.length;i++)
        {
            if(array[i]>large)
            {
                large=array[i];
            }
        }
        System.out.println("largest element is : "+large);
    }
}
