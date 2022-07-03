package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Collections_class {
    /* Collections_class is a utility class which provide all the utility functions to the program.like(sorting,searching etc)
    whereas collection is an interface which the other interfaces like list,set,queue extends
    ------------------------------
    it defines several utility method for collection objects
    sorting
    searching
    reverse etc
    ---------------------
    */
    public static void main(String[] args) {
        List<Integer> ls= new ArrayList<>();
        int i=5;
        while(i>=1)
            ls.add(i--);// add data
        System.out.println(ls);
        Collections.sort(ls);// sorts the list
        System.out.println(ls);
    }
}
