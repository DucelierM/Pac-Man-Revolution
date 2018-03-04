package com.pacmanrevolution.characters;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;
import com.pacmanrevolution.game.MapsGame;
import com.pacmanrevolution.objets.Wall;



public class Clyde extends Ghost{

	//public  Sound soundEffects[];
	
		public Clyde( int elementX,int elementY) {

			super(new ImageIcon("sprites/Clyde/Clyde0.png"),"sprites/Clyde/Clyde0.png",
					elementX,elementY,35,35,0,5,"RIGHT","0","0",100,"Clyde");
			
			super.elementImg=elementIco.getImage();
			
		}

		public Clyde() {
			super(new ImageIcon("sprites/PacMan/PacMan0.png"),"sprites/PacMan/PacMan0.png",
					50,50,35,35,0,5,"RIGHT","0","0",100,"Clyde");
			
			super.elementImg=elementIco.getImage();

		}

	
	public void load(MapsGame mapsGame, PacMan pac) {
		
		int ratio = 100;
		ratio= ratio / this.characterSpeed;
		
		this.meetWall(mapsGame);
		this.moveCharacter();
		this.controlClyde(pac, mapsGame);
		this.animationGhost();
		
		if(this.chronoSpeed == ratio) {
			
			this.meetWall(mapsGame);
			this.moveCharacter();
			this.controlClyde(pac, mapsGame);
			
			this.meetWall(mapsGame);
			this.moveCharacter();
			this.controlClyde(pac, mapsGame);
			
			
			this.chronoSpeed = 0;
		}
		
		this.chronoSpeed++;
	}
	

	//IAclyde

		public void controlClyde(PacMan pac , MapsGame mapsGame) {

		
		
			
			// clyde poursuit pac sans mur 

			if (this.getElementX()< pac.getElementX())		//clyde se trouve a gauche de pac man		
			{this.setMove("RIGHT");} 
				
			else if(this.getElementY()< pac.getElementY())	//clyde se trouve au dessus  de pac man
				{this.setMove("DOWN");} 
						
			else if(this.getElementY() > pac.getElementY())		//clyde se trouve en dessous  de pac man
				{this.setMove("UP");} 
		
			else if ( this.getElementX() > pac.getElementX())	//clyde se trouve a droite de pac man
			{this.setMove("LEFT"); this.setNextMove("0");} 
			
			
			// cas ou clyde rencontre un obstacle par le haut et pac man se trouve derriere l'obstacle 
			 
			 
			else if (this.meetWall(mapsGame)=="blockDown" && this.getElementY() > pac.getElementY()
					&& this.getElementX() > pac.getElementX() && this.getMove()!= "RIGHT") 
			{this.setMove("LEFT"); this.setNextMove("UP");}
			 
			else if (this.meetWall(mapsGame)=="blockDown" && this.getElementY() > pac.getElementY() 
					&& this.getElementX() <= pac.getElementX() && this.getMove()!= "LEFT") 
			{this.setMove("RIGHT"); this.setNextMove("UP");}
			 
			 
			// cas ou clyde rencontre un obstacle par le bas et pac man se trouve derriere l'obstacle 
			 
			 
			else if (this.meetWall(mapsGame)=="blockUp" && this.getElementY() < pac.getElementY()
					&& this.getElementX() > pac.getElementX() && this.getMove()!= "RIGHT") 
			{this.setMove("LEFT"); this.setNextMove("DOWN");}
						 
			else if (this.meetWall(mapsGame)=="blockUp" && this.getElementY() < pac.getElementY() 
					&& this.getElementX() <= pac.getElementX() && this.getMove()!= "LEFT") 
				{this.setMove("RIGHT"); this.setNextMove("DOWN");}
			 
			 	 
			// cas ou clyde rencontre un obstacle par la droite et pac man se trouve derriere l'obstacle 
			 
			 
			else if (this.meetWall(mapsGame)=="blockRight" && this.getElementX() > pac.getElementX()
					&& this.getElementY() < pac.getElementY() && this.getMove()!= "UP") 
			{this.setMove("DOWN"); this.setNextMove("LEFT");}
			 
			else if (this.meetWall(mapsGame)=="blockRight" && this.getElementX() > pac.getElementX()
					&& this.getElementY() >= pac.getElementY() && this.getMove()!= "DOWN") 
			{this.setMove("UP"); this.setNextMove("LEFT");}
			
			
			
			// cas ou clyde rencontre un obstacle par la droite et pac man se trouve derriere l'obstacle 
			 
			 
			else if (this.meetWall(mapsGame)=="blockLeft" && this.getElementX() < pac.getElementX()
					&& this.getElementY() < pac.getElementY() && this.getMove()!= "UP") 
			{this.setMove("DOWN"); this.setNextMove("RIGHT");}
						 
			else if (this.meetWall(mapsGame)=="blockLeft" && this.getElementX() < pac.getElementX()
					&& this.getElementY() >= pac.getElementY() && this.getMove()!= "DOWN") 
			{this.setMove("UP"); this.setNextMove("RIGHT");}
								 
			
							
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