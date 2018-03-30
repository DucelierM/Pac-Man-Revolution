package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

public class SuperPacGum extends Item {

	public SuperPacGum(int elementX, int elementY) {
		super(new ImageIcon("sprites/PacItems/SuperPacGum.png"),"sprites/PacItems/SuperPacGum.png",
				elementX,elementY,10,10,0,7);
		
		super.elementImg=elementIco.getImage();
	}

}