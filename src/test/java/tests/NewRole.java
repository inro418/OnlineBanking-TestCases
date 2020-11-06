package tests;

import org.testng.annotations.Test;

public class NewRole {

	@Test
	public void Createanewrolewithvalidandinvaliddata(){
		System.out.println("Create a new role with valid and invalid data");
	}
	
	@Test
	public void Createanewrolewithoutdata(){
		System.out.println("Create a new role without data");
	}
	
	@Test
	public void Verifynewrolewithexistingdata(){
		System.out.println("Verify new role with existing data");
	}
	
	@Test
	public void Verifyroledescriptionandroletypes(){
		System.out.println("verify role description and role types");
	}
	
	@Test
	public void Verifycancelandresetoption(){
		System.out.println("Verify cancel and reset option");
	}
	
	@Test
	public void Verifyroledeletionwithandwithoutdependency(){
		System.out.println("Verify role deletion with and without dependency");
	}
	
	@Test
	public void VerifylinksinroledetailsPage(){
		System.out.println("verify links in role details page");
	}
    
	@Test
	public void ForcustomerVisitors(){
		System.out.println(" For customer & Visitors");
	}
	
	@Test
	public void Verifyallvisitororcustomerlinks(){
		System.out.println(" Verify all visitor or customer links");
	}
	
	@Test
	public void VerifycustomersloginwithValidandInvalidData(){
		System.out.println("Verify customers login with valid and invalid data");
	}
	
	@Test
	public void VerifycustomersloginwithoutData(){
		System.out.println("Verify customers login without data");
	}
	
	@Test
	public void VerifybankerloginwithoutData(){
	   System.out.println("Verify banker's login without data");
    }
    
    @Test
    public void VerifybankerloginwithValidorInvalidData(){
	System.out.println("Verify banker's login with valid or invalid data");
  }
}