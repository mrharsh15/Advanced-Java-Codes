import java.awt.*;
import javax.swing.*;


class MenuDemo
{
    static public void main(String [] rk)
    {
	JFrame f = new JFrame("My Menu");
	f.setSize(700, 600);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);

	JMenuBar jmb = new JMenuBar();

	JMenu m1 = new JMenu("File");
	JMenuItem i1 = new JMenuItem("New");
	JMenuItem i2 = new JMenuItem("Open");
	JMenuItem i3 = new JMenuItem("Save");
	//JMenuItem i4 = new JMenuItem("Save As");

	JMenu m11 = new JMenu("Save As");
	m11.add(new JMenuItem("pdf"));
	m11.add(new JMenuItem("doc"));
	m11.add(new JMenuItem("txt"));
    

	m1.add(i1);
	m1.add(i2);
    m1.insertSeparator(2);
	m1.add(i3);
	//m1.add(i4);
	m1.add(m11);
	jmb.add(m1);

    

	JMenu m2 = new JMenu("Edit");
    JMenuItem i5 = new JMenuItem("Cut");
	JMenuItem i6 = new JMenuItem("Copy");
	JMenuItem i7 = new JMenuItem("Paste");
    m2.add(i5);
    m2.add(i6);
    m2.add(i7);
	jmb.add(m2);

	JMenu m3 = new JMenu("View");
	JCheckBoxMenuItem cm = new JCheckBoxMenuItem("Status Bar", true);
	m3.add(cm);
	jmb.add(m3);	

    jmb.add(Box.createRigidArea(new Dimension(100,25)));


	f.setJMenuBar(jmb);	

	f.setVisible(true);
    }
}