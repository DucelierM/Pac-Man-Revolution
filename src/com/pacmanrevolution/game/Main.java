package com.pacmanrevolution.game;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bienvenue sur PacMan Révolution ! Ne rage pas trop si tu n'arrive pas a finir le jeu !");
		
		String name = JOptionPane.showInputDialog(null, "Veuillez indiquez votre nom !", 
	    		"Informations personnel", JOptionPane.QUESTION_MESSAGE);
	    
	    JOptionPane.showMessageDialog(null, "Votre nom est " + name, "Identité", JOptionPane.INFORMATION_MESSAGE);
		
		
		JFrame display = new JFrame("Pac Man Révolution");

		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setSize(700, 700);
		display.setLocationRelativeTo(null);
		display.setResizable(false);
		display.setAlwaysOnTop(true);
		//fenetre.setContentPane(); 
		display.setVisible(true);
	}
}
