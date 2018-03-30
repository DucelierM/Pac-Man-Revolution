package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

public class PacFreeze extends Item {

	public PacFreeze(int elementX, int elementY) {
		
		super(new ImageIcon("sprites/PacItems/PacFreeze.png"),"sprites/PacItems/PacFreeze.png",
				elementX,elementY,10,10,0,8);
		
		super.elementImg=elementIco.getImage();
	    
	}

}