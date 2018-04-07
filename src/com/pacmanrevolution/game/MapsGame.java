package com.pacmanrevolution.game;



import java.util.ArrayList;

import com.pacmanrevolution.characters.Blinky;
import com.pacmanrevolution.characters.Clyde;
import com.pacmanrevolution.characters.Inky;
import com.pacmanrevolution.characters.PacMan;
import com.pacmanrevolution.characters.Pinky;
import com.pacmanrevolution.objets.PacFreeze;
import com.pacmanrevolution.objets.PacFruit;
import com.pacmanrevolution.objets.PacGum;
import com.pacmanrevolution.objets.PacPrika;
import com.pacmanrevolution.objets.SuperPacGum;
import com.pacmanrevolution.objets.Wall;

/*liste des id element et de l'objet approprié   

0: decor vide 

1:PacMan
2:Blinky
3:Inky
4:Pinky
5:Clyde

6:PacGum
7:SuperPacGum
8:PacFreeze
9:PacPrika


10:Fruit cerise
11:Fruit fraise
12:Fruit abricot
13:Fruit pomme
14:Fruit melon
  
15 : Mur et plus (environ 50) tous les murs avec le design specifique

*/

public class MapsGame {
	
	
	
	private int composition[][] = {
			{18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18},
			{15, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7,15},
			{15, 6,26,18,18,18,18,18,30, 8,26,18,18,18,18,18,18,18,18,23, 6,15},
			{15, 6,17, 6, 6, 6, 6, 6, 6, 6,17, 6, 6, 6, 6, 6, 6, 6,10,17, 6,15},
			{15, 6,17, 6,27, 6, 6,29,18,18,24, 7,29,18,18,18,18,30, 6,17, 6,15},
			{15, 6,28, 6,17, 6, 6,13, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,17, 6,15},
			{15, 6, 6, 6,25,18,18,18,18,18,18,18,18,18,18,18,30, 6, 6,28, 6,15},
			{15, 6,27, 6, 6, 6, 6, 0, 0, 0, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,15},
			{15, 6,17,11, 6, 6, 6, 6,26,30, 0, 0,29,23, 6,26,18,18,18,30, 6,15},
			{15, 6,25,18,18,18,23, 6,17, 0, 0, 0, 0,17, 6,17, 6, 6, 6,14, 6,15},
			{15, 6, 6, 6, 6, 7,17, 6,25,18,18,18,18,24, 6,28, 6, 6, 6, 6, 6,15},
			{15, 6,26,18,23, 6,17, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 6, 6, 6,15},
			{15, 6,25,18,21, 6,25,18,18,18,30,11,29,18,18,18,30, 6, 6, 6, 6,15},
			{15, 6, 8, 6,17, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,26,23, 6,15},
			{15, 6,27, 6,25,18,30, 6,29,18,18,18,18,18,18,18,18,18,19,21, 6,15},
			{15, 6,17, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,17, 6,15},
			{15, 6,25,18,18,18,18,30, 9,29,18,18,18,18,18,18,30,12, 6,28, 6,15},
			{15, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7,15},
			{18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18},
		};
	
	
	public int getComposition(int y , int x) {
	return composition[y][x];
		
		//return composition[y][x];
	}

	private ArrayList<Element> tabElements = new ArrayList<Element>();

	
		public MapsGame() {
			
		}

	private int pacManRef = 0;
	private int ghostsRef [] = {0,0,0,0,0,0,0,0,0,0};




	public boolean load() {
		
		int positionX = -35;
		int positionY = -35;
		
		for(int ligne =0; ligne < composition.length ; ligne++) {
			
			for(int colonne = 0; colonne <composition[0].length ; colonne++) {
				
				switch(this.composition[ligne][colonne]){
				  case(1):
					  getTabElements().add(new PacMan(positionX,positionY));
				  	  this.pacManRef = tabElements.size();
				    break;  
				    
				  case(2):
					  getTabElements().add(new Blinky(positionX,positionY));
				    break; 
				  
				  case(3):
					  getTabElements().add(new Inky(positionX,positionY));
				    break; 
				    
				  case(4):
					  getTabElements().add(new Pinky(positionX,positionY));
				    break; 
				    
				  case(5):
					  getTabElements().add(new Clyde(positionX,positionY));
				   break; 
				    
				  case(6):
					  getTabElements().add(new PacGum(positionX,positionY));
				   break;
					
				  case(7):
					  getTabElements().add(new SuperPacGum(positionX,positionY));
					break;
					
				  case(8):
					  getTabElements().add(new PacFreeze(positionX,positionY));
					break;
						
				  case(9):
					  getTabElements().add(new PacPrika(positionX,positionY));
						break;
						
				  case(10):
					  getTabElements().add(new PacFruit(positionX,positionY,"Cherry"));
						break;
						
				  case(11):
					  getTabElements().add(new PacFruit(positionX,positionY,"Strawberry"));
						break;
						
				  case(12):
					  getTabElements().add(new PacFruit(positionX,positionY,"Apricot"));
						break;
						
				  case(13):
					  getTabElements().add(new PacFruit(positionX,positionY,"Apple"));
						break;
						
				  case(14):
					  getTabElements().add(new PacFruit(positionX,positionY,"Melon"));
						break;
						
				// mur en bloc
						
				  case(15):
					  getTabElements().add(new Wall(positionX,positionY,"Wall100"));	  
						break;
						
				// mur en croix
						
				  case(16):
					  getTabElements().add(new Wall(positionX,positionY,"Wall0"));	  
						break;
						
				// mur vertical
					
				  case(17):
					  getTabElements().add(new Wall(positionX,positionY,"Wall1"));	  
						break;
						
				// mur horizontal
						
				  case(18):
					  getTabElements().add(new Wall(positionX,positionY,"Wall2"));	  
						break;
						
				// mur a 3 pic haut
						
				  case(19):
					  getTabElements().add(new Wall(positionX,positionY,"Wall3"));	  
						break;
						
				// mur a 3 pic bas
						
				  case(20):
					  getTabElements().add(new Wall(positionX,positionY,"Wall4"));	  
						break;
						
				// mur a 3 pic gauche
						
				  case(21):
					  getTabElements().add(new Wall(positionX,positionY,"Wall5"));	  
						break;
						
				// mur a 3 pic droite
						
				  case(22):
					  getTabElements().add(new Wall(positionX,positionY,"Wall6"));	  
						break;
						
				// mur  haut droite
					
				  case(23):
					  getTabElements().add(new Wall(positionX,positionY,"Wall7"));	  
						break;
						
				// mur  bas droite
						
				  case(24):
					  getTabElements().add(new Wall(positionX,positionY,"Wall8"));	  
						break;
						
				// mur bas gauche
				
				  case(25):
					  getTabElements().add(new Wall(positionX,positionY,"Wall9"));	  
						break;
						
				// mur  haut gauche
				
				  case(26):
					  getTabElements().add(new Wall(positionX,positionY,"Wall10"));	  
						break;
						
				// mur coin  haut 
						
				  case(27):
					  getTabElements().add(new Wall(positionX,positionY,"Wall11"));	  
						break;
				
				// mur coin  bas 
						
				  case(28):
					  getTabElements().add(new Wall(positionX,positionY,"Wall12"));	  
						break;
						
				// mur coin  gauche 
						
				  case(29):
					  getTabElements().add(new Wall(positionX,positionY,"Wall13"));	  
						break;
						
				// mur coin  droite
						
				  case(30):
					  getTabElements().add(new Wall(positionX,positionY,"Wall14"));	  
						break;
						
				}	
					
				positionX = positionX+35;
			}
			
			positionY = positionY+35;
			positionX = -35;

		}	
			
		// centrage des elements en fonction de la taille 
		
	//	for(int i = 0 ; i < tabElements.size() ; i++) {
		
	//		this.tabElements.get(i).elementX  = this.tabElements.get(i).elementX + (35-this.tabElements.get(i).elementLength)/2 ;
	//		this.tabElements.get(i).elementY  = this.tabElements.get(i).elementY + (35-this.tabElements.get(i).elementHeight)/2 ;			
	//}
	
	  return true;	
	}
	

	public ArrayList<Element> getTabElements() {
		return tabElements;
	}

	public void setTabElements(ArrayList<Element> tabElements) {

		this.tabElements = tabElements;
	}

	
	public void mapBegin() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//public boolean mapCompleted () {
		//}

		//public boolean gameOver () {
			
		//}
}
