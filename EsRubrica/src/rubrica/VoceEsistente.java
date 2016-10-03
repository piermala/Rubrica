package rubrica;

public class VoceEsistente extends Exception {

	private static final long serialVersionUID = 1L;

	public VoceEsistente(String message){
		super(message);
		//System.out.println(message);
	}
	
}
