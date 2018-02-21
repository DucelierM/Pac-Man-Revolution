package com.pacmanrevolution.game;
import com.pacmanrevolution.objets.*;
import com.pacmanrevolution.characters.*;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {
	
	public static Scene sc1 ;
	public static void main(String[] args) {
		

		JOptionPane.showMessageDialog(null,
				"Bienvenue sur PacMan Revolution ! Ne rages pas trop si tu n'arrives pas à finir le jeu !");

		// insert and verify nickname
		
		String name = null;
		boolean controlName = false;
		do {

			name = JOptionPane.showInputDialog(null, "Veuillez indiquez un pseudo !", "Informations personnel",
					JOptionPane.QUESTION_MESSAGE);

			if (name.length() < 2 || name.length() > 16) {
				JOptionPane.showMessageDialog(null, "Oups! entrez un pseudo entre 2 et 16 caracteres !", "",
						JOptionPane.INFORMATION_MESSAGE);
			}

			else {
				controlName = true;
			}
		} while (controlName == false);

		JOptionPane.showMessageDialog(null, "Votre nom est " + name + ". c'est parti pour perdre !!!", "Identite",
				JOptionPane.INFORMATION_MESSAGE);

		// Display map

		JFrame display = new JFrame("Pac Man Revolution");

		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setSize(700, 700);
		display.setLocationRelativeTo(null);
		display.setResizable(false);	//interdit le redimensionement de la fenetre
		display.setAlwaysOnTop(true); // permet de faire passer tous les autres images au dessus de Background
		
		// Chargement du background du niveau 
		
		sc1 = new Scene();
		display.setContentPane(sc1);
		display.setVisible(true);
		
		
		

	}
}
