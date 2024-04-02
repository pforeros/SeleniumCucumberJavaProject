package steps;

import org.junit.Assert;

//import cucumber.api.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GridPage;

public class GridTestSteps {

  GridPage grid = new GridPage();

  @Given("^I navigate to the static table Then I can return the value I wanted$")
  public void navigateToGridPage() {
    grid.navigateToGrid();
  }

  @Then("^I can return the value I wanted$")
  public void returnValue() {
    String value = grid.getValueFromGrid(3, 2);
    Assert.assertEquals("r: 2, c: 1", value);
  }
}
