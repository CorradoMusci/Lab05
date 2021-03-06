package it.polito.tdp.anagrammi.controller;

import it.polito.tdp.anagrammi.model.AnagrammiModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {

	@FXML
	private TextField txtInput;

	@FXML
	private Button btnCalcolaAnagrammi;

	@FXML
	private TextArea txtCorretti;

	@FXML
	private TextArea txtErrati;

	@FXML
	private Button btnReset;

	private AnagrammiModel model;

	@FXML
	void doCalcolaAnagrammi(ActionEvent event) {
		
		txtCorretti.clear();
		txtErrati.clear();
		
		String parola = txtInput.getText();
		//Se ti aggiugi controlli quando puoi
		model.setParola(parola);
		
		for(String s : model.paroleCorrette())
			     txtCorretti.appendText(s+"\n");
		
		for(String s : model.paroleErrate())
		     txtErrati.appendText(s+"\n");

	}

	@FXML
	void doReset(ActionEvent event) {
		
		this.txtInput.clear();
		this.txtCorretti.clear();
		this.txtErrati.clear();

	}

	public void set(AnagrammiModel model) {
		this.model = model;
	}

}
