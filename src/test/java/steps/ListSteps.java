package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

public class ListSteps {
    ListPage list = new ListPage();
    
@Given("^I navigate to the list page$")
  public void navigateToListPage() {
    // Navegamos al sitio
    list.navigateToListPage();
  }

@When("^I search (.+) in the list$")
  public void searchTheList(String state) throws InterruptedException {
    // Escribe el dato a buscar o el criterio
    list.enterSearchCriteria(state);
  } 

@Then("^I can find (.+) in the list$")
  public void theTableIsThere(String city) {
    // Se obtiene toda la lista
    List<String> lista = list.getAllSearchResults();
    // boolean textIsThere = lista.contains("Seattle, Washington");
    boolean textIsThere = lista.contains(city);
    // Si cumple con hallar alguno de los criterios es OK, sino es error
    if (textIsThere) {
      System.out.println("The text is on the list: PASSED.");
    } else {
      throw new Error("The text is not on the list: FAILED!");
    }
  }
}
