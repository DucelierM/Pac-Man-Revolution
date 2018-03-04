package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

public class PacGum extends Item {

	
	public PacGum(int elementX, int elementY) {
		
		super(new ImageIcon("sprites/PacItems/PacGum.jpg"),"sprites/PacItems/PacGum.jpg",
				elementX,elementY,30,30,0,6);
		
		super.elementImg=elementIco.getImage();
	    
	}

}