import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Listener implements ActionListener
{
     public void actionPerformed(ActionEvent e)
    {
		if(e.getSource() == PasswordReset.clear)
		{
			PasswordReset.user.setText(null);
			PasswordReset.pass.setText(null);
			PasswordReset.pass2.setText(null);
		}
		else if(e.getActionCommand().equals("Submit"))
 		{
			String uname = PasswordReset.user.getText();	
			String pwd1 = PasswordReset.pass.getText();
			String pwd2 = PasswordReset.pass2.getText();
			if(!pwd1.equals(pwd2))
			{
				PasswordReset.pass.setText(null);
				PasswordReset.pass2.setText(null);
				JOptionPane.showMessageDialog(PasswordReset.f, "Both the Passwords must be Same");
			}
			else{
			//To update the password
				try{
					PreparedStatement pst = PasswordReset.con.prepareStatement("select * from credentials where username = ?");
					pst.setString(1, uname);
					ResultSet rs = pst.executeQuery();
					rs.next();
					String user = rs.getString(1);
					if(user.equals(uname)){
						pst = PasswordReset.con.prepareStatement("update credentials set password = ? where username = ?");
						pst.setString(1, pwd1);
						pst.setString(2, uname);
						pst.executeUpdate();
					}	
				}
				catch(Exception ex){ 
					System.out.println(ex);
				}
			}
		}
		else if(e.getSource() == PasswordReset.back){
			PasswordReset.f.setVisible(false);
			new LogInDbms();
		}
    }	
}

class LogInDbms{
    static JFrame f = new JFrame("Log In Window");
    static JTextField user, pass;
	static JButton login, clear, forgot, signup;

    LogInDbms(){

        user = new JTextField("Enter User Name", 20);
		pass = new JTextField("Enter Password", 20);
		login = new JButton("Log In");
		clear = new JButton("Clear");
        signup = new JButton("Sign Up");
        forgot = new JButton("Forgot Password");

        f.setLayout(null);
		f.setSize(800, 800);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        user.setBounds(200, 180, 400, 50);
		pass.setBounds(200, 250, 400, 50);
		login.setBounds(200, 360, 100, 50);
		clear.setBounds(350, 360, 100, 50);
        forgot.setBounds(500, 360, 100, 50);
		signup.setBounds(600, 50, 100, 50);

		f.add(user); f.add(pass); 
		f.add(login); f.add(clear);
        f.add(forgot); f.add(signup);

        f.setVisible(true);

    }
}

class SignUp{
    static Connection con;
    static JFrame f = new JFrame("Sign Up");

    static JTextField name, username, pass;
    static JButton submit, clear, back;

    SignUp(){
        name = new JTextField("Name", 20);
		username = new JTextField("Username", 20);	
		pass = new JTextField("Password", 20);
		submit = new JButton("Sign Up");
		clear = new JButton("Clear");
		back = new JButton("Cancel");

        f.setLayout(null);

		name.setBounds(200, 150, 400, 50);
		username.setBounds(200, 220, 400, 50);
		pass.setBounds(200, 290, 400, 50);
		submit.setBounds(200, 360, 100, 50);
		clear.setBounds(350, 360, 100, 50);
		back.setBounds(500, 360, 100, 50);

		f.add(name); f.add(username); f.add(pass);
		f.add(submit); f.add(clear); f.add(back);

		f.setSize(800, 800);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);

    }
}

public class PasswordReset
{
    static Connection con;
    static JFrame f = new JFrame("Password Reset"); 
    static JTextField user, pass, pass2;
    static JButton submit, clear, back;
    PasswordReset(){
		user = new JTextField("User Name", 20);
		pass = new JTextField("New Password", 20);	
		pass2 = new JTextField("New Password", 20);
		submit = new JButton("Submit");
		clear = new JButton("Clear");
		back = new JButton("Back");

		f.setLayout(null);

		user.setBounds(200, 150, 400, 50);
		pass.setBounds(200, 220, 400, 50);
		pass2.setBounds(200, 290, 400, 50);
		submit.setBounds(200, 360, 100, 50);
		clear.setBounds(350, 360, 100, 50);
		back.setBounds(500, 360, 100, 50);

		f.add(user); f.add(pass); f.add(pass2);
		f.add(submit); f.add(clear); f.add(back);

		Listener l = new Listener();
		submit.addActionListener(l);
		clear.addActionListener(l);
		back.addActionListener(l);

		f.setSize(800, 800);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
    }

    public static void main(String [] rk)
    {
        try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KE051","root","Ravi@1987");  
		}
        catch(Exception e) {

		}
		new PasswordReset();
    }
}