import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyGraphics extends Canvas
{
    int x,y;
    static JLabel l;
    public void paint(Graphics g){
        // Font f = new Font("SERIF", 1, 30);
        // g.setColor(Color.BLUE);
        // g.setFont(f);
        // //g.drawString("Ravi Kant Sahu", 200, 50);
        // g.setColor(Color.red);
        // g.drawRect(184, 13, 230, 50);
    /*
        g.setColor(Color.GREEN);
        g.fillRect(150, 150, 400, 250);

        g.setColor(Color.red);
        g.fillOval(300, 225, 100, 100);

        g.setColor(Color.BLUE);
        g.drawLine(100, 200, 300, 150);
    */
        // //Pizza
        // g.setColor(Color.yellow);
        // g.fillArc(100, 100, 200, 200, 30, 300);

        // //Slice

        // g.setColor(Color.ORANGE);
        // g.fillArc(110, 100, 200, 200, 330, 60);	

        // g.setColor(Color.BLACK);

    }
      
    public static void main(String [] rk){
        MyGraphics mg = new MyGraphics();
        JFrame f = new JFrame();
        f.add(mg);
        l = new JLabel("Label");
        f.add(l, BorderLayout.SOUTH);
        
        mg.addMouseMotionListener( new MyMouseListener());
        

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setSize(700, 500);
        f.setVisible(true);
    }
}

class MyMouseListener extends MouseAdapter
{
    public void mouseMoved(MouseEvent e){

	    MyGraphics.l.setText(e.getX() + ", "+ e.getY());

        mouseDragged(e);
        int x = e.getX();
        int y = e.getY();

        // MyGraphics.mouseDragged.drawLine(x,y)


    }
    
}