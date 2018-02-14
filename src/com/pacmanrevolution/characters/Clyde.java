package com.pacmanrevolution.characters;

import javax.swing.ImageIcon;



public class Clyde extends Ghost{

	//public  Sound soundEffects[];
	//public  Sound soundEffects[];
	
		public Clyde( int elementX,int elementY) {

			super(new ImageIcon("sprites/Clyde/Clyde0.png"),"sprites/Clyde/Clyde0.png",
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
			}
			
			else if (move =="LEFT") {
				
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Clyde/Clyde2.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Clyde/Clyde3.png";	
					}	
			}
			
			
			else if (move =="UP") {	
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Clyde/Clyde4.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Clyde/Clyde5.png";		
					}
			}
			
			
			
			else if (move =="DOWN") {
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/Clyde/Clyde6.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/Clyde/Clyde7.png";
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

		public void iaClyde(PacMan pac) {
			
	/*	
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
	*/	
		
		//clyde se dirige vers pac man
		
			if ( this.getElementX() > pac.getElementX())	//clyde se trouve a droite de pac man
				{this.setMove("LEFT");} 
				
			else if(this.getElementY()< pac.getElementY())	//clyde se trouve au dessus  de pac man
				{this.setMove("DOWN");} 
						
			else if(this.getElementY() > pac.getElementY())		//clyde se trouve en dessous  de pac man
				{this.setMove("UP");} 

			else if (this.getElementX()< pac.getElementX())		//clyde se trouve a gauche de pac man		
				{this.setMove("RIGHT");} 
			
			
			
		}	
			
		public void recoveryClyde(PacMan pac) {	
			
		/*	//clyde touche pac man et il y a un recovery time 
			
			 if (this.getElementY()+this.getElementHeight() == pac.getElementY()){	
				 this.setMove("UP");													//contact  du mur par le haut
			}
			
			else if(this.elementX+this.elementLength == pac.getElementX()){	
					this.setMove("LEFT");												//contact  du mur par la gauche	
			}
			
					
			else if(this.getElementX() == pac.getElementX()+pac.getElementLength()){	//contact  du mur par la droite
					this.setMove("RIGHT");
			} 

			else if (this.getElementY() == pac.getElementY()+pac.getElementHeight()){	//contact  du mur par le bas
					this.setMove("DOWN");}
			 
			
			 for(int i =0;i<5000; i++){
				 this.moveCharacter();
			}
			*/
	}
	
		
		
	
}