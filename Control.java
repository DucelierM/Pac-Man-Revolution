package com.pacmanrevolution.game;

import java.awt.Button;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.pacmanrevolution.characters.PacMan;

public class Control implements KeyListener{
	private  Button buttonLeft;
	private  Button buttonRight;
	private  Button buttonUp;
	private  Button buttonDown;
	private  Button buttonPausedMap;
	private  Button buttonSelect;
	private  Button buttonCancel;
	private Character character ;

	@Override
	public void keyPressed(KeyEvent e) {
		// implementation KeyListener
		
		// controles de PacMan 
		
		//Thread animCharacter = new Thread(new Chrono());
		//animCharacter.start();
		
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
		
		for(int i = 0 ; i<50 ; i++) {
		Main.sc1.pac.setCharacterY(Main.sc1.pac.getCharacterY()+1);
		}
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// implementation KeyListener

	}
	
	/*
	public boolean pushButtonLeft () {
		return false ;
	}

	public boolean pushButtonRignt () {
		return false ;
	}

	public boolean pushButtonUp () {
		return false ;
	}

	public boolean pushButtonDown () {
		return false ;
	}

	public boolean pushButtonPausedMap () {
		return false ;
	}

	public boolean pushButtonSelect () {
		return false ;
	}

	public boolean pushButtonCancel () {
		return false ;
	}
	*/
}
