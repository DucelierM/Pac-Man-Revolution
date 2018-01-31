package com.pacmanrevolution.game;

import com.pacmanrevolution.objets.PacGum;

public class Chrono implements Runnable {
	
	private final int PAUSE = 3;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		while(true) {
			
			System.out.println("ok");
			try {
			Main.sc1.repaint();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}

}
