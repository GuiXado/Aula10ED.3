package controller;

import model.Chocolate;
import br.gui.listagenerica.*;

public class ControleChocolate {
	
	public Chocolate consultaChocolate(int volume, Lista<Chocolate> intervalo) throws Exception {
		
		for (int i = 0; i < intervalo.size(); i++) {
			Chocolate faixa = intervalo.get(i);
	        if (volume >= faixa.volumeMin && volume <= faixa.volumeMax) {
	            return faixa;
	        }
	    }
	    return null;
		
	}
}