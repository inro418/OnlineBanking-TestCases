package tests;

import org.testng.annotations.Test;

public class NewUsers {
    
	@Test
	public void CreateanewuserwithValidandInvalidData(){
		System.out.println("Create a new user with valid and invalid data");
	}
	
	@Test
	public void CreateanewuserwithoutData(){
		System.out.println("Create a new user without data");
	}
	
	@Test
	public void CreateanewuserwithexistingBranchData(){
		System.out.println(" Create a new user with existing branch data");
	}
	
	@Test
	public void Verifycancelandresetoption(){
		System.out.println("Verify cancel and reset option");
	}
	
	@Test
	public void UpdateuserwithValidandInvalidData(){
		System.out.println("Update user with valid and invalid data");
	}
	
	@Test
	public void UpdateuserwithexistingData(){
		System.out.println("Update user with existing data");
	}
	
	@Test
	public void Verifycanceloption(){
		System.out.println("Verify cancel option");
	}
	
	@Test
	public void Verifydeletionoftheuser(){
		System.out.println("Verify deletion of the user");
	}
}
