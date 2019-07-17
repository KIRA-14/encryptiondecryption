package com.kira.encrypt;

import java.util.Scanner;

public class EncryptValue {
	private String orginalString;
	private String encryptedstring;

	public static void main(String[] args) {
		EncryptValue es = new EncryptValue();
		es.getInput();
		String encryptvalue=es.encryption();
		System.out.println(encryptvalue);
		String decryptvalue=es.decryption();
		System.out.println(decryptvalue);

	}
	
	public String getorginalString() {
		
		return orginalString;
	}
	
	public String getencryptedstring() {
		
		
		return encryptedstring;
	}
	
	public void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Value to Encrypt:\n");
		orginalString = scan.nextLine();
	}
	
	public String encryption() {
		
		encryptedstring = "";
		 char c;
		 int size = orginalString.length()-1;
		 
		 for(int i=0;i<=size;i++) {
			 c= orginalString.charAt(i);
			 c= (char) ((int)c-i+2);
			 encryptedstring += Character.toString(c);
		 }
		
		return encryptedstring;
		
	}
	
	
	public String decryption() {
		
		orginalString = "";
		 char c;
		 int size = encryptedstring.length()-1;
		 
		 for(int i=0;i<=size;i++) {
			 c= encryptedstring.charAt(i);
			 c= (char) ((int)c+i-2);
			 orginalString += Character.toString(c);
		 }
		
		return orginalString;
		
	}
	
	
}

















