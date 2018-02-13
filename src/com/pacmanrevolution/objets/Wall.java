package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;

public class Wall extends Element{


	

	public Wall() {
		super(new ImageIcon("sprites/Wall1/Wall100.jpg"),"sprites/Wall1/Wall100.jpg",
				0,200,35,35,0,0);
		
		super.elementImg=elementIco.getImage();
	}
	
	public Wall(int elementX,int elementY) {
		super(new ImageIcon("sprites/Wall1/Wall100.jpg"),"sprites/Wall1/Wall100.jpg",
				elementX,elementY,35,35,0,0);
		
		super.elementImg=elementIco.getImage();
	}
}