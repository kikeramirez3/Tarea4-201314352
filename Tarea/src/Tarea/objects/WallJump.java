package Tarea.objects;

import java.awt.Color;
import java.awt.Graphics;

public class WallJump extends Circle {
	Color color;
	public WallJump(){
		
		size = 150;
		gravity=0.9f;
		color = Color.GREEN;
	}
	
	public void aplicarVelocidad(){
		velocityX += gravity;
	}
	
	
	
	
	public void Limitederecha(){
		if(positionX+size == 770)
			{
				gravity = -0.9f;
				cambiarcolorderecha();
			}
	}
	

	
	public void Limiteizquierda(){
		if(positionX+size == 150)
		{
			gravity=0.9f;
			cambiarcolorizquierda();
	}
			}

	
	
	public void cambiarcolorderecha(){
		color=color.MAGENTA;
	}
	
	public void cambiarcolorizquierda(){
		color=color.GREEN;
	}
	
	
	public void Update(){
	     aplicarVelocidad();
		Limitederecha();
		ActualizarPosicion();
		Limiteizquierda();
		
		
	}
	
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(positionX,positionY,size,size);
	}


}