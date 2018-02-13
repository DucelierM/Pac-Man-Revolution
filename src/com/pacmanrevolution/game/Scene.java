package com.pacmanrevolution.game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.pacmanrevolution.characters.Clyde;
import com.pacmanrevolution.characters.PacMan;
import com.pacmanrevolution.objets.PacGum;
import com.pacmanrevolution.objets.Item;
import com.pacmanrevolution.objets.PacFruit;
import com.pacmanrevolution.objets.Wall;

public class Scene extends JPanel  {

	private ImageIcon icoFond = new ImageIcon("sprites/Wall/Background.jpg");
	private Image imgFond1 = icoFond.getImage();
	
	protected PacMan pac = new PacMan(500,500);
	
	
	private Clyde cly = new Clyde(200,200);
	
	private Wall wall1,wall2,wall3,wall4,wall5,wall6,wall7,wall8,wall9,wall10,wall11,wall12,wall13,wall14,wall15;
	
	private ArrayList<Wall> tabWall;
	
	private PacGum pacGum1,pacGum2,pacGum3,pacGum4,pacGum5,pacGum6,pacGum7,pacGum8,pacGum9,pacGum10
	,pacGum11,pacGum12,pacGum13,pacGum14,pacGum15,pacGum16,pacGum17,pacGum18,pacGum19,pacGum20;
	private PacFruit pacFruit0,pacFruit1,pacFruit2,pacFruit3,pacFruit4;
	
	private ArrayList<Item> tabItems;

	public Scene() {
		
		super();
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
		

		pacFruit0 = new PacFruit(650,168,"Fruit0");
		pacFruit1 = new PacFruit(218,590,"Fruit1");
		pacFruit2 = new PacFruit(650,28,"Fruit2");
		pacFruit3 = new PacFruit(650,590,"Fruit3");
		pacFruit4 = new PacFruit(298,168,"Fruit4");
		
		wall1 = new Wall(0,35);
		wall2 = new Wall(35,35);
		wall3 = new Wall(70,35);
		wall4 = new Wall(105,35);
		wall5 = new Wall(140,35);
		wall6 = new Wall(210,35);
		wall7 = new Wall(210,70);
		wall8 = new Wall(210,105);
		wall9 = new Wall(210,140);
		wall10 = new Wall(210,175);
		wall11 = new Wall(210,210);
		wall12 = new Wall(210,245);
		wall13 = new Wall(210,280);
		wall14 = new Wall(140,70);
		wall15 = new Wall(175,70);
		
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
		
	
		Thread chronoCharacter = new Thread(new Chrono());
		chronoCharacter.start();
			
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Control());

	}

	public void paintComponent(Graphics g) {  // methode d'affichage de la map et de tous es elements 
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Graphics2D donne un meilleur rendu graphique
		
		// deplacement pac man
		
		pac.moveCharacter();
		pac.meetWall(wall15);	
		
		/*	pac.meetWall(wall1);
			pac.meetWall(wall2);
			pac.meetWall(wall3);
			pac.meetWall(wall4);
			pac.meetWall(wall5);
			pac.meetWall(wall6);
			pac.meetWall(wall7);
			pac.meetWall(wall8);
			pac.meetWall(wall9);
			pac.meetWall(wall10);
			pac.meetWall(wall11);
			pac.meetWall(wall12);
			pac.meetWall(wall13);			
			pac.meetWall(wall14);
			
		*/
		pac.animationPacMan();
			
		// deplacement de clyde
			
		
		/*	cly.meetWall(wall1);
			cly.meetWall(wall2);
			cly.meetWall(wall3);
			cly.meetWall(wall4);
			cly.meetWall(wall5);
			cly.meetWall(wall6);
			cly.meetWall(wall7);
			cly.meetWall(wall8);
			cly.meetWall(wall9);
			cly.meetWall(wall10);
			cly.meetWall(wall11);
			cly.meetWall(wall12);
			cly.meetWall(wall13);
			cly.meetWall(wall14);
			
		*/
		
			cly.meetWall(wall15);
			cly.moveCharacter();
			cly.iaClyde();
			cly.animationClyde();
		
	
		
		g2.drawImage(this.imgFond1, 0, 0, null); // déssine l'arriere plan
		g2.drawImage(pac.getElementImg(),pac.getElementX(),pac.getElementY(), null); // dessine pacman
		g2.drawImage(cly.getElementImg(),cly.getElementX(),cly.getElementY(), null); // dessine clyde
		//g2.drawImage(wall1.getElementImg(),wall1.getElementX(),wall1.getElementY(), null); // dessine wall1
		
		for(int i = 0; i < this.tabItems.size(); i++){
 			g2.drawImage(this.tabItems.get(i).getElementImg(), this.tabItems.get(i).getElementX(), this.tabItems.get(i).getElementY(), null);
 		}
		
		for(int i = 0; i < this.tabWall.size(); i++){
 			g2.drawImage(this.tabWall.get(i).getElementImg(), this.tabWall.get(i).getElementX(), this.tabWall.get(i).getElementY(), null);
 		}
		
		System.out.println("cly bloqué ? "+cly.getBlocked());
		System.out.println("cly move :"+cly.getMove());
		System.out.println("position Y Clyde : "+cly.getElementY());
		System.out.println("position X Clyde: "+cly.getElementX());	
	//	System.out.println("taille Clyde : "+cly.getElementHeight());
	//	System.out.println("largeur  Clyde: "+cly.getElementLength());
		
		
	//	System.out.println("pac bloqué ? "+pac.getBlocked());
	//	System.out.println("pac move :"+pac.getMove());	
	//	System.out.println("pacX "+pac.getElementX());
	//	System.out.println("pacY"+pac.getElementY());
			
		
		


		//g2.drawString("Est tu pret a perdre", 100, 650);

	}

}
