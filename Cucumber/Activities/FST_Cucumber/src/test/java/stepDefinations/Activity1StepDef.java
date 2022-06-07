package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity1StepDef {
	@Given("^ Statement set in Feature file for Given $")
	public void givenFunctionName() {}

	@When("^ Statement set in Feature file for When $")
	public void whenFunctionName() {}

	@Then("^ Statement set in Feature file for Then $")
	public void thenFunctionName() {}
}
