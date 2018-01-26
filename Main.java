package com.pacmanrevolution.game;
import com.pacmanrevolution.objets.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {
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
		display.setResizable(false);
		display.setAlwaysOnTop(true);
		
		// Chargement du background du niveau 
		
		Scene sc1 = new Scene();
		display.setContentPane(sc1);
		display.setVisible(true);
		
		
		// Chargement de 3 super pac gommes
       
		PacGum pg1 = new PacGum();
		sc1.add(pg1.pacGumLabel);
		
		PacGum pg2 = new PacGum();
		sc1.add(pg2.pacGumLabel);
		
		PacGum pg3 = new PacGum();
		sc1.add(pg3.pacGumLabel);
		
		
	}
}
