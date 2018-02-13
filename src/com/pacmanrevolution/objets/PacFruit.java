
package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

public class PacFruit extends Item{


	
	public PacFruit(int elementX, int elementY, String fruit) {
	
		super(new ImageIcon("sprites/Fruit/"+fruit+".png"),"sprites/PacMan/"+fruit+".png",
				elementX,elementY,30,30,0,5);
		
		super.elementImg=elementIco.getImage();
	    
	}
}