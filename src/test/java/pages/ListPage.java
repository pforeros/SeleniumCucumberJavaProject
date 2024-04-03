package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage{
   // private String searchField = "//body/form[1]/input[1]";
   // private String searchResults = "name";
    private String searchField = "//input[@type='search']";// "//body/form[1]/input[1]";
    private String searchResults = "column-2";// "name";


public ListPage(){
    super(driver);
}
public void navigateToListPage() {
   // navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
   navigateTo("https://digitalmarketingwebdesign.com/complete-list-us-cities-cities-united-states/");
  }  

public void enterSearchCriteria() throws InterruptedException {
    Thread.sleep(600);
    write(searchField, "Washington");
  }
public List<String> getAllSearchResults() {
    // Traigo WebElements de Selenium
    List<WebElement> list = bringMeAllElements(searchResults);
    // instancio una variable de tipo `List<String>`
    List<String> stringsFromList = new ArrayList<String>();
    // Debo convertirlos cada uno a `String` en el for
    for (WebElement e : list) {
      stringsFromList.add(e.getText());
    }
    // Devuelvo la lista de `String`
    return stringsFromList;
  }
}
