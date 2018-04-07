package com.pacmanrevolution.characters;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.MapsGame;



public class Inky extends Ghost{

	//public  Sound soundEffects[];
	
		public Inky( int elementX,int elementY) {

			super(new ImageIcon("sprites/Inky/inky0.png"),"sprites/Inky/inky0.png",
					elementX,elementY,20,20,0,3,"RIGHT","RIGHT","0",15,"inky");
			
			super.elementImg=elementIco.getImage();
			
		}

		
		public void load(MapsGame mapsGame, PacMan pac) {
			
			int ratio = 100;
			ratio= ratio / this.characterSpeed;
			

			this.meetWall(mapsGame);
			this.moveCharacter();
			this.controlGhost(pac, mapsGame);
			this.boostGhost(pac);
			
			if(this.chronoSpeed >= ratio) {
				
				for(int i =0 ; i<3 ; i++) {
					
					this.meetWall(mapsGame);
					this.moveCharacter();
					this.controlGhost(pac , mapsGame);
					this.boostGhost(pac);
					}
				
				
				this.chronoSpeed = 0;
			}
			
			this.chronoSpeed++;
			this.animationGhost();
		}
		
		public void boostGhost(PacMan pac) {
			if(this.getElementX() == pac.getElementX() || this.getElementY() == pac.getElementY()) {
				this.characterSpeed = 90;
			}
			else {
				this.characterSpeed = 20;
			}
		}
		
	}