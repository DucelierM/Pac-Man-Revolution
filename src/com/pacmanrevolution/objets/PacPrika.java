package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

public class PacPrika extends Item{

	public PacPrika(int elementX, int elementY) {
		
			super(new ImageIcon("sprites/PacItems/PacPrika.png"),"sprites/PacItems/PacPrika.png",
					elementX,elementY,10,10,0,9);
		
			super.elementImg=elementIco.getImage();
	    
	}
}
