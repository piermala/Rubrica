package main;
import rubrica.*;

public class MainRubrica {

	public static void main(String[] args) throws VoceEsistente {
		
		Rubrica r = new Rubrica();
		
		Voce v1 = r.addVoce("Mario", "Rossi", "3334455667");
		Voce v2 = r.addVoce("Silvio", "Meri", "333859745567");
		Voce v3 = r.addVoce("Vanessa", "Giallo", "3334855667");
		
		
		r.getTutteLeVoci();
		System.out.println(r.getTutteLeVoci());
	}
}

