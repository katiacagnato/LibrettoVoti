package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti; //(posso mettere tutto insieme)
	
	public Libretto() {
		this.voti = new ArrayList<>(); //Creo la lista quando creo il libretto, prima la lista e vuota
	}
	
	public void add(Voto v) {
		this.voti.add(v);
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
	
	public String toString() {
		String s= "";
		for(Voto v: this.voti)
		{
			s= s + v.toString()+'\n';
		}
		return s;
	}
}

