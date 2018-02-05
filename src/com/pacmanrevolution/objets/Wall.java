package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;

public class Wall extends Element{

	public Wall() {
		this.imgElement = "sprites/Wall1/Wall100.jpg";
		this.idAnimationImgElement = 0;
		
		this.elementIco = new ImageIcon(imgElement);
		this.elementImg= elementIco.getImage();
		
		this.elementX=250;
		this.elementY=250;
		
		this.elementHeight=35;
		this.elementLength=35;
		
	}
}