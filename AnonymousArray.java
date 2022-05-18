public class AnonymousArray {
    /*used when there is only single time usage of array likewise in this program sum method takes argument of array type
    therefore, an anonymous array is passed to obtain sum of 'n' digits
    */
    public static void main(String[] args) {
        int sum=sum(new int[]{10,20,30,40});
        System.out.println("the sum is : "+sum);
    }
    public static int sum(int[] arr)
    { int total=0;
        for(int x1:arr)
        {
            total+=x1;
        }return  total;
    }
}
