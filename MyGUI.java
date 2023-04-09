import javax.swing.*;
import java.awt.*;

class MyGUI{
    public static void main(String [] args){
        JFrame jf = new JFrame();
        jf.setSize(600,350);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.getContentPane().setBackground(new Color(0,0, 10));
    }
}