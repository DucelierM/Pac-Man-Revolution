package com.pacmanrevolution.characters;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.objets.Wall;



public class Inky extends Ghost{

	//public  Sound soundEffects[];
	
		public Inky( int elementX,int elementY) {

			super(new ImageIcon("sprites/Blinky/Blinky0.png"),"sprites/Inky/Inky0.png",
					elementX,elementY,35,35,0,25,"RIGHT","RIGHT","0",1,"Inky");
			
			super.elementImg=elementIco.getImage();
			
		}

		public Inky() {
			super(new ImageIcon("sprites/Inky/Inky0.png"),"sprites/Inky/Inky0.png",
					50,50,35,35,0,25,"RIGHT","Right","0",1,"Inky");
			
			super.elementImg=elementIco.getImage();

		}

	
	public void load(ArrayList<Wall> tabWall, PacMan pac) {
		
		int ratio = 100;
		ratio= ratio / this.characterSpeed;
		
		System.out.println("ratio :" + ratio);
		System.out.println("chronoSpeed:" +this.chronoSpeed);
		System.out.println("characterSpeed:" +this.characterSpeed);

		this.meetWall(tabWall);
		this.moveCharacter();
		this.controlInky(pac);
		
		this.animationClyde();
		
		if(this.chronoSpeed == ratio) {
			
			this.meetWall(tabWall);
			this.moveCharacter();
			this.controlInky(pac);
			
			this.meetWall(tabWall);
			this.moveCharacter();
			this.controlInky(pac);
			
			
			this.chronoSpeed = 0;
		}
		
		this.chronoSpeed++;
	}
	
	// animations clyde

		public void animationClyde(){
			
			if (move =="RIGHT") {
				

				// changement d'animation de Clyde selon la direction 
					
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Inky/Inky0.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Inky/Inky1.png";
					}
			}
			
			else if (move =="LEFT") {
				
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Inky/Inky2.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Inky/Inky3.png";	
					}	
			}
			
			
			else if (move =="UP") {	
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Inky/Inky4.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Inky/Inky5.png";		
					}
			}
			
			
			
			else if (move =="DOWN") {
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Inkynky/Inky6.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Inky/Inky7.png";
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

		public void controlInky(PacMan pac) {
			
		
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