package com.pacmanrevolution.characters;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.MapsGame;
import com.pacmanrevolution.objets.Wall;



public class Blinky extends Ghost{

	//public  Sound soundEffects[];
	
		public Blinky( int elementX,int elementY) {

			super(new ImageIcon("sprites/Blinky/Blinky0.png"),"sprites/Blinky/Blinky0.png",
					elementX,elementY,35,35,0,2,"RIGHT","RIGHT","0",1,"Blinky");
			
			super.elementImg=elementIco.getImage();
			
		}

		public Blinky() {
			super(new ImageIcon("sprites/PacMan/PacMan0.png"),"sprites/PacMan/PacMan0.png",
					50,50,35,35,0,2,"RIGHT","Right","0",1,"Blinky");
			
			super.elementImg=elementIco.getImage();

		}

	
	public void load(MapsGame mapsGame, PacMan pac) {
		
		int ratio = 100;
		ratio= ratio / this.characterSpeed;
		

		this.meetWall(mapsGame);
		this.moveCharacter();
		this.controlBlinky(pac);
		
		this.animationClyde();
		
		if(this.chronoSpeed == ratio) {
			
			this.meetWall(mapsGame);
			this.moveCharacter();
			this.controlBlinky(pac);
			
			this.meetWall(mapsGame);
			this.moveCharacter();
			this.controlBlinky(pac);
			
			
			this.chronoSpeed = 0;
		}
		
		this.chronoSpeed++;
	}
	
	// animations clyde

		public void animationClyde(){
			
			if (move =="RIGHT") {
				

				// changement d'animation de Clyde selon la direction 
					
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Blinky/Blinky0.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Blinky/Blinky1.png";
					}
			}
			
			else if (move =="LEFT") {
				
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Blinky/Blinky2.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Blinky/Blinky3.png";	
					}	
			}
			
			
			else if (move =="UP") {	
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Blinky/Blinky4.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Blinky/Blinky5.png";		
					}
			}
			
			
			
			else if (move =="DOWN") {
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Blinky/Blinky6.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Blinky/Blinky7.png";
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

		public void controlBlinky(PacMan pac) {
			
		
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