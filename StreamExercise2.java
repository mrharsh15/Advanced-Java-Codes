import java.util.*;
import java.util.stream.*;

class StreamExercise2{
    public static void main(String[]args){
        ArrayList <Students> al = new ArrayList<>();
        Students s1 = new Students("A", 5.19);
        al.add(s1);
        Students s2 = new Students("B", 6.85);
        al.add(s2);
        Students s3 = new Students("C", 6.72);
        al.add(s3);
        Students s4 = new Students("D", 6.60);
        al.add(s4);
        Students s5 = new Students("E", 6.79);
        al.add(s5);

        Stream <Students> st = al.stream();
        Stream <Students> st1 = st.sorted();
        Stream <Students> st2 = st1.filter( s -> s.cgpa >= 6.7);
	    

        st.forEach( std ->
        {
            System.out.println(std.name);
        });

        

    }
}

class Students
{
    String name;
    double cgpa;

    Students(String n, double c)
    {
	name = n; cgpa = c; 
    }
}