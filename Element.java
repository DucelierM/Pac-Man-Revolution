package com.pacmanrevolution.game;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public abstract class Element extends JPanel{
	protected Image elementImg = null;
	protected ImageIcon elementImgIco = null;
	protected int elementHeight = 0;
	protected int elementLenth = 0;
	protected int idElement;


	public Element() {
		super();
		
		this.elementImg = elementImg;
		this.elementImgIco = elementImgIco;
		this.elementHeight = elementHeight;
		this.elementLenth = elementLenth;
		this.idElement = idElement;
	}

}


