package com.pacmanrevolution.characters;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Main;
import com.pacmanrevolution.game.MapsGame;
import com.pacmanrevolution.objets.Wall;


public abstract class Ghost  extends Character  {
	protected boolean isFrozen = false;
	protected boolean isEaten = false;
	protected String ghostName = "";

	
	//protected Sound soundEffectGhost = null;

	// collision entre un caracter et un mur 

	public Ghost(ImageIcon elementIco,
			String elementRefImg,
			int elementX,
			int elementY,
			int elementHeight, 
			int elementLength, 
			int idAnimationImgElement,
			int idElement,
			String move,
			String nextMove,
			String blocked,
			int characterSpeed,
			String ghostName
			) 
			{
		super(elementIco,elementRefImg,elementX,elementY,elementHeight,elementLength,idAnimationImgElement,idElement,move,nextMove,blocked,characterSpeed);
		
		this.ghostName = ghostName;
	}

	
		public String getBlocked() {
			return blocked;
		}
		
		public void setBlocked(String blocked) {
			this.blocked = blocked;
		}
		
		public String getMove() {
			return move;
		}
		
		public void setMove(String move) {
			this.move = move;
		}
		
		
		public int getElementX() {
			return elementX;
		}
		
		public void setElementX(int characterX) {
			this.elementX = characterX;
		}
		
		public int getElementY() {
			return elementY;
		}
		
		public void setElementY(int characterY) {
			this.elementY = characterY;
		}


		// animations clyde

		public void animationGhost(){
			
			if (move =="RIGHT") {
				

				// changement d'animation de Clyde selon la direction 
					
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"0.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"1.png";
					}
			}
			
			else if (move =="LEFT") {
				
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"2.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"3.png";
					}	
			}
			
			
			else if (move =="UP") {	
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"4.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"5.png";		
					}
			}
			
			
			
			else if (move =="DOWN") {
					if (this.idAnimationImgElement==4 || this.idAnimationImgElement == 12 ){
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"6.png";
					}
					else if (this.idAnimationImgElement==0 || this.idAnimationImgElement == 8 ) {
						this.elementRefImg = "sprites/"+ghostName+"/"+ghostName+"7.png";
					}
			}
			
		
			// affectation de l'animation des characters
			
			this.elementIco = new ImageIcon(this.elementRefImg);
			this.elementImg =this.elementIco.getImage();
			
			if(this.idAnimationImgElement==12) {
				this.idAnimationImgElement=0;
			} else {
			this.idAnimationImgElement++;
			}
			
		}
		

		public void controlGhost(PacMan pac, MapsGame mapsGame) {

			// on determine la position de clyde selon la matrice .

			int mapPositionXClyde = 1;
			int mapPositionYClyde = 1;

			if (this.getMove() == "RIGHT" || this.getMove() == "DOWN") {

				mapPositionXClyde = mapPositionXClyde + this.getElementX() / 35;
				mapPositionYClyde = mapPositionYClyde + this.getElementY() / 35;
			}

			else if (this.getMove() == "LEFT" || this.getMove() == "UP") {

				mapPositionXClyde = mapPositionXClyde + (this.getElementX() + 34) / 35;
				mapPositionYClyde = mapPositionYClyde + (this.getElementY() + 34) / 35;
			}

			// on determine la position de pacman selon la matrice .

			int mapPositionXPacMan = 1;
			int mapPositionYPacMan = 1;

			if (pac.getMove() == "RIGHT" || pac.getMove() == "DOWN") {

				mapPositionXPacMan = mapPositionXPacMan + pac.getElementX() / 35;
				mapPositionYPacMan = mapPositionYPacMan + pac.getElementY() / 35;
			}

			else if (pac.getMove() == "LEFT" || pac.getMove() == "UP") {

				mapPositionXPacMan = mapPositionXPacMan + (pac.getElementX() + 34) / 35;
				mapPositionYPacMan = mapPositionYPacMan + (pac.getElementY() + 34) / 35;
			}
			
		

			// traitement des chemins possibles en fonction de la matrice

			int map[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

			};

			int curseur = 2;

			map[mapPositionYClyde][mapPositionXClyde] = 1;
			
			
/*-----------------------------------------------------------------------------------------------*/	

			// tracage des chemins possibles

			while (map[mapPositionYPacMan][mapPositionXPacMan] == 0) {

				for (int ligne = 1; ligne < map.length - 1; ligne++) {
					for (int colonne = 1; colonne < map[0].length - 1; colonne++) {

						// bas
						if (mapsGame.getComposition(ligne, colonne) < 15
								&& mapsGame.getComposition(ligne, colonne) != 2
								&& mapsGame.getComposition(ligne, colonne) != 3
								&& mapsGame.getComposition(ligne, colonne) != 4
								&& mapsGame.getComposition(ligne, colonne) != 5
								
								&& map[ligne][colonne - 1] == curseur - 1
								&& map[ligne][colonne] == 0) {
							map[ligne][colonne] = curseur;
						}

						// haut
						if (mapsGame.getComposition(ligne, colonne) < 15 
								
								&& mapsGame.getComposition(ligne, colonne) != 2
								&& mapsGame.getComposition(ligne, colonne) != 3
								&& mapsGame.getComposition(ligne, colonne) != 4
								&& mapsGame.getComposition(ligne, colonne) != 5
								
								&& map[ligne][colonne + 1] == curseur - 1
								&& map[ligne][colonne] == 0) {
							map[ligne][colonne] = curseur;
						}

						// droite
						if (mapsGame.getComposition(ligne, colonne) < 15 
								
								&& mapsGame.getComposition(ligne, colonne) != 2
								&& mapsGame.getComposition(ligne, colonne) != 3
								&& mapsGame.getComposition(ligne, colonne) != 4
								&& mapsGame.getComposition(ligne, colonne) != 5
								
								&& map[ligne + 1][colonne] == curseur - 1
								&& map[ligne][colonne] == 0) {
							map[ligne][colonne] = curseur;
						}

						// gauche
						if (mapsGame.getComposition(ligne, colonne) < 15 
								
								&& mapsGame.getComposition(ligne, colonne) != 2
								&&  mapsGame.getComposition(ligne, colonne) != 3
								&& mapsGame.getComposition(ligne, colonne) != 4
								&& mapsGame.getComposition(ligne, colonne) != 5
								
								&& map[ligne - 1][colonne] == curseur - 1
								&& map[ligne][colonne] == 0) {
							map[ligne][colonne] = curseur;
						}

					}

				}
				curseur++;
			}
			
			
/*-----------------------------------------------------------------------------------------------*/			

			// choix d'un chemin en fonction de pac man et affectation d'une direction
			
			if (this.getElementX() % 35 == 0 || this.getElementY() % 35 == 0) {	

			for (int i = 0; i < map.length + map[0].length - 1; i++) {

				// haut

				if (map[mapPositionYPacMan][mapPositionXPacMan] == map[mapPositionYClyde][mapPositionXClyde]) {
					this.setMove("0");
					break;

				}

				else if (map[mapPositionYPacMan + 1][mapPositionXPacMan] == map[mapPositionYPacMan][mapPositionXPacMan] - 1) {
					mapPositionYPacMan++;

					// haut
					if (map[mapPositionYPacMan][mapPositionXPacMan] == map[mapPositionYClyde][mapPositionXClyde]) {
						this.setMove("UP");
						break;
					}

				}

				// bas
				else if (map[mapPositionYPacMan - 1][mapPositionXPacMan] == map[mapPositionYPacMan][mapPositionXPacMan] - 1) {
					mapPositionYPacMan--;
					// bas
					if (map[mapPositionYPacMan][mapPositionXPacMan] == map[mapPositionYClyde][mapPositionXClyde]) {
						this.setMove("DOWN");
						break;
					}
				}

				// droite
				else if (map[mapPositionYPacMan][mapPositionXPacMan + 1] == map[mapPositionYPacMan][mapPositionXPacMan] - 1) {
					mapPositionXPacMan++;

					// droite
					if (map[mapPositionYPacMan][mapPositionXPacMan] == map[mapPositionYClyde][mapPositionXClyde]) {
						this.setMove("LEFT");
						break;
					}
				}

				// gauche
				else if (map[mapPositionYPacMan][mapPositionXPacMan - 1] == map[mapPositionYPacMan][mapPositionXPacMan] - 1) {
					mapPositionXPacMan--;

					// gauche
					if (map[mapPositionYPacMan][mapPositionXPacMan] == map[mapPositionYClyde][mapPositionXClyde]) {
						this.setMove("RIGHT");
						break;
					}
					

				}
			  }
			}
		}

}