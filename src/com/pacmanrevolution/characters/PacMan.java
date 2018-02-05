package com.pacmanrevolution.characters;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.pacmanrevolution.game.Control;
import com.pacmanrevolution.game.Main;
import com.pacmanrevolution.objets.Wall;

public class PacMan extends Character implements Runnable{
	private int playerLife = 3;
	
	//public  Sound soundEffects[];

	public PacMan() {
		this.imgElement = "sprites/PacManMove/PacMan8.png";
		this.idAnimationImgElement = 0;
		
		this.elementIco = new ImageIcon(imgElement);
		this.elementImg= elementIco.getImage();
		this.elementHeight=35;
		this.elementLength=35;
		this.elementX=21;
		this.elementY=21;
		this.characterSpeed=2;
		
		
	}
		
		// reponses des touches sur pacman 
	
		public void deplacerPacMan(){
			
			if (move =="RIGHT") {
				
				// changement de position de PacMan selon la direction 
				
				if (elementX <= 658 && blocked != "BLOCKleft"){ 
					elementX = elementX+2;
					blocked= "0";
					
					// changement d'animation de PacMan selon la direction 
					
					if(this.idAnimationImgElement==0) {
						this.imgElement = "sprites/PacManMove/PacMan8.png";
					}
					else if (this.idAnimationImgElement==4) {
						this.imgElement = "sprites/PacManMove/PacMan0.png";
					}
					else if (this.idAnimationImgElement==8) {
						this.imgElement = "sprites/PacManMove/PacMan1.png";
					}
					else if (this.idAnimationImgElement==12) {
						this.imgElement = "sprites/PacManMove/PacMan0.png";
					}
				}		
			}
			
			
			else if (move=="LEFT" && blocked!="BLOCKright"){
				
				if (elementX >= 7) {	
					elementX =elementX-2;
					blocked= "0";
						
					if(this.idAnimationImgElement==0) {
						this.imgElement = "sprites/PacManMove/PacMan8.png";
					}
					else if (this.idAnimationImgElement==4) {
						this.imgElement = "sprites/PacManMove/PacMan2.png";
					}
					else if (this.idAnimationImgElement==8) {
						this.imgElement = "sprites/PacManMove/PacMan3.png";
					}
					else if (this.idAnimationImgElement==12) {
						this.imgElement = "sprites/PacManMove/PacMan2.png";
					}	
				}	
			}
			
			
			else if (move == "UP" && blocked != "BLOCKdown"){
				
				if (elementY >= 7) {
					elementY = elementY-2;
					blocked= "0";
					
					if(this.idAnimationImgElement==0) {
						this.imgElement = "sprites/PacManMove/PacMan8.png";
					}
					else if (this.idAnimationImgElement==4) {
						this.imgElement = "sprites/PacManMove/PacMan4.png";
					}
					else if (this.idAnimationImgElement==8) {
						this.imgElement = "sprites/PacManMove/PacMan5.png";
					}
					else if (this.idAnimationImgElement==12) {
						this.imgElement = "sprites/PacManMove/PacMan4.png";
					}	
				}
			}
			
			else if (move == "DOWN" && blocked != "BLOCKup") {
				
				if (elementY <= 630) {		
					elementY=elementY+2;
					blocked= "0";
					
					if(this.idAnimationImgElement==0) {
						this.imgElement = "sprites/PacManMove/PacMan8.png";
					}
					else if (this.idAnimationImgElement==4) {
						this.imgElement = "sprites/PacManMove/PacMan6.png";
					}
					else if (this.idAnimationImgElement==8) {
						this.imgElement = "sprites/PacManMove/PacMan7.png";
					}
					else if (this.idAnimationImgElement==12) {
						this.imgElement = "sprites/PacManMove/PacMan6.png";
					}
				}
			}

			// affectation de l'animation de PacMan
			
			this.elementIco = new ImageIcon(imgElement);
			this.elementImg =elementIco.getImage();
			
			if(this.idAnimationImgElement==12) {
				this.idAnimationImgElement=0;
			}else {
			this.idAnimationImgElement++;
			}
		}
		


		@Override
		public void run() {

			while(true) {
	
				try {			
					
					Main.sc1.repaint();
					System.out.println("position X pacMan : "+ Main.sc1.pac.elementX);
					System.out.println("position Y pacMan : "+Main.sc1.pac.elementY);
					System.out.println(Main.sc1.pac.getMove());
					System.out.println(Main.sc1.pac.getBlocked());
					System.out.println("position Y Mur : " + Main.sc1.wall1.getElementY());
					System.out.println("position X Mur : " + Main.sc1.wall1.getElementX());
					
					this.idAnimationImgElement++;
				}catch(Exception e) {
					
					System.out.println(e.getMessage());
				}
				
				try {
				
					Thread.sleep(10);
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			} 
		}

		
		
//Methodes
		
		//controles de PacMan

	public void setMove(String move) {
			this.move = move;
			
			
		//getter et setters PacMan
			
		}

		public int getPlayerLife() {
			return playerLife;
		}

		public void setPlayerLife(int playerLife) {
			this.playerLife = playerLife;
		}

		public String getMove() {
			return move;
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
