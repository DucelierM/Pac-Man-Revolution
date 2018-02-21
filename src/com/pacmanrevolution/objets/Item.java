package com.pacmanrevolution.objets;

import java.awt.Image;
import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;

public class Item extends Element{
	

	
	public Item(ImageIcon elementIco,
			String elementRefImg,  // remplace element img
			int elementX,
			int elementY,
			int elementHeight, 
			int elementLength, 
			int idAnimationImgElement,
			int idElement
			) {
		super(elementIco,elementRefImg,elementX,elementY,elementHeight,elementLength,idAnimationImgElement,idElement);
		super.elementImg=elementIco.getImage();
	}

	
	
}