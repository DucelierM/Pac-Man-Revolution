package com.pacmanrevolution.characters;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Main;
import com.pacmanrevolution.objets.Wall;


public class PacMan extends Character{
	private int playerLife = 3;
	
	//public  Sound soundEffects[];
	
	public PacMan( int elementX,int elementY) {

		super(new ImageIcon("sprites/PacMan/PacMan0.png"),"sprites/PacMan/PacMan0.png",
				elementX,elementY,35,35,0,25,"RIGHT","0");
		
		super.elementImg=elementIco.getImage();
		
	}

	public PacMan() {
		super(new ImageIcon("sprites/PacMan/PacMan0.png"),"sprites/PacMan/PacMan0.png",
				50,50,35,35,0,25,"RIGHT","0");
		
		super.elementImg=elementIco.getImage();
		
	}

	
		// animation du personnage
	
		public void animationPacMan(){
			
			if (move =="RIGHT") {

					// changement d'animation de PacMan selon la direction 
					
					if(idAnimationImgElement==0) {
						elementRefImg = "sprites/PacMan/PacMan8.png";
					}
					else if (idAnimationImgElement==9) {
						elementRefImg = "sprites/PacMan/PacMan0.png";
					}
					else if (idAnimationImgElement==18) {
						elementRefImg = "sprites/PacMan/PacMan1.png";
					}
					else if (idAnimationImgElement==27) {
						elementRefImg = "sprites/PacMan/PacMan0.png";
					}
			}
			
			
			else if (move=="LEFT") {

						
					if(super.idAnimationImgElement==0) {
						super.elementRefImg = "sprites/PacMan/PacMan8.png";
					}
					else if (super.idAnimationImgElement==9) {
						super.elementRefImg = "sprites/PacMan/PacMan2.png";
					}
					else if (super.idAnimationImgElement==18) {
						super.elementRefImg = "sprites/PacMan/PacMan3.png";
					}
					else if (super.idAnimationImgElement==27) {
						super.elementRefImg = "sprites/PacMan/PacMan2.png";
					}	
				
			}
			
			
			else if (move == "UP") {
					
					if(super.idAnimationImgElement==0) {
						super.elementRefImg = "sprites/PacMan/PacMan8.png";
					}
					else if (super.idAnimationImgElement==9) {
						super.elementRefImg = "sprites/PacMan/PacMan4.png";
					}
					else if (super.idAnimationImgElement==18) {
						super.elementRefImg = "sprites/PacMan/PacMan5.png";
					}
					else if (super.idAnimationImgElement==27) {
						super.elementRefImg = "sprites/PacMan/PacMan4.png";
					}	
				
			}
			
			else if (move == "DOWN" ) {
					if(super.idAnimationImgElement==0) {
						super.elementRefImg = "sprites/PacMan/PacMan8.png";
					}
					else if (super.idAnimationImgElement==9) {
						super.elementRefImg = "sprites/PacMan/PacMan6.png";
					}
					else if (super.idAnimationImgElement==18) {
						super.elementRefImg = "sprites/PacMan/PacMan7.png";
					}
					else if (super.idAnimationImgElement==27) {
						super.elementRefImg = "sprites/PacMan/PacMan6.png";
					}
			}

			// affectation de l'animation de PacMan
			
			super.elementIco = new ImageIcon(elementRefImg);
			super.elementImg =elementIco.getImage();
			
			if(super.idAnimationImgElement==27) {
				super.idAnimationImgElement=0;
			}else {
			super.idAnimationImgElement++;
			}
		}
		
	
		
	
//Methodes
		

		public int getPlayerLife() {
			return playerLife;
		}

		public void setPlayerLife(int playerLife) {
			this.playerLife = playerLife;
		}
	
		
		
	/*
	
	public boolean haveWon () {
		
	}
	
	

	public boolean swallowPacFreeze (PacMan.characterX , Pacman.caracterY , PacFreeze.quelquechose) {
		
	}

	public boolean swallowSuperPacGum () {
		
	}

	public boolean swallowFruit () {
		
	}

	public boolean swallowPacGum () {
		
	}

	public boolean swallowPacPrika () {
		
	}

	public boolean meetGhost () {
		
	}

	public boolean loseLife () {
		
	}
	*/
}
