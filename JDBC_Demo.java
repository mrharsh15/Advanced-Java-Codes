import java.sql.*;  
class JDBC_Demo
{  
    public static void main(String [] rk)
    {  	
       try{  
	//Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=
	    DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Hh@54321");  

	Statement stmt = con.createStatement();
	//stmt.executeUpdate("create table student (name varchar(20), roll int, cgpa double)");	
	
	String query = "insert into student values ('Ravi Kant Sahu', 535, 7.98)";
	stmt.execute("insert into student values ('Ravi Kant Sahu', 535, 7.98)");
	//System.out.println(s + " Rows affected");
	//PreparedStatement stmt=con.prepareStatement("select * from Student where cgpa < ? & roll < ?"); //prepareStatement(), prepareCall() 
//	stmt.setDouble(1, 10.0);	
//	stmt.setInt(2, 20);	
//	ResultSet rs=stmt.executeQuery();  
//execute(), executeQuery(), executeUpdate(), executeBatch()
/*	while(rs.next())
	{  
	    System.out.println(rs.getString(1)+"\t"+rs.getInt("roll") + "\t" + rs.getDouble(3));  
	}
*/
	con.close();  
           }
        catch(Exception e){ System.out.println(e);}  
    }  
}