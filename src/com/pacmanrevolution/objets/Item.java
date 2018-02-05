package com.pacmanrevolution.objets;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Item {
	
	protected int elementLength; 
	protected int elementHeight;
	protected int elementX;
	protected int elementY;
	protected Image imgObjet;
	protected ImageIcon icoObjet;
	private int position = 0;
	
	
	public Item(int elementLength, int elementHeight, int elementX, int elementY) {
		super();
		this.elementLength = elementLength;
		this.elementHeight = elementHeight;
		this.elementX = elementX;
		this.elementY = elementY;
	}

	// Utiliser pour pouvoir différiencier les images de fruits
	public Item(int elementLength, int elementHeight, int elementX, int elementY, Image imgObjet, ImageIcon icoObjet) {
		super();
		this.elementLength = elementLength;
		this.elementHeight = elementHeight;
		this.elementX = elementX;
		this.elementY = elementY;
		this.imgObjet = imgObjet;
		this.icoObjet = icoObjet;
	}




	public int getElementLength() {
		return elementLength;
	}


	public void setElementLength(int elementLength) {
		this.elementLength = elementLength;
	}


	public int getElementHeight() {
		return elementHeight;
	}


	public void setElementHeight(int elementHeight) {
		this.elementHeight = elementHeight;
	}


	public int getElementX() {
		return elementX;
	}


	public void setElementX(int elementX) {
		this.elementX = elementX;
	}


	public int getElementY() {
		return elementY;
	}


	public void setElementY(int elementY) {
		this.elementY = elementY;
	}


	public Image getImgObjet() {
		return imgObjet;
	}


	public void setImgObjet(Image imgObjet) {
		this.imgObjet = imgObjet;
	}


	public ImageIcon getIcoObjet() {
		return icoObjet;
	}


	public void setIcoObjet(ImageIcon icoObjet) {
		this.icoObjet = icoObjet;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}
	
	


	
	
}
