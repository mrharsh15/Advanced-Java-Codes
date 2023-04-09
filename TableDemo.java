import java.awt.*;
import javax.swing.*;


class TableDemo
{
    static public void main(String [] rk)
    {
	JFrame f = new JFrame("My Menu");
	f.setSize(700, 600);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);

	String [] columns = {"Item", "Price"};
	Object [][] data = {
			{"Coffee", 40},
			{"Noodles", 80},
			{"Burger", 60},
			{"Coffee", 40},
			{"Noodles", 80},
			{"Burger", 60},
			{"Coffee", 40},
			{"Noodles", 80},
			{"Burger", 60}
		          };
	JTable jt = new JTable(data, columns);
	JPanel p = new JPanel();

    
	JScrollPane jsp = new JScrollPane(jt,
	JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS  );
	p.add(jsp);
	f.add(p);

	f.setVisible(true);
    }
}