package com.pacmanrevolution.characters;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.MapsGame;
import com.pacmanrevolution.objets.Wall;



public class Pinky extends Ghost{

	//public  Sound soundEffects[];
	
		public Pinky( int elementX,int elementY) {

			super(new ImageIcon("sprites/Pinky/Pinky0.png"),"sprites/Pinky/Pinky0.png",
					elementX,elementY,35,35,0,4,"RIGHT","RIGHT","0",1,"Pinky0");
			
			super.elementImg=elementIco.getImage();
			
		}

		public Pinky() {
			super(new ImageIcon("sprites/Pinky/Pinky0.png"),"sprites/Pinky/Pinky0.png",
					50,50,35,35,0,4,"RIGHT","Right","0",1,"Pinky0");
			
			super.elementImg=elementIco.getImage();

		}

	
	public void load(MapsGame mapsGame, PacMan pac) {
		
		int ratio = 100;
		ratio= ratio / this.characterSpeed;
		
		this.meetWall(mapsGame);
		this.moveCharacter();
		this.controlPinky(pac);
		
		this.animationPinky();
		
		if(this.chronoSpeed == ratio) {
			
			this.meetWall(mapsGame);
			this.moveCharacter();
			this.controlPinky(pac);
			
			this.meetWall(mapsGame);
			this.moveCharacter();
			this.controlPinky(pac);
			
			
			this.chronoSpeed = 0;
		}
		
		this.chronoSpeed++;
	}
	
	// animations clyde

		public void animationPinky(){
			
			if (move =="RIGHT") {
				

				// changement d'animation de Clyde selon la direction 
					
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Pinky/Pinky0.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Pinky/Pinky1.png";
					}
			}
			
			else if (move =="LEFT") {
				
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Pinky/Pinky2.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Pinky/Pinky3.png";	
					}	
			}
			
			
			else if (move =="UP") {	
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Pinky/Pinky4.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Pinky/Pinky5.png";		
					}
			}
			
			
			
			else if (move =="DOWN") {
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Pinky/Pinky6.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Pinky/Pinky7.png";
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

		

		
	//IAclyde

		public void controlPinky(PacMan pac) {
			
		
		//changement de direction lorsqu'il est dans un mur
			
			if(this.elementY == 638 && this.move == "DOWN") {
				this.move="RIGHT";
			}
			
			else if(this.elementY == 0 && this.move == "UP") {
				this.move="LEFT";
			}
			
			else if(this.elementX == 0 && this.move == "LEFT") {
				this.move="DOWN";
			}
			
			else if(this.elementX == 662 && this.move == "RIGHT") {
				this.move="UP";
			}
			
		}
	}