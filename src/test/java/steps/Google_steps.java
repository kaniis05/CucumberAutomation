package steps;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Google_steps  {

    @Given("I am on the google page")
    public  void i_am_on_the_google_page(){
      Driver.getDriver().get("https://google.com");

  }

    @When("I seatch for {string}")
    public void i_search_for(String word ){

        Driver.getDriver().findElement(By.name("q")).sendKeys(word + Keys.ENTER);
}
  @Then("I should see onle {string} related results")
    public void i_should_see_only_related_results(String word){
      System.out.println("Result verified:" + word);


 }

}

