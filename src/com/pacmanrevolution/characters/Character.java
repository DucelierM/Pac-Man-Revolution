package com.pacmanrevolution.characters;
import com.pacmanrevolution.game.Element;
import com.pacmanrevolution.game.Main;
import com.pacmanrevolution.objets.Wall;

abstract class Character extends Element{
	protected int characterSpeed = 50;

	protected String move = "0";
	protected String blocked = "0";
	
	
	
	
	
	
	
	/* GETTERS ET SETTERS  */
	
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
	
	public int getCharacterSpeed() {
		return characterSpeed;
	}
	
	public void setCharacterSpeed(int characterSpeed) {
		this.characterSpeed = characterSpeed;
	}
	
	public int getElementX() {
		return elementX;
	}
	
	public void setElementX(int characterX) {
		this.elementX = characterX;
	}
	
	public int getElementY() {
		return elementY;
	}
	
	public void setElementY(int characterY) {
		this.elementY = characterY;
	}

	
	
	// collision entre un caracter et un mur 
	
	public void meetWall (Wall wall) {
		
				if(		this.elementX+this.elementLength == wall.getElementX() 				//contact  du mur par la gauche
						&& this.elementY+this.elementLength > wall.getElementY()			//permet de passer au dessus du mur 
						&& this.elementY < wall.getElementY()+wall.getElementLength()		//permet de passer en dessous du mur 
						&& this.move =="RIGHT")
					{Main.sc1.pac.setBlocked("BLOCKleft");}
							
				
				else if( this.elementX == wall.getElementX()+wall.getElementLength()		//contact  du mur par la droite
						&& this.elementY+this.elementLength > wall.getElementY()				//permet de passer au dessus du mur 
						&& this.elementY < wall.getElementY()+wall.getElementLength()			//permet de passer au dessous du mur 
						&& this.move =="LEFT")
					{Main.sc1.pac.setBlocked("BLOCKright");} 
				
			
				else if (this.elementY+this.elementHeight == wall.getElementY()				//contact  du mur par le haut
						&& this.elementX+this.elementLength > wall.getElementX()				//permet de passer à gauche du mur
						&& this.elementX < wall.getElementX()+wall.getElementLength()			//permet de passer à droite du mur
						&& this.move =="DOWN")
					{Main.sc1.pac.setBlocked("BLOCKup");}
				
		
				else if (this.elementY == wall.getElementY()+wall.getElementHeight()		//contact  du mur par le bas
						&& this.elementX+this.elementLength > wall.getElementX()				//permet de passer à gauche du mur
						&& this.elementX < wall.getElementX()+wall.getElementLength()			//permet de passer à droite du mur
						&& this.move =="UP")
					{Main.sc1.pac.setBlocked("BLOCKdown");}
				
				
				else{Main.sc1.pac.setBlocked("0");}
				

	}
}
