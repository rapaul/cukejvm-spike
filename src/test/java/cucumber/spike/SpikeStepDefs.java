package cucumber.spike;

import cucumber.annotation.en.*;

public class SpikeStepDefs {
	
	@Given("^a user has not signed up$")
	public void aUserHasNotSignedUp() {
		System.out.println("A user has not signed up");
	}

	@When("^user attempts to access a premium feature$")
	public void userAttemptToAccessAPremiumFeature() {
		System.out.println("User attempts to access premium features");
	}
	
	@Then("^they are prompted to register with simply their email and password$")
	public void theyArePromptedToRegisterWithSimplyTheirEmailAndPassword() {
		System.out.println("they are prompted to register with simply their email and password");
	}

}
