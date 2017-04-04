package it.polito.tdp.anagrammi.model;


import java.util.LinkedList;

import java.util.Set;

import it.polito.tdp.permutazioniRicorsiva.*;

public class AnagrammiModel{
	
	private LinkedList<String> parole;
	private LinkedList<Set<String>> permutazioni;
	
	public AnagrammiModel(){
		
		parole = new LinkedList<String>();
	}
	
	public void addParole(String s){
		parole.add(s);
	}
	
	public LinkedList<String> getParole(){
		return parole;
	}
	
	public LinkedList<Set<String>> permutaParoleLista(){
		for(String s : parole){
			Permutazioni  p = new Permutazioni(s);
			Set<String> temp = p.ricorsive();
			permutazioni.add(temp);
			
		}
		return permutazioni;
	}
	
}
