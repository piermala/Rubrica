package rubrica;

import java.util.ArrayList;
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
	
	//Metodo 1)
	public Voce addVoce(String nome, String cognome, String telefono) throws VoceEsistente {
		Voce voce = null;
		if (listaVoci.containsKey(nome+" "+cognome)){
			throw new VoceEsistente ("La voce già esiste!");
		} else {
			voce = new Voce(nome, cognome, telefono);
			listaVoci.put(nome + " " + cognome, voce);
		}
		
		return voce;
	}
	
	//Metodo 2)
	public Voce getVoce(String nome, String cognome) throws VoceEsistente{
		
		Voce v=null;
		if(!listaVoci.containsKey(nome+" "+cognome)){
			
			throw new VoceEsistente("La voce non è presente in rubrica");	
			
		}else{
			Voce v1 = new Voce();
			v=v1;
		}
		
		return v;
		
	}
	//Metodo 3)
	public List<Voce> getTutteLeVoci(){
		
	List<Voce> lista = new ArrayList<Voce>(listaVoci.values());
	
	
		
//	for(Map.Entry <String , Voce>mappa : listaVoci.entrySet()){
//		System.out.println(mappa);
//	}
		
		return lista;
	}
	
	//Metodo 4)
//	public Voce aggiornaVoce(String nome, String cognome, String telefono){
		Voce v = null;
	//	for (Voce v : listaVoci.get(nome+" "+cognome));
	//}
	
//	//Metodo 5)
//	public Voce cancellaVoce(String nome, String cognome){
		
	}
	
	
//}
