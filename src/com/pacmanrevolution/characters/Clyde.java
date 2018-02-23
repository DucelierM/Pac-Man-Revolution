package com.pacmanrevolution.characters;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.objets.Wall;



public class Clyde extends Ghost{

	//public  Sound soundEffects[];
	
		public Clyde( int elementX,int elementY) {

			super(new ImageIcon("sprites/Clyde/Clyde0.png"),"sprites/Clyde/Clyde0.png",
					elementX,elementY,35,35,0,25,"RIGHT","RIGHT","0",1,"Clyde");
			
			super.elementImg=elementIco.getImage();
			
		}

		public Clyde() {
			super(new ImageIcon("sprites/PacMan/PacMan0.png"),"sprites/PacMan/PacMan0.png",
					50,50,35,35,0,25,"RIGHT","Right","0",1,"Clyde");
			
			super.elementImg=elementIco.getImage();

		}

	
	public void load(ArrayList<Wall> tabWall, PacMan pac) {
		
		int ratio = 100;
		ratio= ratio / this.characterSpeed;
		
		this.meetWall(tabWall);
		this.moveCharacter();
		this.controlClyde(pac);
		
		this.animationClyde();
		
		if(this.chronoSpeed == ratio) {
			
			this.meetWall(tabWall);
			this.moveCharacter();
			this.controlClyde(pac);
			
			this.meetWall(tabWall);
			this.moveCharacter();
			this.controlClyde(pac);
			
			
			this.chronoSpeed = 0;
		}
		
		this.chronoSpeed++;
	}
	

	//IAclyde

		public void controlClyde(PacMan pac) {
			
			
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
			
	/*	
		public void recoveryClyde(PacMan pac) {	
			
			//clyde touche pac man et il y a un recovery time 
			
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
	}
	
		
	*/	
	
}