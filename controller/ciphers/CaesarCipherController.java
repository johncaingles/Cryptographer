package controller.ciphers;

import java.util.Arrays;

import controller.ICipherController;

public class CaesarCipherController implements ICipherController {

	@Override
	public String encrypt(String input) {
        char[] inputCharArr;
        String[] inputStringArr;
        int n;
        
        input = input.trim();
        
        inputStringArr = input.split("\\s+", 2);
        n = Integer.parseInt(inputStringArr[0]);
        inputStringArr = Arrays.copyOfRange(inputStringArr, 1, inputStringArr.length);
        
        input = Arrays.toString(inputStringArr);
        
        inputCharArr = input.toUpperCase().toCharArray();
        inputCharArr = Arrays.copyOfRange(inputCharArr, 1, inputCharArr.length-1);
        
        for(int i = 0; i < inputCharArr.length; i++){
            if(Character.isLetter(inputCharArr[i])){
                    inputCharArr[i] = (char) (inputCharArr[i]+((inputCharArr[i]+n > 90) ? n - 26 : n));
            }
        }
		        
		return new String(inputCharArr);
	}

	@Override
	public String decrypt(String input) {
		char[] inputCharArr;
        String[] inputStringArr;
        int n;
        
        input = input.trim();
        
        inputStringArr = input.split("\\s+", 2);
        n = Integer.parseInt(inputStringArr[0]);
        inputStringArr = Arrays.copyOfRange(inputStringArr, 1, inputStringArr.length);
        
        input = Arrays.toString(inputStringArr);
        
        inputCharArr = input.toUpperCase().toCharArray();
        inputCharArr = Arrays.copyOfRange(inputCharArr, 1, inputCharArr.length-1);
        
        for(int i = 0; i < inputCharArr.length; i++){
            if(Character.isLetter(inputCharArr[i])){
                    inputCharArr[i] = (char) (inputCharArr[i]-((inputCharArr[i]-n < 65) ? n - 26 : n));
            }
		 }
		        
		return new String(inputCharArr);
	}

}
