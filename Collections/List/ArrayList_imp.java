package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList_imp {
    /*
    ArrayList_imp is best when we are required to retrieve element, and it is worse when we need to continuously add data(somewhere in the middle).
    deletion(somewhere in the middle):
     LinkedList is the best suitable for insertion and deletion but is worse for retrieval of data at constant basis.
    */
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        ArrayList<Integer>newlist= new ArrayList<>();
        newlist.add(70);
        newlist.add(80);
        list.addAll(newlist);// to add all elements at once
        Iterator<Integer>it=list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
