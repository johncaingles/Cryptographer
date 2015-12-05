package model;

import java.util.ArrayList;

public class Database{
	
	private ArrayList<String> listOfCiphers;
	
	public Database() {
		listOfCiphers = new ArrayList<String>();
		
		populateListOfCiphers();
	}

	private void populateListOfCiphers() {
		listOfCiphers.add("Hill Cipher");
	}
	
	public ArrayList<String> getListOfCiphers() {
		return listOfCiphers;
	}
}
