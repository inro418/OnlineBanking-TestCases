package tests;

import org.testng.annotations.Test;

public class NewBranch {

	@Test
	public void Createanewbranchwithvalidandinvaliddata(){
		System.out.println("Create a new branch with valid and invalid data");
	}
	
	@Test
	public void Createanewbranchwithoutdata(){
		System.out.println("Create a new branch without data");
	}
	
	@Test
	public void Createanewbranchwithexistingbranchdata(){
		System.out.println("Create a new branch with existing branch data");
	}
	
	@Test
	public void Verifyresetandcanceloption(){
		System.out.println("Verify reset and cancel option(");
	}
	
	@Test
	public void UpdateBranchwithValidandInvalidData(){
		System.out.println("Update branch with valid and invalid data");
	}
	
	@Test
	public void UpdateBranchwithoutData(){
		System.out.println("Update branch without data");
	}
	
	@Test
	public void UpdatebranchwithexistingBranchData(){
		System.out.println("Update branch with existing branch data");
	}
	
	@Test
	public void Verifycanceloption(){
		System.out.println("Verify cancel option");
	}
	
	@Test
	public void VerifyBranchdeletionwithandwithoutdependencies(){
		System.out.println("Verify branch deletion with and without dependencies");
	}
	
	@Test
	public void VerifyBranchsearchoption(){
		System.out.println("Verify branch search option");
	}
}
