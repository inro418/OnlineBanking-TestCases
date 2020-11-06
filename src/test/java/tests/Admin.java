package tests;

import org.testng.annotations.Test;

public class Admin {

	@Test
	public void VerifyAdminloginwithValidandInvalidData(){
		System.out.println("Verify Admin login with valid and Invalidd data");
	}
	
	@Test
	public void VerifyAdminloginwithoutData(){
		System.out.println("Verify admin login without data");
	}
	
	@Test
	public void VerifyallAdminHomelinks(){
		System.out.println("Verify all admin home links");
	}
	
	@Test
	public void VerifyAdminchangePasswordwithValidandInvalidData(){
		System.out.println("Verify admin change password with valid and invali ddata");
	}
	
	@Test
	public void VerifyAdminchangePasswordwithoutData(){
		System.out.println("Verify admin change password without data");
	}
	
	@Test
	public void VerifyAdminchangePasswordwithexistingData(){
		System.out.println("Verify admin change password with existing data");
	}
	
	@Test
	public void VerifyAdminlogout(){
		System.out.println("Verify admin logout");
	}
}
