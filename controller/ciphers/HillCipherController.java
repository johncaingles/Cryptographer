package controller.ciphers;

import controller.ICipherController;

public class HillCipherController implements ICipherController {
	
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
