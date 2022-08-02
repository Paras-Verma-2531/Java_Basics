package Collections.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IterateThroughArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();int i=1;
        while(i<6)
            list.add(i++);
        //Iteration if arraylist through iterator
        Iterator<Integer>it= list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
