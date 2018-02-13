package com.pacmanrevolution.characters;

import javax.swing.ImageIcon;



public class Clyde extends Ghost{

	//public  Sound soundEffects[];
	//public  Sound soundEffects[];
	
		public Clyde( int elementX,int elementY) {

			super(new ImageIcon("sprites/PacMan/PacMan0.png"),"sprites/PacMan/PacMan0.png",
					elementX,elementY,35,35,0,25,"RIGHT","0");
			
			super.elementImg=elementIco.getImage();
			
		}

		public Clyde() {
			super(new ImageIcon("sprites/PacMan/PacMan0.png"),"sprites/PacMan/PacMan0.png",
					50,50,35,35,0,25,"RIGHT","0");
			
			super.elementImg=elementIco.getImage();
		}

	
	
	// animations clyde

		public void animationClyde(){
			
			if (move =="RIGHT") {
				

				// changement d'animation de Clyde selon la direction 
					
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Clyde/Clyde0.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Clyde/Clyde1.png";
					}
				//	else { this.move = "DOWN";}
				
			}
			
			else if (move =="LEFT") {
				
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Clyde/Clyde2.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Clyde/Clyde3.png";	
					}	
				//	else { this.move = "UP";}
			}
			
			
			else if (move =="UP") {	
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Clyde/Clyde4.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Clyde/Clyde5.png";		
					}
				//	else { move = "RIGHT";}
			}
			
			
			
			else if (move =="DOWN") {
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Clyde/Clyde6.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Clyde/Clyde7.png";
					}
				//	else { move = "LEFT" ;}
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
		
		public void iaClyde() {
			
			if (this.elementX == 662)
				{this.move = "DOWN";}
				
			if (this.elementX == 0 )	
				{this.move = "UP";}
				
			 if(this.elementY == 0)
			 	{this.move = "RIGHT";}
				
			 if(this.elementY == 638)
			 	{this.move = "LEFT";}
		}
	
}