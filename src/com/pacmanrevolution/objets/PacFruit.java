package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

public class PacFruit extends Item{

	public PacFruit(int elementX, int elementY, String fruit) {
		super(30 , 30 , elementX, elementY);
		super.icoObjet = new ImageIcon("sprites/Fruit/"+fruit+".png");
	    super.imgObjet = super.icoObjet.getImage();
	}
}
