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
    char[][] plainTextSquare1 = new char[5][5]; 
    char[][] plainTextSquare2 = new char[5][5]; 
    char[][] cipherTextSquare1;
    char[][]cipherTextSquare2;
    char plainTextLetters = 97;
    char cipherTextLetters = 65;
    
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
        //First part of keyword is: PERCULATOR
        
        //row 1
        cipherTextSquare1[0][0] = 'P';
        cipherTextSquare1[0][1] = 'E';
        cipherTextSquare1[0][2] = 'R';
        cipherTextSquare1[0][3] = 'B';
        cipherTextSquare1[0][4] = 'D';
        
        
        //row 2
        cipherTextSquare1[1][0] = 'C';
        cipherTextSquare1[1][1] = 'U';
        cipherTextSquare1[1][2] = 'L';
        cipherTextSquare1[1][3] = 'F';
        cipherTextSquare1[1][4] = 'G';
        
        
        //row 3
        cipherTextSquare1[2][0] = 'A';
        cipherTextSquare1[2][1] = 'T';
        cipherTextSquare1[2][2] = 'O';
        cipherTextSquare1[2][3] = 'H';
        cipherTextSquare1[2][4] = 'I';

        
        //row 4
        cipherTextSquare1[3][0] = 'J';
        cipherTextSquare1[3][1] = 'K';
        cipherTextSquare1[3][2] = 'M';
        cipherTextSquare1[3][3] = 'N';
        cipherTextSquare1[3][4] = 'S';
        
        
        //row 5
        cipherTextSquare1[4][0] = 'V';
        cipherTextSquare1[4][1] = 'W';
        cipherTextSquare1[4][2] = 'X';
        cipherTextSquare1[4][3] = 'Y';
        cipherTextSquare1[4][4] = 'Z';
        
        
        //====================
        
        
        
          //Cipher Text Square 2
        //First part of keyword is: VSC
        
        //row 1
        cipherTextSquare2[0][0] = 'V';
        cipherTextSquare2[0][1] = 'A';
        cipherTextSquare2[0][2] = 'B';
        cipherTextSquare2[0][3] = 'D';
        cipherTextSquare2[0][4] = 'E';
        
        
        //row 2
        cipherTextSquare2[1][0] = 'F';
        cipherTextSquare2[1][1] = 'S';
        cipherTextSquare2[1][2] = 'G';
        cipherTextSquare2[1][3] = 'H';
        cipherTextSquare2[1][4] = 'I';
        
        
        //row 3
        cipherTextSquare2[2][0] = 'J';
        cipherTextSquare2[2][1] = 'K';
        cipherTextSquare2[2][2] = 'C';
        cipherTextSquare2[2][3] = 'L';
        cipherTextSquare2[2][4] = 'M';

        
        //row 4
        cipherTextSquare2[3][0] = 'N';
        cipherTextSquare2[3][1] = 'O';
        cipherTextSquare2[3][2] = 'P';
        cipherTextSquare2[3][3] = 'R';
        cipherTextSquare2[3][4] = 'T';
        
        
        //row 5
        cipherTextSquare2[4][0] = 'U';
        cipherTextSquare2[4][1] = 'W';
        cipherTextSquare2[4][2] = 'X';
        cipherTextSquare2[4][3] = 'Y';
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
    
       
     
        
    
    
    @Override
    public String encrypt(String input) {
       String output = "";
       
       
       
        
        return output;
    }

    @Override
    public String decrypt(String input) {
       String output = "";
       
       return output;
    }
    
}
