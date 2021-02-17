package masterMind;

import java.awt.Color;


public class Modèle {
	
	Color[] couleur;
	int N_TENTATIVES;
	static int difficulte;
	enum Etat {EN_COUR, GAGNE, PERDU};
	
	Etat etat;
	Rangee combinaison;
	Rangee[] proposition;
	int tentative;
	
	public Modèle() {
		this.N_TENTATIVES = 10;
		this.difficulte = 4;
		this.couleur = new Color[8];
		this.couleur[0] = (Color.YELLOW);
		this.couleur[1] =(Color.GREEN);
		this.couleur[2] = (Color.BLUE);
		this.couleur[3] = (Color.MAGENTA);
		this.couleur[4] = (Color.RED);
		this.couleur[5] = (Color.ORANGE);
		this.couleur[6] =(Color.WHITE);
		this.couleur[7] = (Color.BLACK);
	}
	
	

}
