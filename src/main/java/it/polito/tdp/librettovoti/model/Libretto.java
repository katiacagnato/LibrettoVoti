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
	public String toString() {
		String s= "";
		for(Voto v: this.voti)
		{
			s= s + v.toString()+'\n';
		}
		return s;
	}
}

