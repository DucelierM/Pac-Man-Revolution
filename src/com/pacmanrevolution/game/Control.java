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
		}
		
		 if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			 Main.sc1.pac.setMove("LEFT");
		}

		 if (e.getKeyCode() == KeyEvent.VK_UP) {		
			 Main.sc1.pac.setMove("UP");
		}

		 if (e.getKeyCode() == KeyEvent.VK_DOWN) {		
			 Main.sc1.pac.setMove("DOWN");
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
