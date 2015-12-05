package controller.ciphers;

import java.util.Arrays;

import controller.ICipherController;
import model.Database;

public class BeaufortCipherController implements ICipherController {

	private char[][] tabulaRecta;
	
	public BeaufortCipherController(Database model) {
		tabulaRecta = model.getTabulaRecta();
	}

	@Override
	public String encrypt(String input) {
		/** get key */
		String[] inputStringArr = input.split("\\s+");
		String key = inputStringArr[0];
		while(key.length()<input.length()) {
			key = key+key;
		}
		inputStringArr = Arrays.copyOfRange(inputStringArr, 1, inputStringArr.length);
		input = Arrays.toString(inputStringArr);
		input = input.substring(1, input.length()-1);
		
		char[] inputCharArray = input.toUpperCase().toCharArray();
		char[] keyCharArray = key.toUpperCase().toCharArray();
		
		int offset=0;
		for(int i = 0; i < inputCharArray.length; i++){
        	
			
            if(Character.isLetter(inputCharArray[i])){
//            	if(inputCharArray[i]-65<13){
//	            	offset = inputCharArray[i]-keyCharArray[i];
//	            	if(offset<0){
//	            		offset = offset-(offset*2);
//	            	}
//            	}
//            	else {
//            		if( inputCharArray[i]<keyCharArray[i])
//            			offset = inputCharArray[i]-65 + 65-keyCharArray[i];
//            		else offset = 90-keyCharArray[i] + 65-inputCharArray[i];
//            	}
//            	System.out.println(i + " : " + offset + " : " + inputCharArray[i] + keyCharArray[i]);
//            	if((inputCharArray[i]-65)>13)
//	            	inputCharArray[i] = tabulaRecta[90-inputCharArray[i]+offset][0];
//            	else
//            		inputCharArray[i] = tabulaRecta[offset][0];
            	for(int j=0; j<26; j++) {
            		if(tabulaRecta[j][inputCharArray[i]-65]==keyCharArray[i]){
            			inputCharArray[i] = tabulaRecta[j][0];
            			break;
            		}
            	}
            }
            
        }
		
		return new String(inputCharArray);
	}

	@Override
	public String decrypt(String input) {
		/** get key */
		String[] inputStringArr = input.split("\\s+");
		String key = inputStringArr[0];
		while(key.length()<input.length()) {
			key = key+key;
		}
		inputStringArr = Arrays.copyOfRange(inputStringArr, 1, inputStringArr.length);
		input = Arrays.toString(inputStringArr);
		input = input.substring(1, input.length()-1);
		
		char[] inputCharArray = input.toUpperCase().toCharArray();
		char[] keyCharArray = key.toUpperCase().toCharArray();
		
		int offset=0;
		for(int i = 0; i < inputCharArray.length; i++){
        	
			
            if(Character.isLetter(inputCharArray[i])){
//            	if(inputCharArray[i]-65<13){
//	            	offset = inputCharArray[i]-keyCharArray[i];
//	            	if(offset<0){
//	            		offset = offset-(offset*2);
//	            	}
//            	}
//            	else {
//            		if( inputCharArray[i]<keyCharArray[i])
//            			offset = inputCharArray[i]-65 + 65-keyCharArray[i];
//            		else offset = 90-keyCharArray[i] + 65-inputCharArray[i];
//            	}
//            	System.out.println(i + " : " + offset + " : " + inputCharArray[i] + keyCharArray[i]);
//            	if((inputCharArray[i]-65)>13)
//	            	inputCharArray[i] = tabulaRecta[90-inputCharArray[i]+offset][0];
//            	else
//            		inputCharArray[i] = tabulaRecta[offset][0];
            	for(int j=0; j<26; j++) {
            		if(tabulaRecta[j][inputCharArray[i]-65]==keyCharArray[i]){
            			inputCharArray[i] = tabulaRecta[j][0];
            			break;
            		}
            	}
            }
            
        }
		
		return new String(inputCharArray);
	}

}
