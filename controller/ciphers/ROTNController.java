/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.ciphers;

import controller.ICipherController;

/**
 *
 * @author user
 */
public class ROTNController implements ICipherController {
        private String input;
	private String output;
	
	@Override
	public String encrypt(String input) {
		output = input + "fuck life this is encrypted";
		return output;
	}

	@Override
	public String decrypt(String input) {
		output = input + "fuck life this is decrypted";
		return output;
	}
        
}
