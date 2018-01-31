package com.pacmanrevolution.characters;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.pacmanrevolution.game.Control;
import com.pacmanrevolution.game.Main;

public class PacMan extends Character implements KeyListener{
	private int playerLife = 3;
	
	//public  Sound soundEffects[];

	public PacMan() {
		this.elementIco = new ImageIcon("sprites/PacManMove/PacMan0.png");
		this.elementImg= elementIco.getImage();
		this.characterX=21;
		this.characterY=21;
		
	
		
	}

		
		public boolean meetWall () {
			return false;
			
		}

		public int getCharacterX() {
			return characterX;
		}

		public int getCharacterY() {
			return characterY;
		}


		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				
				if (Main.sc1.pac.getCharacterX() <= 658) { // cas ou pac-man rencontre le bout de la Scene
					Main.sc1.pac.setCharacterX(Main.sc1.pac.getCharacterX() + 7); // on deplace pacman à droite 
				}
			
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {

				if (Main.sc1.pac.getCharacterX() >= 7) {	
					Main.sc1.pac.setCharacterX(Main.sc1.pac.getCharacterX()-7);
			}
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP) {
			if (Main.sc1.pac.getCharacterY() >= 7) {
				Main.sc1.pac.setCharacterY(Main.sc1.pac.getCharacterY()-7);
			}
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if (Main.sc1.pac.getCharacterY() <= 630) {
				
			Main.sc1.pac.setCharacterY(Main.sc1.pac.getCharacterY()+7);
			}
		}
			
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
