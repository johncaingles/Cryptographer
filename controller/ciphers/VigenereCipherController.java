package controller.ciphers;

import controller.ICipherController;
import java.util.Arrays;
import model.Database;

public class VigenereCipherController implements ICipherController{
    private char[][] tabulaRecta;
    private String encrypt = "";
    private String decrypt = "";
    
    public VigenereCipherController(Database model) {
            tabulaRecta = model.getTabulaRecta();
    }
    
    @Override
    public String encrypt(String input){
        String[] inputString = input.split(" ",2);
        String keyword = inputString[0];
        input = inputString[1];
        
        for(int i = 0; input.length() > keyword.length(); i++){
            keyword+=keyword.charAt(i);
        }
        
        input = input.toUpperCase();
        keyword = keyword.toUpperCase();
        
        for(int i = 0; i < input.length() && i < keyword.length(); i++){
            for(int j = 0; j < 26; j++){
                for(int k = 0; k < 26; k++){
                    if(keyword.charAt(i) == tabulaRecta[j][0] && input.charAt(i) == tabulaRecta[0][k]){
                        encrypt += tabulaRecta[j][k];
                    }
                }
            }
        }
        return encrypt;
    }
    
    @Override
    public String decrypt(String input){
        String[] inputString = input.split(" ",2);
        String keyword = inputString[0];
        input = inputString[1];
        
        for(int i = 0; input.length() > keyword.length(); i++){
            keyword+=keyword.charAt(i);
        }
        
        input = input.toUpperCase();
        keyword = keyword.toUpperCase();
        
        for(int i = 0; i < input.length() && i < keyword.length(); i++){
            for(int j = 0; j < 26; j++){
                for(int k = 0; k < 26; k++){
                    if(keyword.charAt(i) == tabulaRecta[j][0] && input.charAt(i) == tabulaRecta[j][k]){
                        decrypt += tabulaRecta[0][k];
                    }
                }
            }
        }
        return decrypt;
    }
}
