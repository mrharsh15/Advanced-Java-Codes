import java.util.stream.*;
import java.util.*;
class OptionalTest
{
    public static void main(String [] rk)
    {
	Integer [] arr =  {3, 2, 5, 7, 7, 13, 61, 3};

	//Find the smallest Even Number
	
	Stream <Integer> st = Arrays.stream(arr);
	Optional <Integer> op = st.filter(x -> x%2 == 0).min((a, b) -> a.compareTo(b));
	op.ifPresent(x -> System.out.println(x));
	
	// if(op.isPresent())
	// 	System.out.println(op.get());
	// else System.out.println("No Even Number Found");

    }
}