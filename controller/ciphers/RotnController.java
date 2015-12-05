/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.ciphers;

import controller.ICipherController;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class RotnController implements ICipherController {
        private String input;
	private String output;
	
	@Override
	public String encrypt(String input) {
                char[] inputCharArr;
                int n;
                
                n = Integer.parseInt(input.split("\\s+")[0]);
                inputCharArr = input.replaceAll("[^A-Za-z0-9]+","").toUpperCase().toCharArray();
                inputCharArr = Arrays.copyOfRange(inputCharArr, 1, inputCharArr.length);
                for(int i = 0; i < inputCharArr.length; i++){
                    inputCharArr[i] = (char) (inputCharArr[i]+n);
                }
                
		return new String(inputCharArr);
	}

	@Override
	public String decrypt(String input) {
		output = input + "fuck life this is decrypted";
		return output;
	}
        
}
