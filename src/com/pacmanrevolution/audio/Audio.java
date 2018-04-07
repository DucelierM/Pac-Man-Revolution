package com.pacmanrevolution.audio;


import java.applet.Applet;
import java.applet.AudioClip;


public class Audio {
	
	private AudioClip clip ;
	
	public static final Audio audio1 = new Audio("/audio/pacmanSwallowPacFreeze.wav");
	
	public Audio(String filePath) {
		try {
			clip = Applet.newAudioClip(Audio.class.getResource(filePath));
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void play() {
		try {
			new Thread() {
				public void run() {
					clip.play();
				}
			}.start();
	
		}
			
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
