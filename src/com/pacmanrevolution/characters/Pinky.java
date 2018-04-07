package com.pacmanrevolution.characters;

import javax.swing.ImageIcon;
import com.pacmanrevolution.game.MapsGame;




public class Pinky extends Ghost{

	//public  Sound soundEffects[];
	
		public Pinky( int elementX,int elementY) {

			super(new ImageIcon("sprites/Pinky/pinky0.png"),"sprites/Pinky/pinky0.png",
					elementX,elementY,20,20,0,4,"RIGHT","RIGHT","10",5,"pinky");
			
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
				this.characterSpeed = 35;
			}
			else {
				this.characterSpeed = 5;
			}
		}
	}