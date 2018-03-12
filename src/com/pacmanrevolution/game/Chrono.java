package com.pacmanrevolution.game;

public class Chrono implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			try {			
				
			Main.sc1.repaint();	
				
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
			try {
			
				Thread.sleep(7);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		} 
	}

}
