package com.pacmanrevolution.characters;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.pacmanrevolution.game.Element;
import com.pacmanrevolution.game.MapsGame;
import com.pacmanrevolution.objets.Item;
import com.pacmanrevolution.objets.Wall;

public abstract class Character extends Element {
	
	
	protected String move = "RIGHT";
	protected String nextMoves[] = {"0","0"};
	protected String blocked = "0";
	protected int characterSpeed = 1;
	protected int chronoSpeed = 0;
	
// Constructeurs 
	
	public Character(ImageIcon elementIco,
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
			int characterSpeed)
		 {
		super(elementIco,elementRefImg,elementX,elementY,elementHeight,elementLength,idAnimationImgElement,idElement);
		
		this.move=move;
		this.nextMoves[0]=move;
		this.blocked=blocked;
		this.characterSpeed=characterSpeed;

		super.elementImg=elementIco.getImage();
	}
	

// GETTERS ET SETTERS 
	
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
	
	
// gestion des prochains mouvements 
	public String getNextMoves(int position) {
		if(position >= 0 && position <= nextMoves.length) {
			return nextMoves[position];
		}
		else { return "OUPS !!!";}
	}

	public void setNextMoves(int position ,String move) {
		if(position >= 0 && position <= nextMoves.length) {
			this.nextMoves[position] = move;
		}
	}
	
	public void updateNextMoves(String move) {
		
		int position = 0;
		
		// ajouts des predictions des coups
		
	//	if(this.move == "LEFT" && move == "RIGHT" && (this.nextMoves[position] == "UP" || this.nextMoves[position] == "DOWN")) {
			
	//		this.nextMoves[position+1] = move;
			
	//	}
		
		// application du dernier coup
		
	//	if(position >= 0 && position <= nextMoves.length) {
			this.nextMoves[position] = move;
			
	//		this.nextMoves[position] = this.nextMoves[position+1];
	//		this.nextMoves[position+1] = "0";
	//	}
	}
 
// detection des collisions entre un personnage et un mur  (nouvelle version )

public String meetWall(MapsGame mapsGame){
		  
		  
		boolean blockLeft = false;
		boolean blockRight = false;
		boolean blockUp = false;
		boolean blockDown = false;
		int nbCollision = 0;
		  
		  int mapPositionX = 1;
		  int mapPositionY = 1;
		  
	// on determine la position du character selon la matrice .
		  
	if(this.getMove() == "RIGHT" || this.getMove() == "DOWN") {
		
		 mapPositionX = mapPositionX+this.getElementX()/35;
		 mapPositionY = mapPositionY+this.getElementY()/35;
	}	
	
	
	else if(this.getMove() == "LEFT" || this.getMove() == "UP") {
		
		 mapPositionX = mapPositionX+(this.getElementX()+34)/35;
		 mapPositionY = mapPositionY+(this.getElementY()+34)/35;
	}	
	

	// traitement des collisions en fonction de la matrice
			
			if(mapsGame.getComposition(mapPositionX+1,mapPositionY) >=15 ) {	
				blockLeft = true;
			 	nbCollision++;
			}

		
			if(mapsGame.getComposition(mapPositionX-1,mapPositionY) >=15) {	
				blockRight = true;
			 	nbCollision++;
			}
		
			
			if(mapsGame.getComposition(mapPositionX,mapPositionY-1) >=15) {
				
				blockDown = true;
			 	nbCollision++;			
			}
	

			if(mapsGame.getComposition(mapPositionX,mapPositionY+1) >=15) {	
				blockUp = true;
				nbCollision++;			
			}
		
		// traitement et affectation de la collision sur le personnage 
		// (le nommage se fait dans l'ordre suivant : Up -> Down -> Left -> Right)
			
		
			if(nbCollision == 1){
				if (blockUp) {this.setBlocked("blockUp");			 return "blockUp";}
				else if (blockLeft) {this.setBlocked("blockLeft");	 return "blockLeft";}
				else if (blockRight) {this.setBlocked("blockRight"); return "blockRight";}
				else if (blockDown) {this.setBlocked("blockDown");	 return "blockDown";} 
			}
			
			else if(nbCollision == 2){
				if (blockLeft && blockUp) {this.setBlocked("blockUpLeft");            return "blockUpLeft";}
				else if (blockLeft && blockDown) {this.setBlocked("blockDownLeft");   return "blockDownLeft";}
				else if (blockRight && blockDown) {this.setBlocked("blockDownRight"); return "blockDownRight";}
				else if (blockRight && blockUp) {this.setBlocked("blockUpRight");     return "blockUpRight";}
				else if (blockDown && blockUp) {this.setBlocked("blockUpDown"); 	  return "blockUpDown";}
				else if (blockLeft && blockRight) {this.setBlocked("blockLeftRight"); return "blockLeftRight";}
			}
			
			else if(nbCollision == 3){
				if (blockLeft && blockUp && blockDown ) {this.setBlocked("blockUpDownLeft");			 return "blockUpDownLeft";}
				else if (blockLeft && blockDown && blockRight  ) {this.setBlocked("blockDownLeftRight"); return "blockDownLeftRight";}
				else if (blockRight && blockDown && blockUp ) {this.setBlocked("blockUpDownRight"); 	 return "blockUpDownRight";}
				else if (blockRight && blockUp && blockLeft ) {this.setBlocked("blockUpLeftRight"); 	 return "blockUpLeftRight";}
			}

			else if (nbCollision == 4 && blockRight && blockUp && blockLeft && blockDown){
				this.setBlocked("totalBlock") ; return "totalBlock";
			}
			
			this.setBlocked("0");
			return "0";
		
	}
		

				
// detection des collisions entre un personnage et un mur  (version obsolete )

/*
	
	public String meetWall (MapsGame mapsGame){
		
		

	
	boolean blockLeft = false;
	boolean blockRight = false;
	boolean blockUp = false;
	boolean blockDown = false;
	int nbCollision = 0;
	
// collision gauche
	
	for(int i =0;i<mapsGame.getTabElements().size();i++){
		
	//contact du mur par la gauche
		 if(this.elementX+this.elementLength == mapsGame.getTabElements().get(i).getElementX()
				 
	//annule la collision si il est au dessus du mur 
			&& this.getElementY()+this.getElementHeight() > mapsGame.getTabElements().get(i).getElementY()	
			
	//annule la collision si il est en dessous du mur 
			&& this.getElementY() < mapsGame.getTabElements().get(i).getElementY()+mapsGame.getTabElements().get(i).getElementHeight() 
			
	//on verifie si  l'element est un mur par son iDelement
			&& mapsGame.getTabElements().get(i).getIdElement() == 15
	
	//contact à droite de l'ecran
			|| this.elementX == 665){
			 	blockLeft = true;
			 	nbCollision++;
			 	break;
		}
	}	
	
// collision haut
	
	for(int i =0;i<mapsGame.getTabElements().size();i++){
		
	//contact  du mur par le haut
		if (this.elementY+this.elementHeight == mapsGame.getTabElements().get(i).getElementY()
	
	//annule la collision si il est a gauche du mur
			&& this.elementX + this.elementLength > mapsGame.getTabElements().get(i).getElementX()
			
	//annule la collision si il est a droite du mur
			&& this.elementX < mapsGame.getTabElements().get(i).getElementX() + mapsGame.getTabElements().get(i).getElementLength()
			
	//on verifie si  l'element est un mur par son iDelement
			&& mapsGame.getTabElements().get(i).getIdElement() == 15
	
	//contact en bas de l'ecran
			|| this.elementY == 638){
				blockUp = true;
				nbCollision++;
				break;
			}
		}
	
// collision droite
		
	for(int i =0;i<mapsGame.getTabElements().size();i++){
		
	//contact  du mur par la droite
		if(this.getElementX() == mapsGame.getTabElements().get(i).getElementX()+mapsGame.getTabElements().get(i).getElementLength()	
				
	//annule la collision si il est au dessus du mur 
			&& this.getElementY()+this.getElementLength() > mapsGame.getTabElements().get(i).getElementY()
			
	//annule la collision si il est en dessous du mur 		
			&& this.getElementY() < mapsGame.getTabElements().get(i).getElementY()+mapsGame.getTabElements().get(i).getElementLength()
			
	//on verifie si  l'element est un mur par son iDelement
			&& mapsGame.getTabElements().get(i).getIdElement() == 15
			
	//contact  à gauche de l'ecran	
			|| this.elementX == 0){
				blockRight = true;
				nbCollision++;
				break;
		} 
	}
	
// collision bas
	
	for(int i =0;i<mapsGame.getTabElements().size();i++) {
		
	//contact  du mur par le bas
		if (this.getElementY() == mapsGame.getTabElements().get(i).getElementY()+mapsGame.getTabElements().get(i).getElementHeight()
		
	//annule la collision si il est a gauche du mur			
			&& this.getElementX()+this.getElementLength() > mapsGame.getTabElements().get(i).getElementX()	
			
	//annule la collision si il est a droite du mur		
			&& this.getElementX() < mapsGame.getTabElements().get(i).getElementX()+mapsGame.getTabElements().get(i).getElementLength()
			
	//on verifie si  l'element est un mur par son iDelement
			&& mapsGame.getTabElements().get(i).getIdElement() == 15
	
	
	//contact  en haut de l'ecran	
			|| this.elementY == 0){	
				blockDown = true;
				nbCollision++;
				break;
		}
	}
	
// traitement et affectation de la collision sur le personnage 
// (le nommage se fait dans l'ordre suivant : Up -> Down -> Left -> Right)
	
	
	if(nbCollision == 1){
		if (blockUp) {this.setBlocked("blockUp");			 return "blockUp";}
		else if (blockLeft) {this.setBlocked("blockLeft");	 return "blockLeft";}
		else if (blockRight) {this.setBlocked("blockRight"); return "blockRight";}
		else if (blockDown) {this.setBlocked("blockDown");	 return "blockDown";} 
	}
	
	else if(nbCollision == 2){
		if (blockLeft && blockUp) {this.setBlocked("blockUpLeft");            return "blockUpLeft";}
		else if (blockLeft && blockDown) {this.setBlocked("blockDownLeft");   return "blockDownLeft";}
		else if (blockRight && blockDown) {this.setBlocked("blockDownRight"); return "blockDownRight";}
		else if (blockRight && blockUp) {this.setBlocked("blockUpRight");     return "blockUpRight";}
		else if (blockDown && blockUp) {this.setBlocked("blockUpDown"); 	  return "blockUpDown";}
		else if (blockLeft && blockRight) {this.setBlocked("blockLeftRight"); return "blockLeftRight";}
	}
	
	else if(nbCollision == 3){
		if (blockLeft && blockUp && blockDown ) {this.setBlocked("blockUpDownLeft");			 return "blockUpDownLeft";}
		else if (blockLeft && blockDown && blockRight  ) {this.setBlocked("blockDownLeftRight"); return "blockDownLeftRight";}
		else if (blockRight && blockDown && blockUp ) {this.setBlocked("blockUpDownRight"); 	 return "blockUpDownRight";}
		else if (blockRight && blockUp && blockLeft ) {this.setBlocked("blockUpLeftRight"); 	 return "blockUpLeftRight";}
	}

	else if (nbCollision == 4 && blockRight && blockUp && blockLeft && blockDown){
		this.setBlocked("totalBlock") ; return "totalBlock";
	}
	
	this.setBlocked("0");
	return "0";

	
}

*/




//predispose la prochaine direction du personnage saisi par le joueur (reserve à pac man)




	public String controlCharacter() {
	if (this.nextMoves[0]=="RIGHT"
			
			//this.nextMove=="RIGHT"
			
			&&  this.getElementY() % 35 == 0
			
			&&  this.getBlocked() != "blockLeft"
			&&  this.getBlocked() != "totalBlock"
			
			//3 collisions
			&&  this.getBlocked() != "blockUpDownLeft"
			&&  this.getBlocked() != "blockDownLeftRight"
			&&  this.getBlocked() != "blockUpLeftRight"	
		
			//2 collisions
			&&  this.getBlocked() != "blockUpLeft"
			&&  this.getBlocked() != "blockDownLeft"
			&&  this.getBlocked() != "blockLeftRight" 
	) {this.move="RIGHT";
		return "RIGHT"	;
	}
	
	
	if (this.nextMoves[0]=="LEFT"
			
		//	this.nextMove=="LEFT"
			
			&&  this.getElementY() % 35 == 0
			
			&&  this.getBlocked() != "totalBlock"
			
			&&  this.getBlocked() != "blockUpDownRight"
			&&  this.getBlocked() != "blockDownLeftRight"
			&&  this.getBlocked() != "blockUpLeftRight"
					
			&&  this.getBlocked() != "blockUpRight"
			&&  this.getBlocked() != "blockDownRight"
			&&  this.getBlocked() != "blockLeftRight"
			&&  this.getBlocked() != "blockRight"
	) {this.move="LEFT";
		return "LEFT"	;}
	 
	if (this.nextMoves[0]=="UP"
				
		//	this.nextMove=="UP"
			
		&&  this.getElementX() % 35 == 0
		
		&& this.getBlocked() != "blockDown"
		&&  this.getBlocked() != "totalBlock"
		
		&&  this.getBlocked() != "blockUpDownRight"
		&&  this.getBlocked() != "blockUpDownLeft"
		&&  this.getBlocked() != "blockDownLeftRight"
	
		&&  this.getBlocked() != "blockDownLeft"
		&&  this.getBlocked() != "blockDownRight"
		&&  this.getBlocked() != "blockUpDown" 
			
	) {this.move="UP";
		return "UP"	;
	}
	
	
	if (this.nextMoves[0]=="DOWN"
			
		//	this.nextMove=="DOWN"
		
		&&  this.getElementX() % 35 == 0
		
		&&  this.getBlocked() != "totalBlock"
			
		&&  this.getBlocked() != "blockUpDownRight"
		&&  this.getBlocked() != "blockUpDownLeft"
		&&  this.getBlocked() != "blockUpLeftRight"
				
		&&  this.getBlocked() != "blockUpRight"
		&&  this.getBlocked() != "blockUpLeft"
		&&  this.getBlocked() != "blockUpDown"
			
		&& this.getBlocked() != "blockUp" 	
			
	) {this.move="DOWN";
		return "DOWN";
	}
	 
	else {	return "OUPS !!!";}
		
}		
	
// applique le deplacement du personnage si les conditions sont reunis 

	public void moveCharacter() {
	
	// deplacer à gauche
	
		if (this.move=="RIGHT"
				
				//4 collisions
			&& this.blocked != "totalBlock"
			
				//3 collisions
			&& this.blocked != "blockUpDownLeft"
			&& this.blocked != "blockDownLeftRight"
			&& this.blocked != "blockUpLeftRight"	
			
				//2 collisions
			&& this.blocked != "blockUpLeft"
			&& this.blocked != "blockDownLeft"
			&& this.blocked != "blockLeftRight"
			
				//1 collision
			&& this.blocked != "blockLeft"
			)
		{ 
			this.elementX = this.elementX+1;
		}
	
		
	// deplacer à droite	
		
		else if (this.move=="LEFT"
				
			&&  this.blocked != "totalBlock"
			&&  this.blocked != "blockUpDownRight"
			&&  this.blocked != "blockDownLeftRight"
			&&  this.blocked != "blockUpLeftRight"
			&&  this.blocked != "blockUpRight"
			&&  this.blocked != "blockDownRight"
			&&  this.blocked != "blockLeftRight"
			&&	this.blocked != "blockRight"
			)
		{	
			this.elementX =this.elementX-1;	
		}
		
	// deplacer en bas
		
		else if(this.move=="UP"
				
			&&  this.blocked != "totalBlock"
			&&  this.blocked != "blockUpDownRight"
			&&  this.blocked != "blockUpDownLeft"
			&&  this.blocked != "blockDownLeftRight"
			&&  this.blocked != "blockDownLeft"
			&&  this.blocked != "blockDownRight"
			&&  this.blocked != "blockUpDown"
			&&	this.blocked != "blockDown"
			)
		{
			this.elementY = this.elementY-1;		
		}
		
		
	// deplacer en haut	
		
		else if(this.move=="DOWN"
				
			&&  this.blocked != "totalBlock"
			&&  this.blocked != "blockUpDownRight"
			&&  this.blocked != "blockUpDownLeft"
			&&  this.blocked != "blockUpLeftRight"
			&&  this.blocked != "blockUpRight"
			&&  this.blocked != "blockUpLeft"
			&&  this.blocked != "blockUpDown"
			&&	this.blocked != "blockUp"
			) 
		{	
			this.elementY=this.elementY+1;
		}	
	}

	
// contact avec les objets

	public boolean proche(Element element){   	
		if((this.elementX > element.getElementX() - 10 && this.elementX < element.getElementX() + element.getElementLength() + 10) 
				|| (this.elementX + this.elementHeight > element.getElementX() - 10 && this.elementX + this.elementHeight < element.getElementX() + element.getElementLength() + 10)){return true;}
		else{return false;}
	}
	

	protected boolean contactAvant(Element element){
		if(this.move=="RIGHT" == true){
			if(this.elementX + this.elementLength < element.getElementX() || this.elementX + this.elementLength > element.getElementX() + 5 
					|| this.elementY + this.elementHeight <= element.getElementY() || this.elementY >= element.getElementY() + 
					element.getElementHeight()){return false;}
			else{return true;}
		}else{return false;}
	} 

	protected boolean contactArriere(Element element){		
		if(this.elementX > element.getElementX() + element.getElementLength() || this.elementX + this.elementLength < element.getElementX() 
				+ element.getElementLength() - 5 || this.getElementY() + this.elementHeight <= element.getElementY() || 
				this.elementY >= element.getElementY() + element.getElementHeight()){return false;}
		else{return true;}
}

	protected boolean contactDessous(Element element){	
		if(this.elementX + this.elementLength < element.getElementX() + 5 || this.elementX > element.getElementX() + element.getElementLength() - 5 || 
			this.elementY + this.elementHeight < element.getElementY() || this.elementY + this.elementHeight > element.getElementY() + 5){return false;}
		else{return true;}		
	}

	protected boolean contactDessus(Element element){
		if(this.elementX + this.elementLength < element.getElementX() + 5 || this.elementX > element.getElementX() + element.getElementLength() - 5 || 
				this.elementY < element.getElementY() + element.getElementHeight() || this.elementY > element.getElementY() + element.getElementHeight() + 5){return false;}
		else{return true;}
	}

	
//getter et setters

	public int getCharacterSpeed() {
		return characterSpeed;
	}

	public void setCharacterSpeed(int characterSpeed) {
		this.characterSpeed = characterSpeed;
	}

}
