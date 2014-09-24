package Tarea.objects;

import java.awt.Color;
import java.awt.Graphics;

public class BouncyCircle extends Circle{
	
	Color color;
	public BouncyCircle(){
		
		size = 100;
		gravity = 1f;
		color = Color.RED;
	}

	
	
	public void DetectarSuelo()
	{
		if(positionY+size > 700)
			{
				Saltar();
				CambiarColor();
			}
	}
	
	
	
	public void Saltar(){
		velocityY = -0.7f;
	}
	
	public void Update(){
		AplicarGravedad();
		DetectarSuelo();
		ActualizarPosicion();
		
	}
	
	public void CambiarColor()
	{
		color = Color.green;
	}
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(positionX,positionY,size,size);
	}

}
