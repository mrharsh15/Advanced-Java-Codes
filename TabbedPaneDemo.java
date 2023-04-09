import java.awt.*;
import javax.swing.*;


class TabbedPaneDemo
{
    static public void main(String [] rk){
	    JFrame f = new JFrame("My Menu");
	    f.setSize(700, 600);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setLocationRelativeTo(null);

	    JTabbedPane jtp = new JTabbedPane();

	    JPanel p1 = new JPanel();
		JLabel l1 = new JLabel("Intro");
		JLabel l2 = new JLabel("My name is Harsh Dalal");
		p1.add(l1);
		p1.add(l2);
	    jtp.addTab("Personal", p1);

	    JPanel p2 = new JPanel();
	    jtp.addTab("Academic", p2);

        JPanel p3 = new JPanel();
	    jtp.addTab("Skills", p3);

        JPanel p4 = new JPanel();
	    jtp.addTab("Certification", p4);

        JPanel p5 = new JPanel();
	    jtp.addTab("Achievements", p5);





	    f.add(jtp);
	    f.setVisible(true);

    }
}