package com.pacmanrevolution.objets;

import com.pacmanrevolution.game.Element;

/* regroupe tous les objets et les murs */

abstract class Item extends Element {
	
	protected int score;
	
	public Item() {
		super();
		this.elementImg = elementImg;
		this.elementImgIco = elementImgIco;
		this.elementHeight = elementHeight;
		this.elementLenth = elementLenth;
		this.idElement = idElement;
	}


}