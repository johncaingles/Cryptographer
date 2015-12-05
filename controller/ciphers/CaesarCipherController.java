package controller.ciphers;

import java.util.Arrays;

import controller.ICipherController;

public class CaesarCipherController implements ICipherController {

	@Override
	public String encrypt(String input) {
		char[] inputCharArr;
        String[] inputStringArr;
        int n;
        
        inputStringArr = input.split("\\s+");
        n = Integer.parseInt(inputStringArr[0]);
        inputStringArr = Arrays.copyOfRange(inputStringArr, 1, inputStringArr.length);
        
        input = Arrays.toString(inputStringArr);
        
        inputCharArr = input.replaceAll("[^A-Za-z0-9]+","").toUpperCase().toCharArray();
        
        for(int i = 0; i < inputCharArr.length; i++){
            inputCharArr[i] = (char) (inputCharArr[i]+n);
        }
			        
		return new String(inputCharArr);
	}

	@Override
	public String decrypt(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
