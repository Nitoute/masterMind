package masterMind;

import java.awt.Color;

public class Rangee {
	
	int indiceJeton,noirs,blancs;
	Color[] jetons;
	
	public Rangee(){
		this.jetons = new Color[Modèle.difficulte];
		this.indiceJeton=0;
		this.noirs=0;
		this.blancs=0;
	}

}
