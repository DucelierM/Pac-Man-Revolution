package com.pacmanrevolution.objets;


import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PacGum extends Item {
	
	public JLabel pacGumLabel ;


	public PacGum() {
				elementImgIco= new ImageIcon("sprites/PacItems/SuperPacGum.png");
				pacGumLabel = new JLabel(elementImgIco);
				
	}
	
}