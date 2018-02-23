package com.pacmanrevolution.characters;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Main;
import com.pacmanrevolution.objets.Wall;


public abstract class Ghost  extends Character  {
	protected boolean isFrozen = false;
	protected boolean isEaten = false;
	protected String ghostName = "";
	
	
	
	//protected Sound soundEffectGhost = null;

	// collision entre un caracter et un mur 

	public Ghost(ImageIcon elementIco,
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
			int characterSpeed,
			String ghostName
			) 
			{
		super(elementIco,elementRefImg,elementX,elementY,elementHeight,elementLength,idAnimationImgElement,idElement,move,nextMove,blocked,characterSpeed);
		
		this.ghostName = ghostName;
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


		// animations clyde

		public void animationClyde(){
			
			if (move =="RIGHT") {
				

				// changement d'animation de Clyde selon la direction 
					
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"0.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"1.png";
					}
			}
			
			else if (move =="LEFT") {
				
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"2.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"3.png";
					}	
			}
			
			
			else if (move =="UP") {	
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"4.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"5.png";		
					}
			}
			
			
			
			else if (move =="DOWN") {
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"6.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"7.png";
					}
			}
			
		
			// affectation de l'animation des characters
			
			this.elementIco = new ImageIcon(this.elementRefImg);
			this.elementImg =this.elementIco.getImage();
			
			if(this.idAnimationImgElement==12) {
				this.idAnimationImgElement=0;
			} else {
			this.idAnimationImgElement++;
			}
			
		}
		
	
	//public boolean meetPlayer (){
		
	//}

	//public boolean focusPlayer (){
		
	//}

}