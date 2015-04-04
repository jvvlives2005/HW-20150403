package nyc.c4q.jvvlives2005;
import java.util.ArrayList;

/**
 * Created by c4q-joshelynvivas on 4/3/15.
 *
 * Joshelyn Vivas
 * Linear Search on ArrayList

 You are given an ArrayList of unknown size containing integers.
 Write a class called LinearSearch which implements a static method search which accepts as input
 an ArrayList alist and an integer x, and returns the first index it sees of x in alist.
 If the integer is not present return in the list return -1

 Eg. if arraylist contains: [3, 45, 1, 2, 99] and x = 1
 Returns : 2
 */

public class LinearSearch
{
    public static void main(String[] args)
    {
        //make the array list
        ArrayList<Integer> alist = new ArrayList<Integer>();

        // add integers into the array list
        alist.add(3);
        alist.add(45);
        alist.add(1);
        alist.add(2);
        alist.add(99);
        System.out.println(search(alist,1));
    }

    public static int search (ArrayList<Integer> alist, int x){
        for (int i = 0; i < alist.size(); i++) {

            if (alist.get(i).equals(x)) {
                return i;
            }
        }
        return -1;
    }
}
