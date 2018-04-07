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

public class Scene extends JPanel {

	private ImageIcon icoFond = new ImageIcon("sprites/Wall/Background.jpg");
	private Image imgFond1 = icoFond.getImage();

	public MapsGame mapsGame = new MapsGame();

	private Score score;

	protected PacMan pac = new PacMan(0,0);

	private Clyde cly = new Clyde(280, 280);

	private Inky ink = new Inky (315,280);

	private Pinky pin = new Pinky(350,280);

	private Blinky blk = new Blinky (385,280);
	

	public Scene() {

		super();

		// initialisation du chronometre et lancement

		Thread chronoCharacter = new Thread(new Chrono());
		chronoCharacter.start();

		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Control());

		// chargement des elements de mapsGame sur la scene

		mapsGame.load();
		System.out.println(mapsGame.load());

		// affichage de la barre de score .

		score = new Score() {
		};
	}

	// affichage des elements de la map dans la scene

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Graphics2D donne un meilleur rendu graphique

		g2.drawImage(this.imgFond1, 0, 0, null); // déssine l'arriere plan

		for (int i = 0; i < mapsGame.getTabElements().size(); i++) {

			g2.drawImage(this.mapsGame.getTabElements().get(i).getElementImg(),
					this.mapsGame.getTabElements().get(i).getElementX(),
					this.mapsGame.getTabElements().get(i).getElementY(), null);

		}

		// affichage des personnages mobiles

		pac.load(mapsGame, score);
		cly.load(mapsGame, pac);
		blk.load(mapsGame, pac);
		pin.load(mapsGame, pac);
		ink.load(mapsGame, pac);

		g2.drawImage(pac.getElementImg(), pac.getElementX(), pac.getElementY(), null); // dessine pacman
		g2.drawImage(cly.getElementImg(), cly.getElementX(), cly.getElementY(), null); // dessine clyde
		g2.drawImage(blk.getElementImg(),blk.getElementX(),blk.getElementY(), null);	// dessine blinky
		g2.drawImage(pin.getElementImg(),pin.getElementX(),pin.getElementY(), null); // dessine pinky
		g2.drawImage(ink.getElementImg(),ink.getElementX(),ink.getElementY(), null); // dessine inky

		g2.setColor(Color.white);
		g.setFont(new Font("arial", Font.BOLD, 15));
		g2.drawString("Score: " + this.score.getScoreLife() + " ", 100, 665);
		

		//System.out.println("pac bloqué ? " + pac.getBlocked());		
		//System.out.println("pac move :" + pac.getMove());
		//System.out.println("pac nextMove :" + pac.getNextMoves(0));
		System.out.println("pacX " + pac.getElementX());
		System.out.println("pacY" + pac.getElementY());


		 System.out.println("characterSpeed:" +cly.getCharacterSpeed());
		 

		//System.out.println("cly bloqué ? "+cly.getBlocked());
		 //System.out.println("cly move :"+cly.getMove());
		 System.out.println("clyX "+cly.getElementX());
		System.out.println("clyY"+cly.getElementY());


	}
}
