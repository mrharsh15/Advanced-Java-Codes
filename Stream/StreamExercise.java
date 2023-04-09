// Given an ArrayList containing Employee objects. 
// Write a function to display the name and salary of all the employees in ascending order of their emp_id who belong to Hyderabad

import java.util.*;
import java.util.stream.*;

class StreamExercise{
	public static void main(String[] args){
		ArrayList <Employee> al = new ArrayList<>();

		Employee e1 = new Employee(101,"Aman", "Hyderabad", 23000);
		al.add(e1);
		Employee e2 = new Employee(911,"Ravi", "Jalandhar", 51000);
		al.add(e2);
		Employee e3 = new Employee(151,"Sanjeev", "Pune", 25000);
		al.add(e3);
		Employee e4 = new Employee(001,"Bijay", "Hyderabad", 3000);
		al.add(e4);

		Stream<Employee> st = al.stream();
        // st.sorted();
		st = st.filter(e -> e.city == "Hyderabad");
		

		st.forEach(emp ->
		{
			System.out.println(emp.name + "\t" + emp.salary );
		});

	}
}

class Employee{
	String name, city;
	int salary, uid;

	Employee(int uid, String name, String city, int salary){
		this.uid = uid;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
}