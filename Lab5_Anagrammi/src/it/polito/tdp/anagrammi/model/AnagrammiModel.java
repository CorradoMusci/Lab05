package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.Set;

import it.polito.tdp.DAO.PermutazioniDAO;
import it.polito.tdp.permutazioniRicorsiva.*;

public class AnagrammiModel {

	private String parola;

	private PermutazioniDAO permutazioniDAO = new PermutazioniDAO();

	public AnagrammiModel() {

	}
	
	public void setParola(String parola){
		this.parola = parola;
	}

	public Set<String> permutaParoleLista() {

		Permutazioni p = new Permutazioni(parola);

		return p.cercaCombinazioni();
	}

	// Metodi per il DAO

	public ArrayList<String> paroleCorrette() {

		ArrayList<String> paroleCorrette = new ArrayList<String>();

		for (String s : this.permutaParoleLista()) {
			if (permutazioniDAO.parolaTrovata(s))
				paroleCorrette.add(s);

		}

		return paroleCorrette;
	}

	public ArrayList<String> paroleErrate() {
		ArrayList<String> paroleErrate = new ArrayList<String>();

		
			for (String temp : this.permutaParoleLista()) {
				if (!permutazioniDAO.parolaTrovata(temp))
					paroleErrate.add(temp);

			
		}
		return paroleErrate;

	}

}
