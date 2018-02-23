package com.pacmanrevolution.game;

import java.awt.Button;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.pacmanrevolution.characters.PacMan;

public class Control  implements KeyListener{

	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			Main.sc1.pac.setNextMove("RIGHT");
		}
		
		 if (e.getKeyCode() == KeyEvent.VK_LEFT){
			 Main.sc1.pac.setNextMove("LEFT");
		 }

		 if (e.getKeyCode() == KeyEvent.VK_UP){
			 Main.sc1.pac.setNextMove("UP");	
		}

		 if (e.getKeyCode() == KeyEvent.VK_DOWN){	
			 Main.sc1.pac.setNextMove("DOWN");
		}
		
	}

	
	public void keyReleased(KeyEvent e) {
	}

	
	public void keyTyped(KeyEvent e) {
	}


}
