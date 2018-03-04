package com.pacmanrevolution.game;

import java.awt.Image;
import javax.swing.ImageIcon;


public abstract class Element{
	
	// gestion d'affichage d'images
	protected ImageIcon elementIco;
	protected Image elementImg;
	
	// gestion des chemin d'images
	protected String elementRefImg;
	
	//position des elements de la scene
	protected int elementX;
	protected int elementY;
	
	//hitbox des elements de la scene
	protected int elementHeight;
	protected int elementLength;
	
	// gestion de l'animation
	protected int idAnimationImgElement;
	
	//identifiant  des elements de la scene
	protected int idElement;

	
	public Element(ImageIcon elementIco,		 	
					String elementRefImg,
					int elementX,
					int elementY, 
					int elementHeight,
					int elementLength,
					int idAnimationImgElement,
					int idElement) {
		
		super();
		this.elementIco = elementIco;	
		this.elementRefImg = elementRefImg;
		this.elementX = elementX;
		this.elementY = elementY;
		this.elementHeight = elementHeight;
		this.elementLength = elementLength;
		this.idElement = idElement;
		this.elementImg=elementIco.getImage();
	}


	public Element() {

	}
	

	public void setImgElement(String elementRefImg) {
		this.elementRefImg = elementRefImg;
	}
	
	public void setIdAnimationImgElement(int idAnimationImgElement) {
		this.idAnimationImgElement = idAnimationImgElement;
	}
	public void setElementImg(Image elementImg) {
		this.elementImg = elementImg;
	}
	public void setElementIco(ImageIcon elementIco) {
		this.elementIco = elementIco;
	}
	public void setElementX(int elementX) {
		this.elementX = elementX;
	}
	public void setElementY(int elementY) {
		this.elementY = elementY;
	}
	public void setElementHeight(int elementHeight) {
		this.elementHeight = elementHeight;
	}
	public void setElementLength(int elementLength) {
		this.elementLength = elementLength;
	}
	public void setIdElement(int idElement) {
		this.idElement = idElement;
	}

	
	
	public int getIdAnimationImgElement() {
		return idAnimationImgElement;
	}
	public String getImgElement() {
		return elementRefImg;
	}
	public Image getElementImg() {
		return elementImg;
	}
	public ImageIcon getElementIco() {
		return elementIco;
	}
	public int getElementHeight() {
		return elementHeight;
	}
	public int getElementLength() {
		return elementLength;
	}
	public int getIdElement() {
		return idElement;
	}
	public int getElementX() {
		return elementX;
	}
	public int getElementY() {
		return elementY;
	}

}


