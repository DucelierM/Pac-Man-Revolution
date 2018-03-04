package com.pacmanrevolution.game;

import java.awt.Button;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.pacmanrevolution.characters.PacMan;

public class Control  implements KeyListener{

	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D ){
			Main.sc1.pac.setNextMove("RIGHT");
		}
		
		 if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_Q ){
			 Main.sc1.pac.setNextMove("LEFT");
		 }

		 if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_Z){
			 Main.sc1.pac.setNextMove("UP");	
		}

		 if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){	
			 Main.sc1.pac.setNextMove("DOWN");
		}
	
		
	}

	
	public void keyReleased(KeyEvent e) {
	}

	
	public void keyTyped(KeyEvent e) {
	}


}
