package com.pacmanrevolution.game;



import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.pacmanrevolution.objets.*;
import com.pacmanrevolution.characters.Clyde;
import com.pacmanrevolution.characters.PacMan;
import com.pacmanrevolution.objets.Item;
import com.pacmanrevolution.objets.PacGum;
import com.pacmanrevolution.objets.Wall;

public class Scene extends JPanel {

	private ImageIcon icoFond = new ImageIcon("sprites/Wall/Background.jpg");
	private Image imgFond1 = icoFond.getImage();
	public PacGum pacGum1,pacGum2,pacGum3,pacGum4,pacGum5,pacGum6,pacGum7,pacGum8,pacGum9,pacGum10
	,pacGum11,pacGum12,pacGum13,pacGum14,pacGum15,pacGum16,pacGum17,pacGum18,pacGum19,pacGum20;
	public PacFruit pacFruit0,pacFruit1,pacFruit2,pacFruit3,pacFruit4;
	
	private ArrayList<Item> tabItems;
	
	public PacMan pac = new PacMan();
	public Clyde cly = new Clyde();
	public Wall wall1 = new Wall();

	public Scene() {
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
		
		
		Thread chronoEcran = new Thread(new PacMan());
		chronoEcran.start();
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Control());
		
		

		
	}

	public void paintComponent(Graphics g) {  // methode d'affichage de la map et de tous es elements 
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Graphics2D donne un meilleur rendu graphique
		
		// deplacement pac man
		
			this.pac.meetWall(wall1);
			this.pac.deplacerPacMan();	
	
		
		
		g2.drawImage(this.imgFond1, 0, 0, null); // dessine l'arriere plan
		g2.drawImage(pac.getElementImg(),pac.getElementX(),pac.getElementY(), null); // dessine pacman
		g2.drawImage(cly.getElementImg(),cly.getElementX(),cly.getElementY(), null); // dessine clyde
		g2.drawImage(wall1.getElementImg(),wall1.getElementX(),wall1.getElementY(), null); // dessine wall1
		//g2.drawImage(pacGum10.getImgObjet(), pacGum10.getElementX(), pacGum10.getElementY(), null);
		
 		
 		for(int i = 0; i < this.tabItems.size(); i++){
 			g2.drawImage(this.tabItems.get(i).getImgObjet(), this.tabItems.get(i).getElementX(), this.tabItems.get(i).getElementY(), null);
 		}
		

		//g2.drawString("Est tu pret a perdre", 100, 650);

	}



}
