import java.util.*;
import java.sql.*;

public class MoneyTransfer{
    
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the sender's account number: \t");
        int sender = sc.nextInt();
        System.out.print("\nEnter the receiver's account number: \t");
        int receiver = sc.nextInt();
        System.out.print("\nEnter the AMount to be transferred: \t");
        int amount = sc.nextInt();
        System.out.print("\nEnter the sender's Password: \t");
        String pwd = sc.next();
        Connection con = null;
        try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Hh@54321");  
            PreparedStatement pst = con.prepareStatement("select * from account where account_number = ?");
            pst.setInt(1, sender);
            ResultSet rs = pst.executeQuery();
            rs.next();
            String password = rs.getString("password");
            int s_balance = rs.getInt(4);

            pst = con.prepareStatement("select * from account where account_number = ?");
            pst.setInt(1, receiver);

            rs = pst.executeQuery();
            rs.next();
            int r_balance = rs.getInt("balance");

            if(s_balance < amount) System.out.println("Insufficient Balance");

            else if(!pwd.equals(password)) System.out.println("Incorrect Password");

            else{
                con.setAutoCommit(false);    //Set the connection property
                Statement stmt = con.createStatement();
                s_balance -= amount;
                r_balance += amount;
                
                stmt.addBatch("update account set balance = " + s_balance + " where account_number = " + sender);
                stmt.addBatch("update account set balance = " + r_balance + " where account_number = " + receiver);	
                /*		pst = con.prepareStatement("update account set balance = ? where account_number = ?");
                        pst.setInt(1, s_balance);
                        pst.setInt(2, sender);
                        pst.addBatch();    //Query is added in the batch

                        pst = con.prepareStatement("update account set balance = ? where account_number = ?");
                        pst.setInt(1, r_balance);
                        pst.setInt(2, receiver);
                        pst.addBatch();	//Second query is added
                */
                stmt.executeBatch();
                con.commit();
            }	
	    }
        catch(Exception ex){
            System.out.println(ex);   con.rollback();
        }

     }
}