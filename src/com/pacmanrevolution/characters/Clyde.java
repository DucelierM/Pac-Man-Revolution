package com.pacmanrevolution.characters;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Main;

public class Clyde extends Ghost implements Runnable{
	private int playerLife = 3;
	//Thread chronoPacMan = new Thread(new PacMan());
	//Thread chronoPacMan = new Thread();
	
	//public  Sound soundEffects[];


	public Clyde() {
		this.imgElement = "sprites/Clyde/Clyde0.png";
		this.idAnimationImgElement = 0;
		
		this.elementIco = new ImageIcon(imgElement);
		this.elementImg= elementIco.getImage();
		this.elementX=210;
		this.elementY=210;
		this.characterSpeed=2;
		
		
	}

		public void deplacerClyde(){
			
			if (move =="RIGHT") {
				
				// changement de position de PacMan selon la direction 
				if (elementX <= 658) { 
					elementX = elementX+2; 
					
				// changement d'animation de PacMan selon la direction 
					
					if(this.idAnimationImgElement==0) {
						this.imgElement = "sprites/PacManMove/PacMan8.png";
					}
					else if (this.idAnimationImgElement==3) {
						this.imgElement = "sprites/PacManMove/PacMan0.png";
					}
					else if (this.idAnimationImgElement==6) {
						this.imgElement = "sprites/PacManMove/PacMan1.png";
					}
					else if (this.idAnimationImgElement==9) {
						this.imgElement = "sprites/PacManMove/PacMan0.png";
					}
				}		
			}
			
			else if (move =="LEFT") {
				if (elementX >= 7) {	
					elementX =elementX-2;
					
					
					
					if(this.idAnimationImgElement==0) {
						this.imgElement = "sprites/PacManMove/PacMan8.png";
					}
					else if (this.idAnimationImgElement==3) {
						this.imgElement = "sprites/PacManMove/PacMan2.png";
					}
					else if (this.idAnimationImgElement==6) {
						this.imgElement = "sprites/PacManMove/PacMan3.png";
					}
					else if (this.idAnimationImgElement==9) {
						this.imgElement = "sprites/PacManMove/PacMan2.png";
					}
					
					
				}	
			}
			
			else if (move =="UP") {
				if (elementY >= 7) {
					elementY = elementY-2;
					
					
					if(this.idAnimationImgElement==0) {
						this.imgElement = "sprites/PacManMove/PacMan8.png";
					}
					else if (this.idAnimationImgElement==3) {
						this.imgElement = "sprites/PacManMove/PacMan4.png";
					}
					else if (this.idAnimationImgElement==6) {
						this.imgElement = "sprites/PacManMove/PacMan5.png";
					}
					else if (this.idAnimationImgElement==9) {
						this.imgElement = "sprites/PacManMove/PacMan4.png";
					}
					
				}
			}
			
			else if (move == "DOWN") {
				
				if (elementY <= 630) {		
					elementY=elementY+2;
					
					if(this.idAnimationImgElement==0) {
						this.imgElement = "sprites/PacManMove/PacMan8.png";
					}
					else if (this.idAnimationImgElement==3) {
						this.imgElement = "sprites/PacManMove/PacMan6.png";
					}
					else if (this.idAnimationImgElement==6) {
						this.imgElement = "sprites/PacManMove/PacMan7.png";
					}
					else if (this.idAnimationImgElement==9) {
						this.imgElement = "sprites/PacManMove/PacMan6.png";
					}
					
				}
			}
			
			// affectation de l'animation de PacMan
			
			this.elementIco = new ImageIcon(imgElement);
			this.elementImg =elementIco.getImage();
			
			if(this.idAnimationImgElement==8) {
				this.idAnimationImgElement=0;
			}else {
			this.idAnimationImgElement++;
			}
		}


		@Override
		public void run() {

			while(true) {
				
				
				
					
				try {			
				System.out.println(this.getMove());
					Main.sc1.repaint();
					
					
					
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
		
		
	// getters 
		
		public int getCharacterX() {
			return elementX;
		}

		public int getCharacterY() {
			return elementY;
		}

		//controles de PacMan

	public void setMove(String move) {
			this.move = move;
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
}