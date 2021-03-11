package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	
	public static void main(String[] args) {

		System.out.println("Test metodi libretto");
		Libretto libretto= new Libretto();
		
		Voto voto1= new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
		libretto.add(voto1);
		Voto voto2= new Voto("Fisica 1", 27, LocalDate.of(2019, 2, 21));
		libretto.add(voto2);
		Voto voto3= new Voto("Informatica", 22, LocalDate.of(2019, 2, 22));
		libretto.add(voto3);
		Voto voto4= new Voto("Sistemi elettrici", 26, LocalDate.of(2019, 2, 28));
		libretto.add(voto4);
		Voto voto5= new Voto("Economia", 25, LocalDate.of(2020, 9, 15));
		libretto.add(voto5);
		Voto voto6= new Voto("Diritto", 18, LocalDate.of(2019, 6, 15));
		libretto.add(voto6);
		Voto voto7= new Voto("Analisi 2", 24, LocalDate.of(2020, 2, 15));
		libretto.add(voto7);
		Voto voto8= new Voto("Fisica 2", 30, LocalDate.of(2019, 2, 15));
		libretto.add(voto8);
		Voto voto9= new Voto("Ricerca operativa", 29, LocalDate.of(2021, 1, 27));
		libretto.add(voto9);
		Voto voto10= new Voto("Programmazione a oggetti", 27, LocalDate.of(2021, 2, 24));
		libretto.add(voto10);
		
		System.out.println(libretto);
		
		List<Voto> venticinque= libretto.ListaVotiugualia(25);
		System.out.println(venticinque);
		
		Libretto lib= libretto.Librettovotiugualia(25);
		System.out.println(lib);
	}
}



