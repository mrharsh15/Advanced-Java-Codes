import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LogIn
{
     public static void main(String [] rk)
     {
	JFrame f = new JFrame("Swing Components");
	f.setSize(700, 500);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.setLayout(new GridLayout(4, 2, 60, 100));

	ImageIcon ic = new ImageIcon("wallpaper.jpg");
	JLabel jl = new JLabel(ic);
	//f.add(jl);  jl.setBounds(0, 0, 700, 500);

	JLabel l1 = new JLabel("User Name");
	f.add(l1);

	JTextField t1 = new JTextField(20);
	f.add(t1);

	JLabel l2 = new JLabel("Password");
	f.add(l2);

	JPasswordField pw1 = new JPasswordField(20);
	f.add(pw1);
	pw1.setEchoChar('*');

	f.add(new JLabel("Technology"));

	String arr[] = {"<Select>", "Java", "Python", "Java Script", "Android", "Angular", "React JS", "A", "B", "C", "D", "Java Script", "Android", "Angular", "React JS", "A", "B", "C", "D"};
	JComboBox <String> jcb = new JComboBox<>(arr);
	f.add(jcb);

	jcb.addItem("C/C++");


	

	JButton b1 = new JButton("Submit");
	f.add(b1);    
	JButton b2 = new JButton("Reset");
	f.add(b2);    

	Font f1 = new Font(Font.SERIF, 1, 24);
	Font f2 = new Font(Font.SERIF, 0, 24);
	l2.setFont(f1);   l1.setFont(f1);
	t1.setFont(f2);  

	l2.setForeground(Color.BLUE);
	l1.setForeground(Color.BLUE);


	//Listener for Buttons
	
	ActionListener l = (ae) -> {if(ae.getActionCommand().equals("Submit"))
				{
					t1.setEditable(false);
					pw1.setEditable(false);
				}
			                else if(ae.getSource() == b2)
					{
						t1.setText(null);
						pw1.setText(null);
						t1.setEditable(true);
						pw1.setEditable(true);
					}	
				
				};

	b1.addActionListener(l );
	b2.addActionListener(l );

	f.setVisible(true);
     }
}