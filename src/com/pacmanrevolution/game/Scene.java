package com.pacmanrevolution.game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.pacmanrevolution.characters.Clyde;
import com.pacmanrevolution.characters.PacMan;
import com.pacmanrevolution.objets.Wall;

public class Scene extends JPanel {

	private ImageIcon icoFond = new ImageIcon("sprites/Wall/Background.jpg");
	private Image imgFond1 = icoFond.getImage();
	

	
	public PacMan pac = new PacMan();
	public Clyde cly = new Clyde();
	public Wall wall1 = new Wall();

	public Scene() {
	
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

		//g2.drawString("Est tu pret a perdre", 100, 650);

	}



}
