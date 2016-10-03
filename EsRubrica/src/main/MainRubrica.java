package main;
import rubrica.*;

public class MainRubrica {

	public static void main(String[] args) throws VoceEsistente {
		
		Rubrica r = new Rubrica();
		Voce v1 = r.addVoce("Mario", "Rossi", "3334455667");
		System.out.println(v1);
	}
}

