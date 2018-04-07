package com.pacmanrevolution.characters;


import javax.swing.ImageIcon;

import com.pacmanrevolution.audio.Audio;
import com.pacmanrevolution.display.Score;
import com.pacmanrevolution.game.Element;
import com.pacmanrevolution.game.MapsGame;


public class PacMan extends Character{
	private int playerLife = 3;
	
	//public  Sound soundEffects[];
	
	public PacMan(int elementX,int elementY) {

		super(new ImageIcon("sprites/PacMan/PacMan0.png"),"sprites/PacMan/PacMan0.png",
				elementX,elementY,10,10,0,1,"RIGHT","0","0",30);
		super.elementImg=elementIco.getImage();
		
		
	}


	public void load (MapsGame mapsGame, Score score) {
		
		int ratio = 100;
		ratio= ratio / this.characterSpeed;
		
		this.meetWall(mapsGame);	
		this.controlCharacter();
		this.moveCharacter();
		
		
	// objets mangeables 
		
		this.swallowItem(mapsGame, score);
		
		
		
		if(this.chronoSpeed >= ratio) {
			
			for(int i =0 ; i<4 ; i++) {
				
				this.meetWall(mapsGame);
				this.controlCharacter();
				this.moveCharacter();
				
				
			// objets mangeables 
				
				this.swallowItem(mapsGame, score);			
			}		
				this.chronoSpeed = 0;
		}
		
		this.animationPacMan();
		this.haveWon(mapsGame, score);
		this.chronoSpeed++;
	
	}
	
	
	/*	
	public void swallowItem(MapsGame mapsGame, Score score) {
		int mapPositionX = 1;
		int mapPositionY = 1;
		// on determine la position du character selon la matrice .
		if (this.getMove() == "RIGHT" || this.getMove() == "DOWN") {
			mapPositionX = mapPositionX + this.getElementX() / 35;
			mapPositionY = mapPositionY + this.getElementY() / 35;
		}
		else if (this.getMove() == "LEFT" || this.getMove() == "UP") {
			mapPositionX = mapPositionX + (this.getElementX() + 34) / 35;
			mapPositionY = mapPositionY + (this.getElementY() + 34) / 35;
		}
		
		// traitement des collisions en fonction de la matrice
		
					if(mapsGame.getComposition(mapPositionX+1,mapPositionY) >=15 ) {	
						blockLeft = true;
					 
					}
				
					if(mapsGame.getComposition(mapPositionX-1,mapPositionY) >=15) {	
						blockRight = true;
					
					}
				
					
					if(mapsGame.getComposition(mapPositionX,mapPositionY-1) >=15) {
						
						blockDown = true;
							
					}
			
					if(mapsGame.getComposition(mapPositionX,mapPositionY+1) >=15) {	
						blockUp = true;
								
					}
			// determinatation de l'item avalée
			if (mapsGame.getComposition(mapPositionX+1,mapPositionY)  >= 10 &&
					mapsGame.getComposition(mapPositionX+1,mapPositionY)  <= 14) {
				// fruits
				mapsGame.getTabElements().remove(i);
				score.setScoreLife(score.getScoreLife() + 40);
				// Audio.playSound("/audio/pacmanSwallowFruit.wav");
			}
			
			if (mapsGame.getComposition(mapPositionX+1,mapPositionY) == 6) {
				// fruits
				mapsGame.getTabElements().remove(i);
				score.setScoreLife(score.getScoreLife() + 40);
				// Audio.playSound("/audio/pacmanSwallowFruit.wav");
			}
			
*/
	
	// animation du personnage
	
		public void animationPacMan(){
			
			if (move =="RIGHT") {

					// changement d'animation de PacMan selon la direction 
					
					if(idAnimationImgElement==0) {
						elementRefImg = "sprites/PacMan/PacMan8.png";
					}
					else if (idAnimationImgElement==5) {
						elementRefImg = "sprites/PacMan/PacMan0.png";
					}
					else if (idAnimationImgElement==10) {
						elementRefImg = "sprites/PacMan/PacMan1.png";
					}
					else if (idAnimationImgElement==15) {
						elementRefImg = "sprites/PacMan/PacMan0.png";
					}
			}
			
			
			else if (move=="LEFT") {

						
					if(super.idAnimationImgElement==0) {
						super.elementRefImg = "sprites/PacMan/PacMan8.png";
					}
					else if (super.idAnimationImgElement==5) {
						super.elementRefImg = "sprites/PacMan/PacMan2.png";
					}
					else if (super.idAnimationImgElement==10) {
						super.elementRefImg = "sprites/PacMan/PacMan3.png";
					}
					else if (super.idAnimationImgElement==15) {
						super.elementRefImg = "sprites/PacMan/PacMan2.png";
					}	
				
			}
			
			
			else if (move == "UP") {
					
					if(super.idAnimationImgElement==0) {
						super.elementRefImg = "sprites/PacMan/PacMan8.png";
					}
					else if (super.idAnimationImgElement==5) {
						super.elementRefImg = "sprites/PacMan/PacMan4.png";
					}
					else if (super.idAnimationImgElement==10) {
						super.elementRefImg = "sprites/PacMan/PacMan5.png";
					}
					else if (super.idAnimationImgElement==15) {
						super.elementRefImg = "sprites/PacMan/PacMan4.png";
					}	
				
			}
			
			else if (move == "DOWN" ) {
					if(super.idAnimationImgElement==0) {
						super.elementRefImg = "sprites/PacMan/PacMan8.png";
					}
					else if (super.idAnimationImgElement==5) {
						super.elementRefImg = "sprites/PacMan/PacMan6.png";
					}
					else if (super.idAnimationImgElement==10) {
						super.elementRefImg = "sprites/PacMan/PacMan7.png";
					}
					else if (super.idAnimationImgElement==15) {
						super.elementRefImg = "sprites/PacMan/PacMan6.png";
					}
			}

			// affectation de l'animation de PacMan
			
			super.elementIco = new ImageIcon(elementRefImg);
			super.elementImg =elementIco.getImage();
			
			if(super.idAnimationImgElement==15) {
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

		public boolean contactItem(Element piece){		
			if(this.contactArriere(piece) == true 
					|| this.contactAvant(piece) == true 
					|| this.contactDessous(piece) == true 
					|| this.contactDessus(piece) == true){
				return true;			
			}else{return false;}
		}
		
	
	
		
	// pac man mange un item et applique l'effet en fonction de l'item avalée 
	
	
	public void swallowItem (MapsGame mapsGame , Score score) {
		for(int i =0;i<mapsGame.getTabElements().size();i++){
			if(this.proche( mapsGame.getTabElements().get(i))){	
				if(this.contactItem( mapsGame.getTabElements().get(i))){
					
					// determinatation de l'item avalée 
					
						if( mapsGame.getTabElements().get(i).getIdElement() >= 10 &&
							mapsGame.getTabElements().get(i).getIdElement() <= 14){
							
						//fruits	
								mapsGame.getTabElements().remove(i);
								score.setScoreLife(score.getScoreLife() + 40);
							//	Audio.playSound("/audio/pacmanSwallowFruit.wav");
						}
								
						else if( mapsGame.getTabElements().get(i).getIdElement() == 6){
									
						//pac gum
								mapsGame.getTabElements().remove(i);
								score.setScoreLife(score.getScoreLife() + 10);
							//	Audio.playSound("/audio/pacmanSwallowPacFreeze.wav");
						}
						
						else if( mapsGame.getTabElements().get(i).getIdElement() == 9){
							mapsGame.getTabElements().remove(i);
							score.setScoreLife(score.getScoreLife() + 30);
							//Audio.playSound("/audio/pacmanSwallowPacPrika.wav");
							
						//effect du pacPrika
							this.characterSpeed = 100;				
						}
						
						else if( mapsGame.getTabElements().get(i).getIdElement() == 7){
							mapsGame.getTabElements().remove(i);
							score.setScoreLife(score.getScoreLife() + 50);
							//Audio.playSound("/audio/pacmanSwallowSuperPacGum.wav");
							
							//effet du superPacGum
						}	
						
						
						else if(this.contactItem( mapsGame.getTabElements().get(i))){
							if( mapsGame.getTabElements().get(i).getIdElement() == 8){
									mapsGame.getTabElements().remove(i);
									score.setScoreLife(score.getScoreLife() + 20);
							//		Audio.playSound("/audio/pacmanSwallowPacFreeze.wav");
								//effet du pacFreeze
					}
				
				}
 			}
		}
	}
}


	
	public void haveWon (MapsGame mapsGame , Score score) {
		
		int countPacGum = 0;
		for(int i =0;i<mapsGame.getTabElements().size();i++){
						if( mapsGame.getTabElements().get(i).getIdElement() == 6){
						countPacGum++;
						break;
			}				
 		}
		
		if(countPacGum == 0) {System.out.println("TU AS GAGNE !!!!!");}
		
}

	

// pac man perd une vie lorqu'il touche un fantome si il n'a plus de vie , c'est game over !
	
	public void loseLife (MapsGame mapsGame , Score score) {
		for(int i =0;i<mapsGame.getTabElements().size();i++){
			if(this.proche( mapsGame.getTabElements().get(i))){	
				if(this.contactItem( mapsGame.getTabElements().get(i))){
						if( mapsGame.getTabElements().get(i).getIdElement() >= 2 &&
							mapsGame.getTabElements().get(i).getIdElement() <= 5 ){
							//Audio.playSound("audio/pacmanLoseLife.wav");
							//perte d'une vie
								
								if(this.playerLife <= 0) {
									
									System.out.println("GAME OVER  !!!!!");
								}
								
								this.playerLife--;				
						}
					}
				}
			}
	}
	
	
}



