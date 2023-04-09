import javax.swing.*;
import java.awt.*;

class SwingComponents{
    public static void main(String []args){
        JFrame f = new JFrame("Swing Components");
        f.setSize(700, 500);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        f.setResizable(false);


        JLabel l1 = new JLabel("User Name");
        l1.setBounds(150,90,100,50); f.add(l1);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(150,190,100,50); f.add(l2);

        JTextField t1 = new JTextField( 20 );
        t1.setBounds(250, 100, 300, 30);
        f.add(t1); 
        t1.setFont(new Font("Serif", 0, 16));

        JPasswordField t2 = new JPasswordField(20);
        t2.setBounds(250, 200, 300, 30);
        f.add(t2); 
        t2.setFont(new Font("Serif", 1, 16));
        t2.setEchoChar('*');

        JButton b1 = new JButton("Submit");
        f.add(b1); b1.setBounds(200, 300, 100, 40);

        JButton b2 = new JButton("Reset");
        f.add(b2); b2.setBounds(350, 300, 100, 40);

               

        f.setVisible(true);
    }
}