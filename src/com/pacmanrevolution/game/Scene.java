package com.pacmanrevolution.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.pacmanrevolution.display.*;
import com.pacmanrevolution.characters.Blinky;
import com.pacmanrevolution.characters.Clyde;
import com.pacmanrevolution.characters.Inky;
import com.pacmanrevolution.characters.PacMan;
import com.pacmanrevolution.characters.Pinky;
import com.pacmanrevolution.objets.PacGum;
import com.pacmanrevolution.objets.Item;
import com.pacmanrevolution.objets.PacFruit;
import com.pacmanrevolution.objets.Wall;

public class Scene extends JPanel  {

	private ImageIcon icoFond = new ImageIcon("sprites/Wall/Background.jpg");
	private Image imgFond1 = icoFond.getImage();
	
	private Score score;
	
	protected PacMan pac = new PacMan(500,500);
	
	private Clyde cly = new Clyde(500,200);
	
	private Inky ink = new Inky (500,235);
	
	private Pinky pin = new Pinky(500,270);
	
	private Blinky blk = new Blinky (500,305);
	
	private Wall wall1,wall2,wall3,wall4,wall5,wall6,wall7,wall8,wall9,wall10,wall11,wall12,wall13,wall14,wall15,
	wall16,wall17,wall18,wall19,wall20,wall21,wall22,wall23,wall24,wall25,wall26,wall27,wall28,wall29,
	wall30,wall31,wall32,wall33,wall34,wall35,wall36,wall37,wall38,wall39,wall40,wall41,wall42,wall43,
	wall44,wall45,wall46,wall47,wall48,wall49,wall50,wall51,wall52,wall53,wall54,wall55,wall56,wall57,
	wall58,wall59,wall60,wall61,wall62,wall63,wall64,wall65,wall66,wall67,wall68,wall69,wall70,wall71,
	wall72,wall73,wall74,wall75,wall76,wall77,wall78,wall79,wall80,wall81,wall82,wall83,wall84,wall85,
	wall86,wall87,wall88,wall89,wall90,wall91,wall92,wall93,wall94,wall95,wall96,wall97,wall98,wall99,
	wall100;
	
	private ArrayList<Wall> tabWall;
	
	private PacGum pacGum1,pacGum2,pacGum3,pacGum4,pacGum5,pacGum6,pacGum7,pacGum8,pacGum9,pacGum10
	,pacGum11,pacGum12,pacGum13,pacGum14,pacGum15,pacGum16,pacGum17,pacGum18,pacGum19,pacGum20;
	private PacFruit pacFruit0,pacFruit1,pacFruit2,pacFruit3,pacFruit4;
	
	private ArrayList<Item> tabItems;

	public Scene() {
		
	// chargement des elements sur la map
		
		super();
		
	// pac gums
		// A gerer toutes les 30 X et Y
		pacGum1 = new PacGum(28, 58);
		pacGum2 = new PacGum(28, 88);
		pacGum3 = new PacGum(28, 118);
		pacGum4 = new PacGum(28, 148);
		pacGum5 = new PacGum(58, 168);
		pacGum6 = new PacGum(88, 168);
		pacGum7 = new PacGum(118, 168);
		pacGum8 = new PacGum(248, 590);
		pacGum9 = new PacGum(278, 590);
		pacGum10 = new PacGum(310, 590);
		pacGum11 = new PacGum(340,590);
		pacGum12 = new PacGum(370,590);
		pacGum13 = new PacGum(400,590);
		pacGum14 = new PacGum(430,590);
		pacGum15 = new PacGum(460,590);
		pacGum16 = new PacGum(490,590);
		pacGum17 = new PacGum(510,590);
		pacGum18 = new PacGum(540,590);
		pacGum19 = new PacGum(570,590);
		pacGum20 = new PacGum(600,590);
		
	
	// pac fruits 
		
		pacFruit0 = new PacFruit(650,168,"Fruit0");
		pacFruit1 = new PacFruit(218,590,"Fruit1");
		pacFruit2 = new PacFruit(650,28,"Fruit2");
		pacFruit3 = new PacFruit(650,590,"Fruit3");
		pacFruit4 = new PacFruit(298,168,"Fruit4");
		
	// wall
		
		wall1 = new Wall(0,0);
		wall2 = new Wall(35,0);
		wall3 = new Wall(70,0);
		wall4 = new Wall(105,0);
		wall5 = new Wall(140,0);
		wall16 = new Wall(175,0);
		wall17 = new Wall(210,0);
		wall6 = new Wall(245,0);
		wall7 = new Wall(280,0);
		wall8 = new Wall(315,0);
		wall9 = new Wall(350,0);
		wall10 = new Wall(385,0);
		wall11 = new Wall(420,0);
		wall12 = new Wall(455,0);
		wall13 = new Wall(490,0);
		wall14 = new Wall(525,0);
		wall15 = new Wall(560,0);
		wall18 = new Wall(595,0);
		wall19 = new Wall(630,0);
		wall20 = new Wall(665,0);
		
		
		wall21 = new Wall(0,615);
		wall22 = new Wall(35,615);
		wall23 = new Wall(70,615);
		wall24 = new Wall(105,615);
		wall25 = new Wall(140,615);
		wall26 = new Wall(175,615);
		wall27 = new Wall(210,615);
		wall28 = new Wall(245,615);
		wall29 = new Wall(280,615);
		wall30 = new Wall(315,615);
		wall31 = new Wall(350,615);
		wall32 = new Wall(385,615);
		wall33 = new Wall(420,615);
		wall34 = new Wall(455,615);
		wall35 = new Wall(490,615);
		wall36 = new Wall(525,615);
		wall37 = new Wall(595,615);
		wall38 = new Wall(630,615);
		wall39 = new Wall(665,615);
		wall40 = new Wall(560,615);
		
		
		wall41 = new Wall(0,35);
		wall42 = new Wall(0,70);
		wall43 = new Wall(0,105);
		wall44 = new Wall(0,140);
		wall45 = new Wall(0,175);	
		wall46 = new Wall(0,440);
		wall47 = new Wall(0,475);
		wall48 = new Wall(0,510);
		wall49 = new Wall(0,545);
		wall50 = new Wall(0,580);
		wall51 = new Wall(0,405);
		
		wall52 = new Wall(665,35);
		wall53 = new Wall(665,70);
		wall54 = new Wall(665,105);
		wall55 = new Wall(665,140);
		wall56 = new Wall(665,175);	
		wall57 = new Wall(665,440);
		wall58 = new Wall(665,475);
		wall59 = new Wall(665,510);
		wall60 = new Wall(665,545);
		wall61 = new Wall(665,580);
		wall62 = new Wall(665,405);
		
		wall63 = new Wall(630,405);
		wall64 = new Wall(595,405);
		wall65 = new Wall(560,405);
		
		wall66 = new Wall(560,370);
		wall67 = new Wall(560,335);
		wall68 = new Wall(630,335);
		wall69 = new Wall(595,335);
		wall70 = new Wall(560,335);
		wall71 = new Wall(665,335);
		
		wall72 = new Wall(630,175);
		wall73 = new Wall(595,175);
		wall74 = new Wall(560,175);
		wall75 = new Wall(560,210);
		wall76 = new Wall(560,245);
		wall77 = new Wall(595,245);
		wall78 = new Wall(630,245);
		wall79 = new Wall(665,245);
		
		wall80 = new Wall(35,405);
		wall81 = new Wall(70,405);
		wall82 = new Wall(105,405);
		wall83 = new Wall(105,370);
		wall84 = new Wall(105,335);
		wall85 = new Wall(70,335);
		wall86 = new Wall(35,335);
		wall87 = new Wall(0,335);
		
		wall88 = new Wall(35,175);
		wall89 = new Wall(70,175);
		wall90 = new Wall(105,175);
		wall91 = new Wall(105,210);
		wall92 = new Wall(105,245);
		wall93 = new Wall(70,245);
		wall94 = new Wall(35,245);
		wall95 = new Wall(0,245);
		
		wall96 = new Wall(350,245);
		wall97 = new Wall(560,500);
		wall98 = new Wall(260,500);
		wall99 = new Wall(260,150);
		wall100 = new Wall(560,245);
		
		
		
	// initialisation du tableau de wall	
		
		
		
		tabWall = new ArrayList<Wall>();	
		tabWall.add(wall1);
		tabWall.add(wall2);
		tabWall.add(wall3);
		tabWall.add(wall4);
		tabWall.add(wall5);
		tabWall.add(wall6);
		tabWall.add(wall7);
		tabWall.add(wall8);
		tabWall.add(wall9);
		tabWall.add(wall10);
		tabWall.add(wall11);
		tabWall.add(wall12);
		tabWall.add(wall13);
		tabWall.add(wall14);
		tabWall.add(wall15);
		tabWall.add(wall16);
		tabWall.add(wall17);
		tabWall.add(wall18);
		tabWall.add(wall19);
		tabWall.add(wall20);
		tabWall.add(wall21);
		tabWall.add(wall22);
		tabWall.add(wall23);
		tabWall.add(wall24);
		tabWall.add(wall25);
		tabWall.add(wall26);
		tabWall.add(wall27);
		tabWall.add(wall28);
		tabWall.add(wall29);
		tabWall.add(wall30);
		tabWall.add(wall31);
		tabWall.add(wall32);
		tabWall.add(wall33);
		tabWall.add(wall34);
		tabWall.add(wall35);
		tabWall.add(wall36);
		tabWall.add(wall37);
		tabWall.add(wall38);
		tabWall.add(wall39);
		tabWall.add(wall40);
		tabWall.add(wall41);
		tabWall.add(wall42);
		tabWall.add(wall43);
		tabWall.add(wall44);
		tabWall.add(wall45);
		tabWall.add(wall46);
		tabWall.add(wall47);
		tabWall.add(wall48);
		tabWall.add(wall49);
		tabWall.add(wall50);
		tabWall.add(wall51);
		tabWall.add(wall52);
		tabWall.add(wall53);
		tabWall.add(wall54);
		tabWall.add(wall55);
		tabWall.add(wall56);
		tabWall.add(wall57);
		tabWall.add(wall58);
		tabWall.add(wall59);
		tabWall.add(wall60);
		tabWall.add(wall61);
		tabWall.add(wall62);
		tabWall.add(wall63);
		tabWall.add(wall64);
		tabWall.add(wall65);
		tabWall.add(wall66);
		tabWall.add(wall67);
		tabWall.add(wall68);
		tabWall.add(wall69);
		tabWall.add(wall70);
		tabWall.add(wall71);
		tabWall.add(wall72);
		tabWall.add(wall73);
		tabWall.add(wall74);
		tabWall.add(wall75);
		tabWall.add(wall76);
		tabWall.add(wall77);
		tabWall.add(wall78);
		tabWall.add(wall79);
		tabWall.add(wall80);
		tabWall.add(wall81);
		tabWall.add(wall82);
		tabWall.add(wall83);
		tabWall.add(wall84);
		tabWall.add(wall85);
		tabWall.add(wall86);
		tabWall.add(wall87);
		tabWall.add(wall88);
		tabWall.add(wall89);
		tabWall.add(wall90);
		tabWall.add(wall91);
		tabWall.add(wall92);
		tabWall.add(wall93);
		tabWall.add(wall94);
		tabWall.add(wall95);
		
		tabWall.add(wall96);
		tabWall.add(wall97);
		tabWall.add(wall98);
		tabWall.add(wall99);
		tabWall.add(wall100);
		
	// initialisation du tableau d'item

		tabItems = new ArrayList<Item>();
		tabItems.add(pacGum1);
		tabItems.add(pacGum2);
		tabItems.add(pacGum3);
		tabItems.add(pacGum4);
		tabItems.add(pacGum5);
		tabItems.add(pacGum6);
		tabItems.add(pacGum6);
		tabItems.add(pacGum7);
		tabItems.add(pacGum8);
		tabItems.add(pacGum9);
		tabItems.add(pacGum10);
		tabItems.add(pacGum11);
		tabItems.add(pacGum12);
		tabItems.add(pacGum13);
		tabItems.add(pacGum14);
		tabItems.add(pacGum15);
		tabItems.add(pacGum16);
		tabItems.add(pacGum17);
		tabItems.add(pacGum18);
		tabItems.add(pacGum19);
		tabItems.add(pacGum20);
		
		
		tabItems.add(pacFruit0);
		tabItems.add(pacFruit1);
		tabItems.add(pacFruit2);
		tabItems.add(pacFruit3);
		tabItems.add(pacFruit4);
		
	// initialisation du chronometre et lancement
		Thread chronoCharacter = new Thread(new Chrono());
		chronoCharacter.start();
			
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Control());
		
	// affichage de la barre de score .

		score = new Score() {
		};
	}

	
	
	public void paintComponent(Graphics g) {  // methode d'affichage de la map et de tous es elements 
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Graphics2D donne un meilleur rendu graphique
		
		
	// chargement des personnages dans la scene
		
		pac.load(tabWall);
		cly.load(tabWall,pac);
		blk.load(tabWall,pac);
		pin.load(tabWall,pac);
		ink.load(tabWall,pac);


	
		
		g2.drawImage(this.imgFond1, 0, 0, null); // déssine l'arriere plan
		g2.drawImage(pac.getElementImg(),pac.getElementX(),pac.getElementY(), null); // dessine pacman
		g2.drawImage(cly.getElementImg(),cly.getElementX(),cly.getElementY(), null); // dessine clyde
		g2.drawImage(blk.getElementImg(),blk.getElementX(),blk.getElementY(), null); // dessine clyde
		g2.drawImage(pin.getElementImg(),pin.getElementX(),pin.getElementY(), null); // dessine clyde
		g2.drawImage(ink.getElementImg(),ink.getElementX(),ink.getElementY(), null); // dessine clyde
		

		for(int i = 0; i < this.tabItems.size(); i++){
 			g2.drawImage(this.tabItems.get(i).getElementImg(), this.tabItems.get(i).getElementX(), this.tabItems.get(i).getElementY(), null);
 			if(this.pac.proche(this.tabItems.get(i))){	
	 			if(this.pac.contactItem(this.tabItems.get(i))){
 	 				this.tabItems.remove(i);
 	 				/*
 	 				 *  C'est ici qu'il faut gérer justement les différentes grilles de points en fonction
 	 				 *  de l'objet (puis mettre le son)
 	 				 */
 	 				
 	 				this.score.setScoreLife(this.score.getScoreLife() + this.score.getScoreFruit());
 	 				
		 			}
 			}
 		}
		for(int i = 0; i < this.tabWall.size(); i++){
 			g2.drawImage(this.tabWall.get(i).getElementImg(), this.tabWall.get(i).getElementX(), this.tabWall.get(i).getElementY(), null);
 		}

		g2.setColor(Color.white);
		g.setFont(new Font("impact", Font.BOLD, 15)); 
		g2.drawString("Score: "+this.score.getScoreLife()+" ", 100, 665);
		
		
	System.out.println("pac bloqué ? "+pac.getBlocked());
	System.out.println("pac move :"+pac.getMove());	
	System.out.println("pac nextMove :"+pac.getNextMove());
	System.out.println("pacX "+pac.getElementX());
	System.out.println("pacY"+pac.getElementY());
	System.out.println("characterSpeed:" +pac.getCharacterSpeed());		
		


		//g2.drawString("Est tu pret a perdre", 100, 650);

	}

}
