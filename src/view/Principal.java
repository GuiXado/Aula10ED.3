package view;

import javax.swing.JOptionPane;
import br.gui.listagenerica.*;
import model.Chocolate;
import controller.ControleChocolate;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Lista<Chocolate> listaChocolates = new Lista<>();
		ControleChocolate controle = new ControleChocolate();

		listaChocolates.addFirst(new Chocolate(50, 60, 60, "Bombom"));
		listaChocolates.addFirst(new Chocolate(100, 110, 115, "Pavê"));
		listaChocolates.addFirst(new Chocolate(150, 165, 160, "Brigadeiro"));
		listaChocolates.addFirst(new Chocolate(200, 220, 215, "Bolo"));
		listaChocolates.addFirst(new Chocolate(260, 280, 280, "Ovo de Páscoa"));
		
		int vol = Integer.parseInt(JOptionPane.showInputDialog("Qual o volume do chocolate?"));
		
		Chocolate cho = controle.consultaChocolate(vol, listaChocolates);
		
		if (cho != null) {
			JOptionPane.showMessageDialog(null, cho); // vai chamar o toString
		} else {
			JOptionPane.showMessageDialog(null, "Volume não encontrado");
		}
		
	}

}
