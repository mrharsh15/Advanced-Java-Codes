import java.util.*;
import java.time.*;

class DateTimeDemo
{
    static public void main(String [] args){

        // Scanner sc = new Scanner(System.in);
        // System.out.print("\n Enter the date of birth: ");
        // String dob = sc.nextLine();

        // // LocalTime lt = LocalTime.of(3, 13, 019);  compile time error
        // // System.out.println(lt);

        // LocalDate ld = LocalDate.parse(dob);
        // System.out.println("You were born on " + ld.getDayOfWeek());


		// LocalDate d1 = LocalDate.now();
		// LocalDate d2 = LocalDate.now();
		// // d = d.minusYears(1);
		// // System.out.println(d);
		// System.out.println(d2.isBefore(d1));
        
        
	    Set <String> str = ZoneId.getAvailableZoneIds();
	    int i=1;
	    for(String s : str){
		    ZoneId z = ZoneId.of(s);
		    LocalDate d = LocalDate.now(z);
		    LocalTime t = LocalTime.now(z);
		    System.out.println( i + "\t" + z + "\t" + d + "\t" + t);
		    i++;
	    }
	
/*
	LocalDate dt = LocalDate.now();    System.out.println(dt);
	LocalTime lt = LocalTime.now();    System.out.println(lt);
	LocalDateTime ldt = LocalDateTime.now();    System.out.println(ldt);
*/ 
    }  
}