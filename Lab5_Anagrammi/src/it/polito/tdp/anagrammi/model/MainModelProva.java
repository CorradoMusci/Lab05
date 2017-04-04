package it.polito.tdp.anagrammi.model;


public class MainModelProva {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnagrammiModel m = new AnagrammiModel();
		
	    m.addParole("eat");
	    m.addParole("mangiare");
	    
	    System.out.println(m.getParole());
	    
	    System.out.println(m.permutaParoleLista());
	}

}
