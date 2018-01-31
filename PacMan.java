package com.pacmanrevolution.characters;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.pacmanrevolution.game.Control;

public class PacMan extends Character{
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
