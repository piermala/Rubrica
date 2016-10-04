package main;
import rubrica.*;

public class MainRubrica {

	public static void main(String[] args) throws VoceEsistente {
		
		Rubrica r = new Rubrica();
		
		Voce v1 = r.addVoce("Mario", "Rossi", "3334455667");
		/*Voce v1 = r.addVoce("Mario", "Rossi", "3334455667");
		Voce v1 = r.addVoce("Mario", "Rossi", "3334455667");
		Voce v1 = r.addVoce("Mario", "Rossi", "3334455667");*/
		System.out.println(v1);
		
		/// AGGIORNA VOCE
		System.out.println(r.aggiornaVoce("Mario", "Rossi", "3316429670"));
		
		/// CANCELLA VOCE
		r.cancellaVoce("Mario", "Rossi");
		
		System.out.println(r.getListaVoci().size());
	}
}

