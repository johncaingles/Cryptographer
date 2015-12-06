package model;

import java.util.ArrayList;

public class Database{
	
	private ArrayList<String> listOfCiphers;
	private char[][] tabulaRecta;
	
	public Database() {
		listOfCiphers = new ArrayList<String>();
		tabulaRecta = new char[26][26];
		
		populateListOfCiphers();
		populateTabulaRecta();
	}

	private void populateTabulaRecta() {
		
		int value;
		int startValue=64;
		
		for(int i=0; i<26; i++) {
			value = startValue;
			for(int j=0; j<26; j++) {
				if(value+1>90)
					value=64;
				tabulaRecta[i][j] = (char) (value+=1);
			}
			startValue++;
		}
//		for(int i=0; i<26; i++) {
//			for(int j=0; j<26; j++) {
//				System.out.printf(tabulaRecta[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	private void populateListOfCiphers() {
		/** add new cipher names here */
                listOfCiphers.add("ROT-N");
                listOfCiphers.add("Four-square Cipher");
        listOfCiphers.add("Beaufort Cipher");
        listOfCiphers.add("Vigenere Cipher");
        listOfCiphers.add("Caesar Cipher");
		listOfCiphers.add("Hill Cipher");
                
	}
	
	public ArrayList<String> getListOfCiphers() {
		return listOfCiphers;
	}
	
	public char[][] getTabulaRecta() {
		return tabulaRecta;
	}
}
