package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libretto {
	
	private List <Voto> voti; //(posso mettere tutto insieme)
	private Map<String, Voto> votiMap; //identity map
	
	
	public Libretto() {
		this.voti = new ArrayList<>(); //Creo la lista quando creo il libretto, prima la lista e vuota
		this.votiMap= new HashMap<>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
		this.votiMap.put(v.getNomeCorso(), v);
	}
	
	/*
	public void stampaVotiUgualia(int punteggio) {
		System.out.println();						//non sono metodi versatili
		// il Libretto stampa solo i voti
	}
	
	public String VotiUgualia(int punteggio) {
		
	}
	*/
	public List<Voto> ListaVotiugualia(int punteggio){
		List<Voto> risultato = new ArrayList<>();
		for(Voto v: this.voti)
		{
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	public Libretto Librettovotiugualia(int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v: this.voti)
		{
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	/**
	 * Ricerca un voto che corrirsponde al coro passato come parametro.
	 * Se il corso non esiste restituisce null.
	 * @param nomeCorso
	 * @return
	 */
	
	public Voto ricercacorso(String nomeCorso)
	{
//		Voto risultato=null;
//		for(Voto v: this.voti)
//		{
//			if(v.getNomeCorso().equals(nomeCorso))
//				{risultato=v;
//					break;}
//		}
//		return risultato;
		return this.votiMap.get(nomeCorso);
	}
	
	public String toString() {
		String s= "";
		for(Voto v: this.voti)
		{
			s= s + v.toString()+'\n';
		}
		return s;
	}
	
	public boolean esisteDuplicato(Voto v) {
//		boolean trovato=false;
//		for(Voto voto: this.voti)
//		{	if(voto.getNomeCorso().equals(v.getNomeCorso()) && voto.getVoto()==v.getVoto())
//				trovato=true;
//				break;            CON LISTA
//		} 
//			return trovato;
		
		Voto trovato= this.votiMap.get(v.getNomeCorso());
		if(trovato==null)
			return false;						//CON MAPPA, HA UN T DI ESECUZIONE MOLTO MINORE
		if(trovato.getVoto()==v.getVoto())
			return true;
		else 
			return false;
	}
	
	public boolean esisteConflitto(Voto v) {
//		boolean trovato=false;
//		for(Voto voto: this.voti)
//		{	if(voto.getNomeCorso().equals(v.getNomeCorso()) && voto.getVoto()!=v.getVoto())
//				trovato=true;
//				break;						  CON LISTA
//		} 
//			return trovato;
		
		Voto trovato= this.votiMap.get(v.getNomeCorso());
		if(trovato==null)
			return false;						//CON MAPPA, HA UN T DI ESECUZIONE MOLTO MINORE
		if(trovato.getVoto()!=v.getVoto())
			return true;
		else 
			return false;
	}
	
	
}



