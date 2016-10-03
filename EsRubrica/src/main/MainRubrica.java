package main;
import rubrica.*;

public class MainRubrica {

	public static void main(String[] args) throws VoceEsistente {
		
		Rubrica r = new Rubrica();
		Voce v1 = r.addVoce("Pier", "Mala", "3316328679");
		System.out.println(v1);
	}
}
