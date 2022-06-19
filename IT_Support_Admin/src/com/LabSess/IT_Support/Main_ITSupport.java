package com.LabSess.IT_Support;

import java.util.Scanner;

public class Main_ITSupport {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter First Name- ");
			String firstName = sc.next();
			System.out.print("Enter Last Name- ");
			String lastName = sc.next();
			
			Employee emp = new Employee(firstName ,lastName);
			CredentialService cs  = new CredentialService();
			
			String generatedEmail, department = "";
			//char[] generatedPassword;
			System.out.println("Please emter the department from the following ");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			int options = sc.nextInt();
			
			switch(options) {
			  case 1:
			    department  = "tech";
			    generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), department);				
				cs.showCredentials(emp, generatedEmail, cs.generatePassword());
			    break;
			  case 2:
				  department  = "adm";
				  generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), department);				
					cs.showCredentials(emp, generatedEmail, cs.generatePassword());
			    break;
			  case 3:
				  department  = "hr";
				  generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), department);				
					cs.showCredentials(emp, generatedEmail, cs.generatePassword());
				break;
			  case 4:
				  department  = "lgl";
				  generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), department);				
					cs.showCredentials(emp, generatedEmail, cs.generatePassword());
				break;
			  default:
			    System.out.println("Please enter the valid department");
			    sc.close();
			}
			
			
			
			
		}
 
	}

}
