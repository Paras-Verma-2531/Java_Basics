import java.util.Scanner;

public class JaggedArray {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int [][] arr=new int[2][];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter the size of index: "+i);
            int len=in.nextInt();
            arr[i]=new int[len];
            for(int j=0;j<len;j++)
            {
                System.out.println("enter the "+(j+1) +" number");
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("jagged array is : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] );
            }
            System.out.println();
        }
    }
}
