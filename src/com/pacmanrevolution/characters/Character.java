package com.pacmanrevolution.characters;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;
import com.pacmanrevolution.objets.Wall;

public abstract class Character extends Element {
	
	//protected int characterSpeed = 50;
	protected String move = "RIGHT";
	protected String blocked = "0";
	

	
	
	
	
	/* GETTERS ET SETTERS  */
	

	
	public Character(ImageIcon elementIco,
			String elementRefImg,
			int elementX,
			int elementY,
			int elementHeight, 
			int elementLength, 
			int idAnimationImgElement,
			int idElement,
			String move,
			String blocked) {
		super(elementIco,elementRefImg,elementX,elementY,elementHeight,elementLength,idAnimationImgElement,idElement);
		
		this.move=move;
		this.blocked=blocked;
		super.elementImg=elementIco.getImage();
	}

	

	public Character(int x, int y) {
	}
	
	public Character() {
	}

	


	public String getBlocked() {
		return blocked;
	}
	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}
	
	
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	
	// collision entre un personnage et un mur 
	
public void meetWall (Wall wall) {
	
	
		if (this.getElementY()+this.getElementHeight() == wall.getElementY()		//contact  du mur par le haut
				&& this.getElementX()+this.getElementLength() > wall.getElementX()		//permet de passer à gauche du mur
				&& this.getElementX() < wall.getElementX()+wall.getElementLength()		//permet de passer à droite du mur
				)
			{this.setBlocked("BLOCKup");}
	
		
		else if(this.elementX+this.elementLength == wall.getElementX()				//contact  du mur par la gauche
				&& this.getElementY()+this.getElementHeight() > wall.getElementY()		//permet de passer au dessus du mur 
				&& this.getElementY() < wall.getElementY()+wall.getElementHeight()  //permet de passer en dessous du mur 
				
				)
			{this.blocked="BLOCKleft";}
		
				
		else if(this.getElementX() == wall.getElementX()+wall.getElementLength()		//contact  du mur par la droite
				&& this.getElementY()+this.getElementLength() > wall.getElementY()		//permet de passer au dessus du mur 
				&& this.getElementY() < wall.getElementY()+wall.getElementLength()		//permet de passer au dessous du mur 
				)
			{this.setBlocked("BLOCKright");} 

		else if (this.getElementY() == wall.getElementY()+wall.getElementHeight()		//contact  du mur par le bas
				&& this.getElementX()+this.getElementLength() > wall.getElementX()		//permet de passer à gauche du mur
				&& this.getElementX() < wall.getElementX()+wall.getElementLength()		//permet de passer à droite du mur
				)
			{this.setBlocked("BLOCKdown");}
		
		else{this.setBlocked("0");}

	}

// deplace le personnage 

public void moveCharacter() {
	
		if (
			this.blocked != "BLOCKleft" &&  this.move=="RIGHT" &&  this.elementX != 662){ 
			this.elementX = this.elementX+1;
		}
		
		else if (blocked!="BLOCKright" && move=="LEFT" &&  this.elementX != 0 ){	
			this.elementX =this.elementX-1;		
		}
		
		else if(blocked != "BLOCKdown" && move=="UP" && this.elementY != 0){
				this.elementY = this.elementY-1;		
		}
		
		else if(blocked != "BLOCKup"  && move=="DOWN" && this.elementY != 638) {		
				this.elementY=this.elementY+1;		
		}	
	}
}
