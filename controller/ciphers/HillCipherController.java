package controller.ciphers;

import controller.ICipherController;

public class HillCipherController implements ICipherController {
	
	private String input;
	private String output;
	
	@Override
	public String encrypt(String input) {
	
	    int k[][]={{17,17,5}, {21,18,21}, {2,2,19}};
	    int p[]=new int[300];
	    int c[]=new int[300];
	    int i=0;    
	    String str=input;
	    
	    for( i=0;i<str.length();i++)
	    {
	        int c1=str.charAt(i);
	        p[i]=(c1)-97;
	    }
	                i=0;int zz=0;
	        for( int b=0;b<str.length()/3;b++)
	        {
		        for(int j=0;j<3;j++)
		        {
			        for(int x=0;x<3;x++)
				    {
				        c[i]+=k[j][x]*p[x+zz];
			        }i++;
		        }
		        zz+=3;
	        }
	        char[] result = new char[200];
	        for(int z=0;z<str.length();z++)
	        	result[z]=((char)((c[z]%26)+97));
		    
		return new String(result);
	}

	@Override
	public String decrypt(String input) {
		
		return output;
	}

}
