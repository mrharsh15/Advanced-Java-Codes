import java.util.*;
import java.util.stream.*;

class StreamMapExample
{
    public static void main(String [] rk)
    {
		Student [] students = new Student[5];
		students[0] = new Student("Amit", 8.12, 7008981191L);
		students[1] = new Student("Ravi", 5.11, 7005989156L);
		students[2] = new Student("Dheeraj", 5.11, 7005989251L);
		students[3] = new Student("Farhan", 5.11, 8273598100L);
		students[4] = new Student("Hardik", 5.11, 9103450091L);

		//Create the Phonebook
		
		ArrayList <Contact> phonebook = new ArrayList<>();

		Stream <Student> st = Arrays.stream(students);
		Stream <Contact> cont = st.map(x -> new Contact(x.name, x.mob)); 
		cont.forEach(c -> phonebook.add(c));

		//Printing the Contact List
		for(Contact c: phonebook)
			System.out.println(c.contact_name + "\t" + c.contact_number);

    }

}

class Student
{
    String name;
    double cgpa;
    long mob;

    Student(String n, double c, long m)
    {
	name = n; cgpa = c; mob = m;
    }
}

class Contact
{
    String contact_name;
    long contact_number;

    Contact(String n, long c)
    {
	contact_name = n;
	contact_number = c;
    }
}