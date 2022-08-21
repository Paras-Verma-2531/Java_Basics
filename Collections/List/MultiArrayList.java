package Collections.List;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //multi Array list
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        //Initialisation
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());// every sub list as null
        }
        // enter data
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                list.get(i).add(in.nextInt());
        }//print list
        System.out.println(list);
    }
}
