package com.pacmanrevolution.objets;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;

public class Wall extends Element{

	private String wallName;
	

	public Wall(String wallName) {
		super(new ImageIcon("sprites/Wall1/"+wallName+".png"),"sprites/Wall1/"+wallName+".png",
				0,200,35,35,0,15);
		
		super.elementImg=elementIco.getImage();
	}
	
	public Wall(int elementX,int elementY,String wallName) {
		super(new ImageIcon("sprites/Wall1/"+wallName+".png"),"sprites/Wall1/"+wallName+".png",
				elementX,elementY,35,35,0,15);
		
		super.elementImg=elementIco.getImage();
	}
}