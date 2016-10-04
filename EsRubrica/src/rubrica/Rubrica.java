package rubrica;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Rubrica {

	private Map<String,Voce> listaVoci = new TreeMap<String,Voce>();


	public Map<String,Voce> getListaVoci() {
		return listaVoci;
	}

	public void setListaVoci(Map<String,Voce> listaVoci) {
		this.listaVoci = listaVoci;
	}
	
	
	public Voce addVoce(String nome, String cognome, String telefono) throws VoceEsistente {
		Voce voce = null;
		if (listaVoci.containsKey(nome+" "+cognome)){
			throw new VoceEsistente ("La voce gi� esiste!");
		} else {
			voce = new Voce(nome, cognome, telefono);
			listaVoci.put(nome + " " + cognome, voce);
		}
		
		return voce;
	}
	
	
	public Voce getVoce(String nome, String cognome){
		return null;
		
	}
	
	public List<Voce> getTutteLeVoci(){
		return null;
	}
	
	
	/// AGGIORNA VOCE
	public Voce aggiornaVoce(String nome, String cognome, String telefono) throws VoceEsistente{
		Voce v = null;
		for (Map.Entry<String, Voce> map : listaVoci.entrySet()){
			if (map.getKey().equals(nome+" "+cognome)){
				v = new Voce(nome, cognome, telefono);
				listaVoci.put(nome+" "+cognome, v);
			} else {
				throw new VoceEsistente("L'utente non esiste!");
			}
		}		
		return v;
	}
	
	
	/// CANCELLA VOCE
	public Voce cancellaVoce(String nome, String cognome) throws VoceEsistente{
		Voce v = null;
		for (Map.Entry<String, Voce> map : listaVoci.entrySet()){
			if (map.getKey().equals(nome+" "+cognome)){
				v = new Voce(nome, cognome, listaVoci.get(nome+" "+cognome).getTelefono());
				listaVoci.remove(nome+" "+cognome);
			} else {
				throw new VoceEsistente("L'utente non esiste!");
			}
		}		
		return v;
	}
	
	
}
