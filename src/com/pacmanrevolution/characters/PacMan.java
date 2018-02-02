package com.pacmanrevolution.characters;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.pacmanrevolution.game.Control;
import com.pacmanrevolution.game.Main;

public class PacMan extends Character implements Runnable, KeyListener{
	private int playerLife = 3;
	//Thread chronoPacMan = new Thread(new PacMan());
	//Thread chronoPacMan = new Thread();
	
	//public  Sound soundEffects[];


	public PacMan() {
		this.elementIco = new ImageIcon("sprites/PacManMove/PacMan0.png");
		this.elementImg= elementIco.getImage();
		this.characterX=21;
		this.characterY=21;
		this.characterSpeed=2;
		
		
	}

		

		
		// getters 
		
		public int getCharacterX() {
			return characterX;
		}

		public int getCharacterY() {
			return characterY;
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

		public void deplacerPacMan(){
			
			if (move =="RIGHT") {
				if (characterX <= 658) { // cas ou pac-man rencontre le bout de la Scene
					characterX = characterX+2; // on deplace pacman à droite 
				}		
			}
			
			else if (move =="LEFT") {
				if (characterX >= 7) {	
					characterX =characterX-2;
				}	
			}
			
			else if (move =="UP") {
				if (characterY >= 7) {
					characterY = characterY-2;
				}
			}
			
			else if (move == "DOWN") {
				if (characterY <= 630) {		
					characterY=characterY+2;
				}
			}
			
		}


		@Override
		public void run() {

			while(true) {
				
				System.out.println(Main.sc1.pac.getMove());
				
					
				try {			
					Main.sc1.repaint();
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




		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		/*	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				setMove("RIGHT");
			}
			
			 if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				setMove("LEFT");
			}

			 if (e.getKeyCode() == KeyEvent.VK_UP) {		
				setMove("UP");
			}

			 if (e.getKeyCode() == KeyEvent.VK_DOWN) {		
				setMove("DOWN");
			}
			*/
		}




		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}




		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	
//Methodes
	/*
	public boolean haveWon () {
		
	}
	
	
	public boolean meetWall () {
		return false;
			
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
