package masterMind;

import java.awt.Color;
import java.util.Random;


public class Rangee {
	
	int indiceJeton,noirs,blancs;
	Color[] jetons;
	
	public Rangee(){
		this.jetons = new Color[Modèle.difficulte];
		this.indiceJeton=0;
		this.noirs=0;
		this.blancs=0;
	}
	
	public void generation() {
		Random r = new Random();
		for (int i = 0; i<Modèle.difficulte; i++ ) {
			this.jetons[i] = Modèle.couleur[(r.nextInt(8))];
			
		}
		
		
	}

}
