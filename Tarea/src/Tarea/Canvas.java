package Tarea;
import Tarea.objects.WallJump;
import Tarea.objects.Circle;
import Tarea.objects.BouncyCircle;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel{

	private static final long serialVersionUID = 1L;
	
	BouncyCircle bouncy= new BouncyCircle();
	WallJump walljump = new WallJump();
	public Canvas()
	{
		
	}

 	public void paint(Graphics g) {
  		update(g);	
  		
  		g.setColor(Color.WHITE);
		 g.fillRect(0, 0, getSize().width, getSize().height);	
		
		walljump.Draw(g);
		 repaint();
 	}
	
 	public void update (Graphics g){	
		 
		
		 walljump.Update();
	 }

}