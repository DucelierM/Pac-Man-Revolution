package com.pacmanrevolution.characters;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Main;
import com.pacmanrevolution.objets.Wall;


public abstract class Ghost  extends Character  {
	protected boolean isFrozen = false;
	protected boolean isEaten = false;
	
	
	
	
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
			String blocked) 
			{
		super(elementIco,elementRefImg,elementX,elementY,elementHeight,elementLength,idAnimationImgElement,idElement,move,blocked);
		
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


		//public Ghost() {
		//	super();

		//}

	//public boolean meetPlayer (){
		
	//}

	//public boolean focusPlayer (){
		
	//}

}