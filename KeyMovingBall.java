import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KeyMovingBall extends Canvas {
    static boolean left = false, up = false, down = false, right = false;
    static int x, y;
    static public void main(String [] rk){
        JFrame f = new JFrame();
        KeyMovingBall b = new KeyMovingBall();
        f.add(b);

        b.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent k){
                if(k.getKeyCode() == KeyEvent.VK_DOWN)
                {down = true; left = false; right = false; up = false;}

                else if(k.getKeyCode() == KeyEvent.VK_UP)
                {down = false; left = false; right = false; up = true;}

                else if(k.getKeyCode() == KeyEvent.VK_LEFT)
                {down = false; left = true; right = false; up = false;}

                else if(k.getKeyCode() == KeyEvent.VK_RIGHT)
                {down = false; left = false; right = true; up = false;}
                }
        });
        f.setSize(800, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);

        if(down && y<600) y++;
        else if(up) y--;
        else if(left) x--;
        else if(right) x++;	
        
        try{
                Thread.sleep(3);
        }
        catch(Exception e) { System.out.println(e); }
        repaint();	
	
    }

      
}