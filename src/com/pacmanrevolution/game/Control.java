package com.pacmanrevolution.game;

import java.awt.Button;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.pacmanrevolution.characters.PacMan;

public class Control implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Main.sc1.pac.setMove("RIGHT");
			Main.sc1.pac.imgElement = "sprites/PacManMove/PacMan0.png";
		}
		
		 if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			 Main.sc1.pac.setMove("LEFT");
			 Main.sc1.pac.imgElement = "sprites/PacManMove/PacMan2.png";
		}

		 if (e.getKeyCode() == KeyEvent.VK_UP) {		
			 Main.sc1.pac.setMove("UP");
			 Main.sc1.pac.imgElement = "sprites/PacManMove/PacMan5.png";
		}

		 if (e.getKeyCode() == KeyEvent.VK_DOWN) {		
			 Main.sc1.pac.setMove("DOWN");
			 Main.sc1.pac.imgElement = "sprites/PacManMove/PacMan5.png";
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
