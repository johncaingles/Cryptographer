/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.ciphers;

import controller.ICipherController;

/**
 *
 * @author Zehcnas
 */
public class FoursquareCipherController implements ICipherController {
     char[][] plainTextSquare1;
    char[][] plainTextSquare2; 
    char[][] cipherTextSquare1;
    char[][] cipherTextSquare2;
    char plainTextLetters;
    char cipherTextLetters;
    String[] encryptedMessage;
    
    public dota(){
        plainTextSquare1 = new char[5][5]; 
        plainTextSquare2 = new char[5][5]; 
        cipherTextSquare1 = new char[5][5]; ;
        cipherTextSquare2 = new char[5][5]; ;
        plainTextLetters = 97;
        cipherTextLetters = 65;
        initSquares();
    }
    
    private void initSquares(){
        int row, col;
        char temp = plainTextLetters;
        for(row = 0; row <= 4; row++){
            for(col = 0; col <= 4; col++){
                if(temp != 113){
                    plainTextSquare1[row][col] = temp;
                    plainTextSquare2[row][col] = temp;  
                }else{
                    col--;
                }
                temp++;
            }  
        }   
        
        //Cipher Text Square 1
        //First part of keyword is: EXAMPL
        
        //row 1
        cipherTextSquare1[0][0] = 'E';
        cipherTextSquare1[0][1] = 'X';
        cipherTextSquare1[0][2] = 'A';
        cipherTextSquare1[0][3] = 'M';
        cipherTextSquare1[0][4] = 'P';
        
        
        //row 2
        cipherTextSquare1[1][0] = 'L';
        cipherTextSquare1[1][1] = 'B';
        cipherTextSquare1[1][2] = 'C';
        cipherTextSquare1[1][3] = 'D';
        cipherTextSquare1[1][4] = 'F';
        
        
        //row 3
        cipherTextSquare1[2][0] = 'G';
        cipherTextSquare1[2][1] = 'H';
        cipherTextSquare1[2][2] = 'I';
        cipherTextSquare1[2][3] = 'J';
        cipherTextSquare1[2][4] = 'K';

        
        //row 4
        cipherTextSquare1[3][0] = 'N';
        cipherTextSquare1[3][1] = 'O';
        cipherTextSquare1[3][2] = 'R';
        cipherTextSquare1[3][3] = 'S';
        cipherTextSquare1[3][4] = 'T';
        
        
        //row 5
        cipherTextSquare1[4][0] = 'U';
        cipherTextSquare1[4][1] = 'V';
        cipherTextSquare1[4][2] = 'W';
        cipherTextSquare1[4][3] = 'Y';
        cipherTextSquare1[4][4] = 'Z';
        
        
        //====================
        
        
        
          //Cipher Text Square 2
        //First part of keyword is: KEYWORD
        
        //row 1
        cipherTextSquare2[0][0] = 'K';
        cipherTextSquare2[0][1] = 'E';
        cipherTextSquare2[0][2] = 'Y';
        cipherTextSquare2[0][3] = 'W';
        cipherTextSquare2[0][4] = 'O';
        
        
        //row 2
        cipherTextSquare2[1][0] = 'R';
        cipherTextSquare2[1][1] = 'D';
        cipherTextSquare2[1][2] = 'A';
        cipherTextSquare2[1][3] = 'B';
        cipherTextSquare2[1][4] = 'C';
        
        
        //row 3
        cipherTextSquare2[2][0] = 'F';
        cipherTextSquare2[2][1] = 'G';
        cipherTextSquare2[2][2] = 'H';
        cipherTextSquare2[2][3] = 'I';
        cipherTextSquare2[2][4] = 'J';

        
        //row 4
        cipherTextSquare2[3][0] = 'L';
        cipherTextSquare2[3][1] = 'M';
        cipherTextSquare2[3][2] = 'N';
        cipherTextSquare2[3][3] = 'P';
        cipherTextSquare2[3][4] = 'S';
        
        
        //row 5
        cipherTextSquare2[4][0] = 'T';
        cipherTextSquare2[4][1] = 'U';
        cipherTextSquare2[4][2] = 'V';
        cipherTextSquare2[4][3] = 'X';
        cipherTextSquare2[4][4] = 'Z';
        
     }

    
    public void printSquares(){
        int row, col;
        
        for(row = 0; row <= 4; row++){
            for(col = 0; col <= 4; col++){
              
                    System.out.print(plainTextSquare1[row][col] + " ");
                  
                }
            System.out.println();
        }
        
        System.out.println();
        //==========
        
         for(row = 0; row <= 4; row++){
            for(col = 0; col <= 4; col++){
              
                    System.out.print(plainTextSquare2[row][col] + " ");
                  
                }
            System.out.println();
        }
         
         System.out.println();
        //==========
         
          for(row = 0; row <= 4; row++){
            for(col = 0; col <= 4; col++){
              
                    System.out.print(cipherTextSquare1[row][col] + " ");
                  
                }
            System.out.println();
        }
          
          System.out.println();
        //===========
          
           for(row = 0; row <= 4; row++){
            for(col = 0; col <= 4; col++){
              
                    System.out.print(cipherTextSquare2[row][col] + " ");
                  
                }
            System.out.println();
        }
           System.out.println();
        //===========
            
            
            
        }
    
       
    private String[] getDigraphs(String input){
         String[] digraphs = new String[10000];
         digraphs = input.split("(?<=\\G..)");
         return digraphs;
     }
    
   private int[] getPlainTextLetterLocation(String letter){
       int[] location = new int[2];
       int row, col;
        for(row = 0; row <= 4; row++){
            for(col = 0; col <= 4; col++){
               if(String.valueOf(plainTextSquare1[row][col]).equals(letter)){
                   location[0] = row;
                   location[1] = col;
                   row = 10; // to exit loop
                   col = 10; // to exit loop
               }
           if(row != 10){
               location[0] = -1;
               location[1] = -1;
           }
        }   
       
        }
       return location;
   } 
   
    
    private String[] getCipher(String[] input){
        String[] cipher = input;
        String digraph = "";
        int i, row1, col1, row2, col2;
        int[] letterLocation;
        
        for(i = 0; i < cipher.length; i++){
            
            //first letter of digraph - > input[i].charAt(0); 
            //locate first letter in first plainTextSquare
            letterLocation = getPlainTextLetterLocation(String.valueOf(input[i].charAt(0)));
            row1 = letterLocation[0];
            col1 = letterLocation[1];
            
            //last letter of digraph - > input[i].charAt(1)
            //locate first letter in first plainTextSquare
            letterLocation = getPlainTextLetterLocation(String.valueOf(input[i].charAt(1)));
            row2 = letterLocation[0];
            col2 = letterLocation[1];
           
            
            
            //map plain text letter to cipher letter
            /* to get 1st cipher letter: use the row of the 1st plain 
               text letter and the col of the 2nd plain text letter 
               and using cipherTextSquare1 */
            if(row1 != -1 && col2 != -1){
                digraph = String.valueOf(cipherTextSquare1[row1][col2]);
                
            }
            
            /* to get 2st cipher letter: use the row of the 2nd plain 
            text letter and the col of the 1st plain text letter 
            and using cipherTextSquare1 */
               if(row2 != -1 && col1 != -1){
                digraph = digraph + String.valueOf(cipherTextSquare2[row2][col1]);
                
                }
            
          
               
            cipher[i] = digraph;
            
            digraph = "";
            
        }
        
        
        return cipher;
    }
    
    
    private String[] getCipher2(String[] input){
        String[] cipher = input;
        String digraph = "";
        int i, row1, col1, row2, col2;
        int[] letterLocation;
        
        for(i = 0; i < cipher.length; i++){
            
            //first letter of digraph - > input[i].charAt(0); 
            //locate first letter in first plainTextSquare
            letterLocation = getPlainTextLetterLocation(String.valueOf(input[i].charAt(0)));
            row1 = letterLocation[0];
            col1 = letterLocation[1];
            
            //last letter of digraph - > input[i].charAt(1)
            //locate first letter in first plainTextSquare
            letterLocation = getPlainTextLetterLocation(String.valueOf(input[i].charAt(1)));
            row2 = letterLocation[0];
            col2 = letterLocation[1];
           
            
            
            //map plain text letter to cipher letter
            /* to get 1st cipher letter: use the row of the 1st plain 
               text letter and the col of the 2nd plain text letter 
               and using cipherTextSquare1 */
            if(row1 != -1 && col2 != -1){
                digraph = String.valueOf(cipherTextSquare1[row1][col2]);
                
            }
            
            /* to get 2st cipher letter: use the row of the 2nd plain 
            text letter and the col of the 1st plain text letter 
            and using cipherTextSquare1 */
               if(row2 != -1 && col1 != -1){
                digraph = digraph + String.valueOf(cipherTextSquare2[row2][col1]);
                
                }
            
          
               
            cipher[i] = digraph;
            
            digraph = "";
            
        }
        
        
        return cipher;
    }
        
    
    public void displayDigraphs(String[] digraphs){
        for(int i = 0; i < digraphs.length; i++){
            System.out.print(digraphs[i] + " ");
        }
    }

    @Override
    public String encrypt(String input) {
       String output = "";
       String[] digraphs, ciphers;
       int i = 0;
       
       input = input.toLowerCase();
       input = input.replaceAll("\\s","");
       
       if(input.length() % 2 == 1){
           input = input + "z";
       }
       
       digraphs = getDigraphs(input);
       //displayDigraphs(digraphs);
       encryptedMessage = getCipher(digraphs);
       
       
       do{
           System.out.println("encrmsg:" + encryptedMessage[i]);
           output = output + encryptedMessage[i] + " ";
           i++;
       }while(i < encryptedMessage.length);
       

    
        return output;
    }

    @Override
    public String decrypt(String input) {
       String output = "";
       
       return output;
    }
    
    

       
     
    
}
