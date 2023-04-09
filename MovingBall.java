import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

class MovingBall extends Canvas implements KeyListener
{
    static boolean up = false, down=false, left=false, right=false;
    static int x = 26, y = 26;
    static public void main(String [] args){
	    JFrame f = new JFrame();
	    MovingBall b = new MovingBall();
	    f.add(b);

        // b.addKeyListener(new KeyAdapter(){
        //     public void keyPressed(KeyEvent k){
        //         if (k.getKeyCode() == KeyEvent.VK_LEFT ){
        //             down = false;
        //             left = true;
        //             right = false;
        //             up = false;
        //         }
        //         else if (k.getKeyCode() == KeyEvent.VK_RIGHT ){
        //             down = false;
        //             left = false;
        //             right = true;
        //             up = false;
        //         }
        //         else if (k.getKeyCode() == KeyEvent.VK_UP ){
        //             down = false;
        //             left = false;
        //             right = false;
        //             up = true;
        //         }
        //         else if (k.getKeyCode() == KeyEvent.VK_DOWN ){
        //             down = true;
        //             left = false;
        //             right = false;
        //             up = false;
        //         }
        //     }
        // });

        b.addKeyListener(b);

       
        f.setSize(800, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    /* (non-Javadoc)
     * @see java.awt.Canvas#paint(java.awt.Graphics)
     */
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50);

		// if(x<725)
		//     x++;
		// else if(y < 600){  
        //     y++;
        //     x = 725;
        // }
		// else if(y==600 && x > 25) {
        //     x--;
        //     y=600;
        // }
        // if(down) y++;
        // else if(up) y--;
        // else if(left) x--;
        // else if(right) x++;

        
        // try{
        //     Thread.sleep(2);
        // }
        // catch(Exception e){
        //    System.out.println(e); 
        // }
        // repaint();	
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP && y>25){
            y -= 10;
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN && y<480){
            y += 10;
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT && x>25){
            x = x - 10;
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT && x<725){
            x = x + 10;
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

           
    
}

   