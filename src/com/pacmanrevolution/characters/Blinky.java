package com.pacmanrevolution.characters;


import javax.swing.ImageIcon;

import com.pacmanrevolution.game.MapsGame;




public class Blinky extends Ghost{

	//public  Sound soundEffects[];
	
		public Blinky( int elementX,int elementY) {

			super(new ImageIcon("sprites/Blinky/blinky0.png"),"sprites/Blinky/blinky0.png",
					elementX,elementY,20,20,0,2,"RIGHT","RIGHT","0",30,"blinky");
			
			super.elementImg=elementIco.getImage();
			
		}


	
	public void load(MapsGame mapsGame, PacMan pac) {
		
		int ratio = 100;
		ratio= ratio / this.characterSpeed;
		

		this.meetWall(mapsGame);
		this.moveCharacter();
		this.controlGhost(pac, mapsGame);
		
		
		if(this.chronoSpeed >= ratio) {
			
			for(int i =0 ; i<3 ; i++) {
			
			this.meetWall(mapsGame);
			this.moveCharacter();
			this.controlGhost(pac , mapsGame);
			
			}
			
			this.chronoSpeed = 0;
		}
		
		this.chronoSpeed++;
		this.animationGhost();
		
	}
	
}