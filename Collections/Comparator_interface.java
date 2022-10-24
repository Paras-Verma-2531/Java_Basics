package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_interface {
    /*
     Comparator interface is present in java.util package, it defines 2 methods:
     // whenever we are required to go with customized sorting: go with Comparator[sorting in descending order]
     ====================================
     Comparable defines only single method
     :: compareTo() method
     -----------------------

     -------------------
     compare()===> method
     equals()===>method
     ======================
     compare() method::
     public int compare(object ob1,object ob2)
     returns -ve [ob1<ob2]
     returns +ve[ob1>ob2]
     returns 0[ob1==ob2]
     =========================
     public boolean equals(object ob1)
     */
    public static void main(String[] args) {
        // customised sorting : therefore used Comparator
        TreeSet<Integer>ts= new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)
                    return -1;
                else if(o1<o2)
                    return 1;
                else
                    return  0;
            }
        });
        ts.add(10);
        ts.add(0);
        ts.add(20);
        ts.add(5);
        ts.add(50);
        System.out.println(ts);
    }
}
