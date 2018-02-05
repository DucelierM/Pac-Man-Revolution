package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

public class PacGum extends Item {

	public PacGum(int elementX, int elementY) {
		super(30 , 30 , elementX, elementY);
		super.icoObjet = new ImageIcon("sprites/PacItems/PacGum.jpg");
	    super.imgObjet = super.icoObjet.getImage();
	}
	
	

}
