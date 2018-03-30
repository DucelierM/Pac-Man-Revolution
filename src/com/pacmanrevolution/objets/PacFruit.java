
package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

public class PacFruit extends Item{


	
	public PacFruit(int elementX, int elementY, String fruit) {
	
		super(new ImageIcon("sprites/Fruit/"+fruit+".png"),"sprites/PacMan/"+fruit+".png",
				elementX,elementY,10,10,0,10);
		
		super.elementImg=elementIco.getImage();
	    
	}
}