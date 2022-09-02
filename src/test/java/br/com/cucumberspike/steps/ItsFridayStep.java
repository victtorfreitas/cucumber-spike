package br.com.cucumberspike.steps;


import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.cucumberspike.IsItFriday;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ItsFridayStep {

  private String today;
  private String actualAnswer;

  @Given("today is {string}")
  public void today_is(String today) {
    this.today = today;
  }

  @When("I ask whether it's Friday yet")
  public void i_ask_whether_it_s_friday_yet() {
    actualAnswer = IsItFriday.isIt(today);

  }

  @Then("I should be told {string}")
  public void i_should_be_told(String expectedAnswer) {
    assertEquals(expectedAnswer, actualAnswer);
  }

  @Given("today is Friday")
  public void todayIsFriday() {
    today = "Friday";
  }

}
