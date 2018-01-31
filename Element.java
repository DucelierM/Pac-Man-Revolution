package com.pacmanrevolution.game;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public abstract class Element{
	protected Image elementImg;
	protected ImageIcon elementIco;
	protected int elementHeight = 0;
	protected int elementLenth = 0;
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

	public int getElementLenth() {
		return elementLenth;
	}

	public int getIdElement() {
		return idElement;
	}


}


