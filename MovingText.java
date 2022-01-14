import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MovingText extends Applet {

  int x = 50;
  int y = 200;

  public void init() {
    
    this.requestFocus();
    this.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          int keyCode = e.getKeyCode();
          if (keyCode == KeyEvent.VK_RIGHT)
              x+=10;
	      if (keyCode == KeyEvent.VK_LEFT)
              x-=10;
	      if (keyCode == KeyEvent.VK_UP)
              y-=10;
		  if (keyCode == KeyEvent.VK_DOWN)
              y+=10;
          repaint();

        }});
    
  }

  public void paint(Graphics g) {
    g.drawString("HELLO JAVA", x, y);

  }
}