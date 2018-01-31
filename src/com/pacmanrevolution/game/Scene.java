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

import com.pacmanrevolution.characters.PacMan;

public class Scene extends JPanel {

	private ImageIcon icoFond = new ImageIcon("sprites/Wall/Background.jpg");
	private Image imgFond1 = icoFond.getImage();
	
	public PacMan pac = new PacMan();

	public Scene() {

		
		
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new PacMan());
	
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Graphics2D donne un meilleur rendu graphique
		g2.drawImage(this.imgFond1, 0, 0, null); // dessine l'arriere plan
		g2.drawImage(pac.getElementImg(),pac.getCharacterX(),pac.getCharacterY(), null); // dessine pacman

		g2.drawString("Est tu pret a perdre", 100, 650);

	}

}
