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
	protected ArrayList<ArrayList<String>> tabPaths = new ArrayList<ArrayList<String>>();
	
	
	
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
		
	
		
		// construction du chemin le plus court pour aller vers pac man .
		
public String locate(PacMan pac ,MapsGame map){
				
			// on determine la position du character et de pacMan dans le tableau bidimentionnel .
				
				int posX = this.getElementX()/35;
				int posY = this.getElementY()/35;
				
				int posPacX = pac.getElementX()/35;
				int posPacY = pac.getElementX()/35;
				
				
				boolean up = false;
				boolean down = false;
				boolean left = false;
				boolean right = false;
				int nbPossibilite = 0;
				
				
				
			// initialisation des chemins 
				
			
			
			//recherche du chemin pour trouver pac man
				
				if(this.elementX % 35 == 0 &&  this.elementY % 35 == 0) {
					
					while((map.getComposition(posX,posY)) != (map.getComposition(posPacX,posPacY))) {
						
					// on indentifie tous les elements adjacent a la position du fantome et on determine quel chemein prendre 
						
					
						if(//element du haut   
								map.getComposition(posX,posY+1) < 15){up = true; nbPossibilite++;
						}
						
						else if( //element du bas
								map.getComposition(posX,posY-1) < 15){down = true; nbPossibilite++;
						}
						
						else if(//element de gauche
							    map.getComposition(posX-1,posY) < 15){left = true; nbPossibilite++;
						}
						
						else if(
							  //element du bas
								map.getComposition(posX,posY-1) < 15){right = true; nbPossibilite++;	 
						}
					
						
						// test du(des) prochain mouvement de clyde
						
						/*if(nbPossibilite==0) {
							this.tabPaths.addAll("free");
						}
						
						else if(nbPossibilite==1) {
						
							if(up){this.tabPaths.add("up");}
							else if(down){this.tabPaths.add("down");}
							else if(left){this.tabPaths.add("left");}
							else if(right){this.tabPaths.add("right");}
						
						}
						
						else if(nbPossibilite==2) {
							
							if(up && down){this.tabPaths.add("upDown");}
							else if(up && left){this.tabPaths.add("upLeft");}
							else if(up && right){this.tabPaths.add("upRight");}
							else if(down && left){this.tabPaths.add("downLeft");}
							else if(down && right){this.tabPaths.add("downRight");}
							else if(left && right){this.tabPaths.add("leftRight");}
						
						}
						
						else if(nbPossibilite==3) {
							
							if(up && down && left){this.tabPaths.add("upDownLeft");}
							else if(up && down && right){this.tabPaths.add("upDownRight");}
							else if(up && left && right){this.tabPaths.add("upLeftRight");}
							else if(down && left && right){this.tabPaths.add("downLeftRight");}
							
						}
						
						else if(nbPossibilite==4) {
							this.tabPaths.add("block");
						}
						*/
						
					  //creation d'un tableaux de chemins 
						
					  //determination du chemin a prendre et application 
					}
				}
				return blocked;
				
				
			}

}