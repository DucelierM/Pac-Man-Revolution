package com.pacmanrevolution.characters;


import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;
import com.pacmanrevolution.objets.Item;
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
	
//public void meetWall (Wall wall)
public void meetWall (ArrayList<Wall> tabWall)
{
	for(int i =0;i<tabWall.size();i++) {
	
		if (this.getElementY()+this.getElementHeight() == tabWall.get(i).getElementY()		//contact  du mur par le haut
				&& this.getElementX()+this.getElementLength() > tabWall.get(i).getElementX()		//permet de passer à gauche du mur
				&& this.getElementX() < tabWall.get(i).getElementX()+tabWall.get(i).getElementLength()		//permet de passer à droite du mur
				)
			{this.setBlocked("BLOCKup");
			 break;}
	
		
		else if(this.elementX+this.elementLength == tabWall.get(i).getElementX()				//contact  du mur par la gauche
				&& this.getElementY()+this.getElementHeight() > tabWall.get(i).getElementY()		//permet de passer au dessus du mur 
				&& this.getElementY() < tabWall.get(i).getElementY()+tabWall.get(i).getElementHeight()  //permet de passer en dessous du mur 
				
				)
			{this.blocked="BLOCKleft";
			 break;}
		
				
		else if(this.getElementX() == tabWall.get(i).getElementX()+tabWall.get(i).getElementLength()		//contact  du mur par la droite
				&& this.getElementY()+this.getElementLength() > tabWall.get(i).getElementY()		//permet de passer au dessus du mur 
				&& this.getElementY() < tabWall.get(i).getElementY()+tabWall.get(i).getElementLength()		//permet de passer au dessous du mur 
				)
			{this.setBlocked("BLOCKright");
			 break;} 

		else if (this.getElementY() == tabWall.get(i).getElementY()+tabWall.get(i).getElementHeight()		//contact  du mur par le bas
				&& this.getElementX()+this.getElementLength() > tabWall.get(i).getElementX()		//permet de passer à gauche du mur
				&& this.getElementX() < tabWall.get(i).getElementX()+tabWall.get(i).getElementLength()		//permet de passer à droite du mur
				)
			{this.setBlocked("BLOCKdown");
			 break;}
		
		else{this.setBlocked("0");}
	}
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
	public boolean proche(Item objet){   	
		if((this.elementX > objet.getElementX() - 10 && this.elementX < objet.getElementX() + objet.getElementLength() + 10) 
		|| (this.elementX + this.elementHeight > objet.getElementX() - 10 && this.elementX + this.elementHeight < objet.getElementX() + objet.getElementLength() + 10)){return true;}
		else{return false;}
	}
	
    protected boolean contactAvant(Item objet){
		if(this.move=="RIGHT" == true){
			if(this.elementX + this.elementLength < objet.getElementX() || this.elementX + this.elementLength > objet.getElementX() + 5 
					|| this.elementY + this.elementHeight <= objet.getElementY() || this.elementY >= objet.getElementY() + 
					objet.getElementHeight()){return false;}
			else{return true;}
		}else{return false;}
	} 
    
    protected boolean contactArriere(Item objet){		
		if(this.elementX > objet.getElementX() + objet.getElementLength() || this.elementX + this.elementLength < objet.getElementX() 
				+ objet.getElementLength() - 5 || this.getElementY() + this.elementHeight <= objet.getElementY() || 
				this.elementY >= objet.getElementY() + objet.getElementHeight()){return false;}
		else{return true;}
	}

    protected boolean contactDessous(Item objet){	
		if(this.elementX + this.elementLength < objet.getElementX() + 5 || this.elementX > objet.getElementX() + objet.getElementLength() - 5 || 
				this.elementY + this.elementHeight < objet.getElementY() || this.elementY + this.elementHeight > objet.getElementY() + 5){return false;}
		else{return true;}		
	}

    protected boolean contactDessus(Item objet){
		if(this.elementX + this.elementLength < objet.getElementX() + 5 || this.elementX > objet.getElementX() + objet.getElementLength() - 5 || 
				this.elementY < objet.getElementY() + objet.getElementHeight() || this.elementY > objet.getElementY() + objet.getElementHeight() + 5){return false;}
		else{return true;}
	}
}
