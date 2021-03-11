package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//CLASSE CHE CONTIENE SOLO DATI, NON COMPIE AZIONI!


public class Voto {
	private String nomeCorso;
	private int voto;
	private LocalDate dataSuperamento;
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	public Voto(String nomeCorso, int voto, LocalDate dataSuperamento) {
		super();
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.dataSuperamento = dataSuperamento;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public LocalDate getDataSuperamento() {
		return dataSuperamento;
	}
	public void setDataSuperamento(LocalDate dataSuperamento) {
		this.dataSuperamento = dataSuperamento;
	}

	public String toString() {
		return "Esame: " + nomeCorso + ", superato con " + voto + ", il " + dataSuperamento;
	}
		
}
