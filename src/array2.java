public class array2 {
    public static void main(String[] args) {
        int array[]={4,1,2,3,5};
        //System.out.println(array[2]);
        //array[1]=9;
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        for (int i:array)
        {
            System.out.println(i);
        }
    }
}
