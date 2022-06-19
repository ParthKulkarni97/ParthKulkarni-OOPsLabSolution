package com.LabSess.IT_Support;

import java.util.Random;

public class CredentialService {
	
	public final String companyName = "ABC" ;
	
	public String generateEmailAddress(String firstName, String lastName, String deptName) {
		String Emailadd = "";
		
		Emailadd = firstName.toLowerCase() + lastName.toLowerCase() + "@" +  deptName + "." + companyName + ".com";
		
		return Emailadd;
		
	}
	
	
	public char[] generatePassword() {
		
	    char[] password = new char[8];
		String captialletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String characters = "!@#$%^&*_+'?/,.<>";
		String Totalvalues = captialletters + smallletters + numbers + characters;
		
		Random rnd = new Random();
		for (int i = 0; i < 8 ; i++) {
			password[i] = Totalvalues.charAt(rnd.nextInt(Totalvalues.length()));		
		}
		
		return password;
		
	}
	
    public void showCredentials(Employee employee, String Emailadd, char [] generatedPasswrd) {
    	
    	System.out.println("Dear "+ employee.getFirstName() + " your generated credentials are as follows ");
	    System.out.println("Your Email Address --> " + Emailadd);
	    System.out.print("Your Password --> ");
	    System.out.print(generatedPasswrd);
	}
	

}
