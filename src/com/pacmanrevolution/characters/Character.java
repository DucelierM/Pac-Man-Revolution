package com.pacmanrevolution.characters;
import com.pacmanrevolution.game.Element;

abstract class Character extends Element {
	protected int characterSpeed = 100;
	protected int characterX;
	protected int characterY;
	
	/* GETTERS ET SETTERS  */
	
	public int getCharacterSpeed() {
		return characterSpeed;
	}
	public void setCharacterSpeed(int characterSpeed) {
		this.characterSpeed = characterSpeed;
		
	}
	public int getCharacterX() {
		return characterX;
	}
	public void setCharacterX(int characterX) {
		this.characterX = characterX;
	}
	public int getCharacterY() {
		return characterY;
	}
	public void setCharacterY(int characterY) {
		this.characterY = characterY;
	}

	

}
