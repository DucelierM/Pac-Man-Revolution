package com.pacmanrevolution.characters;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;
import com.pacmanrevolution.objets.Item;
import com.pacmanrevolution.objets.Wall;

public abstract class Character extends Element {
	
	
	protected String move = "RIGHT";
	protected String nextMove = "RIGHT";
	protected String blocked = "0";
	protected int characterSpeed = 1;
	protected int chronoSpeed = 0;
	
// Constructeurs 
	
	public Character(ImageIcon elementIco,
			String elementRefImg,
			int elementX,
			int elementY,
			int elementHeight, 
			int elementLength, 
			int idAnimationImgElement,
			int idElement,
			String move,
			String nextMove,
			String blocked,
			int characterSpeed)
		 {
		super(elementIco,elementRefImg,elementX,elementY,elementHeight,elementLength,idAnimationImgElement,idElement);
		
		this.move=move;
		this.nextMove=move;
		this.blocked=blocked;
		this.characterSpeed=characterSpeed;

		super.elementImg=elementIco.getImage();
	}
	

// GETTERS ET SETTERS 
	
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
	
	public String getNextMove() {
		return nextMove;
	}


	public void setNextMove(String nextMove) {
		this.nextMove = nextMove;
	}

// detection des collisions entre un personnage et un mur 

	public void meetWall (ArrayList<Wall> tabWall){
	
	boolean blockLeft = false;
	boolean blockRight = false;
	boolean blockUp = false;
	boolean blockDown = false;
	int nbCollision = 0;
	
// collision gauche
	
	for(int i =0;i<tabWall.size();i++){
		
	//contact du mur par la gauche
		 if(this.elementX+this.elementLength == tabWall.get(i).getElementX()
				 
	//annule la collision si il est au dessus du mur 
			&& this.getElementY()+this.getElementHeight() > tabWall.get(i).getElementY()	
			
	//annule la collision si il est en dessous du mur 
			&& this.getElementY() < tabWall.get(i).getElementY()+tabWall.get(i).getElementHeight()  
	
	//contact à droite de l'ecran
			|| this.elementX == 662){
			 	blockLeft = true;
			 	nbCollision++;
			 	break;
		}
	}	
	
// collision haut
	
	for(int i =0;i<tabWall.size();i++){
		
	//contact  du mur par le haut
		if (this.elementY+this.elementHeight == tabWall.get(i).getElementY()
	
	//annule la collision si il est a gauche du mur
			&& this.elementX + this.elementLength > tabWall.get(i).getElementX()
			
	//annule la collision si il est a droite du mur
			&& this.elementX < tabWall.get(i).getElementX() + tabWall.get(i).getElementLength()
	
	//contac en bas de l'ecran
			|| this.elementY == 638){
				blockUp = true;
				nbCollision++;
				break;
			}
		}
	
// collision droite
		
	for(int i =0;i<tabWall.size();i++){
		
	//contact  du mur par la droite
		if(this.getElementX() == tabWall.get(i).getElementX()+tabWall.get(i).getElementLength()	
				
	//annule la collision si il est au dessus du mur 
			&& this.getElementY()+this.getElementLength() > tabWall.get(i).getElementY()
			
	//annule la collision si il est en dessous du mur 		
			&& this.getElementY() < tabWall.get(i).getElementY()+tabWall.get(i).getElementLength() 
			
	//contact  à gauche de l'ecran	
			|| this.elementX == 0){
				blockRight = true;
				nbCollision++;
				break;
		} 
	}
	
// collision bas
	
	for(int i =0;i<tabWall.size();i++) {
		
	//contact  du mur par le bas
		if (this.getElementY() == tabWall.get(i).getElementY()+tabWall.get(i).getElementHeight()
		
	//annule la collision si il est a gauche du mur			
			&& this.getElementX()+this.getElementLength() > tabWall.get(i).getElementX()	
			
	//annule la collision si il est a droite du mur		
			&& this.getElementX() < tabWall.get(i).getElementX()+tabWall.get(i).getElementLength()
	
	//contact  en haut de l'ecran	
			|| this.elementY == 0){	
				blockDown = true;
				nbCollision++;
				break;
		}
	}
	
// traitement et affectation de la collision sur le personnage 
// (le nommage se fait dans l'ordre suivant : Up -> Down -> Left -> Right)
	
	
	if(nbCollision == 1){
		if (blockUp) {this.setBlocked("blockUp");}
		else if (blockLeft) {this.setBlocked("blockLeft");}
		else if (blockRight) {this.setBlocked("blockRight");}
		else if (blockDown) {this.setBlocked("blockDown");} 
	}
	
	else if(nbCollision == 2){
		if (blockLeft && blockUp) {this.setBlocked("blockUpLeft");}
		else if (blockLeft && blockDown) {this.setBlocked("blockDownLeft");}
		else if (blockRight && blockDown) {this.setBlocked("blockDownRight");}
		else if (blockRight && blockUp) {this.setBlocked("blockUpRight");}
		else if (blockDown && blockUp) {this.setBlocked("blockUpDown");}
		else if (blockLeft && blockRight) {this.setBlocked("blockLeftRight");}
	}
	
	else if(nbCollision == 3){
		if (blockLeft && blockUp && blockDown ) {this.setBlocked("blockUpDownLeft");}
		else if (blockLeft && blockDown && blockRight  ) {this.setBlocked("blockDownLeftRight");}
		else if (blockRight && blockDown && blockUp ) {this.setBlocked("blockUpDownRight");}
		else if (blockRight && blockUp && blockLeft ) {this.setBlocked("blockUpLeftRight");}
	}

	else if (nbCollision == 4 && blockRight && blockUp && blockLeft && blockDown){
		this.setBlocked("totalBlock");
	}
	
	else{this.setBlocked("0");}
}


//predispose la prochaine direction du personnage saisi par le joueur

	public int getCharacterSpeed() {
	return characterSpeed;
}


	public void setCharacterSpeed(int characterSpeed) {
	this.characterSpeed = characterSpeed;
}


	public void nextMoveCharacter() {
	if (this.nextMove=="RIGHT"
			&& this.getBlocked() != "blockLeft"
			&&  this.getBlocked() != "totalBlock"
			
			//3 collisions
			&&  this.getBlocked() != "blockUpDownLeft"
			&&  this.getBlocked() != "blockDownLeftRight"
			&&  this.getBlocked() != "blockUpLeftRight"	
		
			//2 collisions
			&&  this.getBlocked() != "blockUpLeft"
			&&  this.getBlocked() != "blockDownLeft"
			&&  this.getBlocked() != "blockLeftRight" 
	) {this.move="RIGHT";}
	
	
	if (this.nextMove=="LEFT"
			&&  this.getBlocked() != "totalBlock"
			
			&&  this.getBlocked() != "blockUpDownRight"
			&&  this.getBlocked() != "blockDownLeftRight"
			&&  this.getBlocked() != "blockUpLeftRight"
					
			&&  this.getBlocked() != "blockUpRight"
			&&  this.getBlocked() != "blockDownRight"
			&&  this.getBlocked() != "blockLeftRight"
			&&  this.getBlocked() != "blockRight"
	) {this.move="LEFT";}
	 
	if (this.nextMove=="UP"
			&& this.getBlocked() != "blockDown"
			&&  this.getBlocked() != "totalBlock"
		
		&&  this.getBlocked() != "blockUpDownRight"
		&&  this.getBlocked() != "blockUpDownLeft"
		&&  this.getBlocked() != "blockDownLeftRight"
	
		&&  this.getBlocked() != "blockDownLeft"
		&&  this.getBlocked() != "blockDownRight"
		&&  this.getBlocked() != "blockUpDown" 
			
	) {this.move="UP";}
	
	
	if (this.nextMove=="DOWN"
		&&  this.getBlocked() != "totalBlock"
			
		&&  this.getBlocked() != "blockUpDownRight"
		&&  this.getBlocked() != "blockUpDownLeft"
		&&  this.getBlocked() != "blockUpLeftRight"
				
		&&  this.getBlocked() != "blockUpRight"
		&&  this.getBlocked() != "blockUpLeft"
		&&  this.getBlocked() != "blockUpDown"
			
		&& this.getBlocked() != "blockUp" 	
			
	) {this.move="DOWN";}
	 
		
		
 
}


// applique le deplacement du personnage 

	public void moveCharacter() {
	
	// deplacer à gauche
	
		if (this.move=="RIGHT"
				
				//4 collisions
			&& this.blocked != "totalBlock"
			
				//3 collisions
			&& this.blocked != "blockUpDownLeft"
			&& this.blocked != "blockDownLeftRight"
			&& this.blocked != "blockUpLeftRight"	
			
				//2 collisions
			&& this.blocked != "blockUpLeft"
			&& this.blocked != "blockDownLeft"
			&& this.blocked != "blockLeftRight"
			
				//1 collision
			&& this.blocked != "blockLeft"
			)
		{ 
			this.elementX = this.elementX+1;
		}
	
		
	// deplacer à droite	
		
		else if (this.move=="LEFT"
				
			&&  this.blocked != "totalBlock"
			&&  this.blocked != "blockUpDownRight"
			&&  this.blocked != "blockDownLeftRight"
			&&  this.blocked != "blockUpLeftRight"
			&&  this.blocked != "blockUpRight"
			&&  this.blocked != "blockDownRight"
			&&  this.blocked != "blockLeftRight"
			&&	this.blocked != "blockRight"
			)
		{	
			this.elementX =this.elementX-1;		
		}
		
	// deplacer en bas
		
		else if(this.move=="UP"
				
			&&  this.blocked != "totalBlock"
			&&  this.blocked != "blockUpDownRight"
			&&  this.blocked != "blockUpDownLeft"
			&&  this.blocked != "blockDownLeftRight"
			&&  this.blocked != "blockDownLeft"
			&&  this.blocked != "blockDownRight"
			&&  this.blocked != "blockUpDown"
			&&	this.blocked != "blockDown"
			)
		{
			this.elementY = this.elementY-1;		
		}
		
		
	// deplacer en haut	
		
		else if(this.move=="DOWN"
				
			&&  this.blocked != "totalBlock"
			&&  this.blocked != "blockUpDownRight"
			&&  this.blocked != "blockUpDownLeft"
			&&  this.blocked != "blockUpLeftRight"
			&&  this.blocked != "blockUpRight"
			&&  this.blocked != "blockUpLeft"
			&&  this.blocked != "blockUpDown"
			&&	this.blocked != "blockUp"
			) 
		{	
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
