import java.io.*;
import java.util.*;
import java.util.stream.*;

class Ca{
    public static void main(String []arg)
    throws IOException{
        ArrayList <Faculty> a = new ArrayList<>();
	    Faculty f1 = new Faculty("f1", "CSE", "LPU", 9 );
        Faculty f2 = new Faculty("f2", "Mechanical", "LPU", 5 );
        Faculty f3 = new Faculty("f3", "CSE", "Amity", 4 );
        Faculty f4 = new Faculty("f4", "IT", "IPU", 2 );
        Faculty f5 = new Faculty("f5", "CSE", "LPU", 10 );

        a.add(f1);      
        a.add(f2);        
        a.add(f3);        
        a.add(f4);        
        a.add(f5);

        BufferedReader bfn = new BufferedReader(
            new InputStreamReader(System.in));
 
        int it = Integer.parseInt(bfn.readLine());

        Stream <Faculty> st = a.stream();
        if(it == 1)
        st = st.filter(f -> f.experience>2);
        else if(it == 2)
        st = st.filter(f -> f.univeristy == "LPU");

        // st = st.sorted();

        
        st.forEach(x -> 
            System.out.println(x.name + "\t\t" + x.specialization + "\t\t" + x.univeristy + "\t\t" + x.experience)
        );
    }
}

class Faculty{
	String name, specialization, univeristy;
	int experience;

	Faculty(String name, String specialization,String univeristy, int experience){
		this.name = name;
		this.specialization = specialization;
		this.univeristy = univeristy;
		this.experience = experience;
	}
}