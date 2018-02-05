package com.pacmanrevolution.game;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public abstract class Element{
	
	// gestion d'affichage d'images
	protected Image elementImg;
	protected ImageIcon elementIco;
	
	// gestion des chemin d'images
	protected String imgElement ="";
	
	// gestion de l'animations
	
	protected int idAnimationImgElement = 0;
	
	//position des elements de la scene
	
	protected int elementX;
	protected int elementY;
	
	//hitbox des elements de la scene
	
	protected int elementHeight;
	protected int elementLength;
	
	//identifiant  des elements de la scene
	
	protected int idElement;


	
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
	
	// getters 
	
	public int getElementX() {
		return elementX;
	}

	public int getElementY() {
		return elementY;
	}



}


