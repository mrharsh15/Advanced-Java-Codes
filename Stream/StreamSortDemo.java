import java.util.*;
import java.util.stream.*;

class StreamSortDemo
{
    static public void main(String [] rk)
    {
	    ArrayList <Integer> al = new ArrayList<>();
	    al.add(1);
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(2);
        al.add(9);
        al.add(7);
        al.add(2);

	    Stream <Integer> st = al.stream();

        long count = st.count();
        System.out.println(count);  
	    // st = st.distinct();
        // // for ascending order
        // // st = st.sorted(); 

        // //for descending order
        // st = st.sorted((a,b) -> b.compareTo(a));   //this is a comparator

        // //multiple ways
        // // st = st.sorted((a,b) -> a>b ? 1 : 0); ascending order

    

        // st.forEach(x -> 
        //     System.out.println(x)
        // );
        	

	
    }
}





