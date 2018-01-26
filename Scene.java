package com.pacmanrevolution.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel {

	private Image imgFond1;
	private ImageIcon icoFond;
	private Image imgFond2;
	private ImageIcon icoFond2;

	public Scene() {
		icoFond = new ImageIcon("sprites/Wall/Background.jpg");
		imgFond1 = icoFond.getImage();
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Graphics2D donne un meilleur rendu graphique
		g2.drawImage(this.imgFond1, 0, 0, null);
		//g2.drawString("Est tu pret a perdre " + Main.namePlayer + " ? ", 100, 650);
		g2.drawString("Est tu pret a perdre", 100, 650);

	}
}
