package com.pacmanrevolution.display;

public abstract class Score {
	private int scoreFruit = 50; 
	private int scoreGhost = 150 ;
	private  int scorePacGum = 100;
	private  int scoreLife = 0 ;
	private  boolean haveUsedContinues;
	private String namePlayer;

	public Score() {
		this.scoreLife = 0;
		
	}

	public void showScore () {
	}

	public String saveScore() {
		return null;	
	}

	public int getScoreLife() {
		return scoreLife;
	}

	public void setScoreLife(int scoreLife) {
		this.scoreLife = scoreLife;
	}

	public String getNamePlayer() {
		return namePlayer;
	}

	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}

	public int getScoreFruit() {
		return scoreFruit;
	}

	public int getScoreGhost() {
		return scoreGhost;
	}

	public int getScorePacGum() {
		return scorePacGum;
	}

	public boolean isHaveUsedContinues() {
		return haveUsedContinues;
	}
	
	

}