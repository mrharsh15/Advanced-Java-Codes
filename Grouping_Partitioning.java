import java.util.*;
import java.util.stream.*;

class Grouping_Partitioning
{
    public static void main(String [] rk)
    {
	ArrayList <Employee1> al = new ArrayList<>();
	Employee1 e1 = new Employee1("Aman", "Delhi", false);
	al.add(e1);
	Employee1 e2 = new Employee1("Dheeraj", "Punjab", true);
	al.add(e2);
	Employee1 e3 = new Employee1("Rajeev", "West Bengal", false);
	al.add(e3);
	Employee1 e4 = new Employee1("Deepti", "Delhi", true);
	al.add(e4);
	Employee1 e5 = new Employee1("Sandeep", "UP", false);
	al.add(e5);	

	//Find the employees state-wise

	Map <String, List<Employee1>> mp = al.stream().collect(Collectors.groupingBy(e -> e.state));
	
	Set <String> keys = mp.keySet();
	for(String k: keys)
	{
		List <Employee1> l = mp.get(k);
		System.out.println("\nEmployees from " + k);
		for(Employee1 e : l)
		System.out.println(e.name + "\t" + e.state);
	}

	//Use partitioning based on Maritial Status

	Map <Boolean, List<Employee1>> mp1 = al.stream().collect(Collectors.partitioningBy( e -> e.married));
	Set <Boolean> ks = mp1.keySet();
	for(Boolean k: ks)
	{
		if( k)
		System.out.println("\n\nMarried Employees are\n");
		else
		System.out.println("\n\nUnmarried Employees are\n");
		List <Employee1> l = mp1.get(k);
		for(Employee1 e : l)
		System.out.println(e.name + "\t" + e.state);
	}
    }
}


class Employee1
{
    String name, state;
    boolean married;

   Employee1(String name, String state, boolean ms)
    {
	this.name = name; this.state = state; married = ms;
    }    
}