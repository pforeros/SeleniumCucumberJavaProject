package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static
    {
    ChromeOptions chromeOptions = new ChromeOptions();
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  // Definición del Constructor
  public BasePage(WebDriver driver){
    BasePage.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  public static void navigateTo(String url){
    driver.get(url);
  }

  private WebElement Find(String locator){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
  }
  
  public void clickElement(String locator){
    Find(locator).click();
  }

  public void write (String locator,String textToWrite){
    Find(locator).clear();
    Find(locator).sendKeys(textToWrite);

  }
  public void selectFromDropdownByValue (String locator, String ValueToSelect){
    Select dropdown = new Select (Find(locator));
    dropdown.selectByValue(ValueToSelect);
  }

    public void selectFromDropdownByIndex(String locator, int ValueToSelect){
      Select dropdown = new Select (Find(locator));
      dropdown.selectByIndex(ValueToSelect); 

  }
  public void selectFromDropdownByText(String locator, String ValueToSelect){
    Select dropdown = new Select (Find(locator));
    dropdown.selectByVisibleText(ValueToSelect); 

  }

  public void hoverOverElement(String locator) {
        action.moveToElement(Find(locator));
  }

  public void doubleClickElement(String locator){
        action.doubleClick(Find(locator));
  }

  public void rightClickElement(String locator){
        action.contextClick(Find(locator));
  }

  public String getValueFromTable(String locator, int row, int column) {
    // Encadenamos junto con el `locator` lo requerido para el dato en cuestión
    String cellINeed = locator + "/table/tbody/tr[" + row + "]/td [" + column + "]";
    // Devolvemos el texto interno
    return Find(cellINeed).getText();
  }

  public void setValueOnTable(String locator, int row, int column, String stringToSend){
    // Encadenamos junto con el `locator` lo requerido para el dato en cuestión
    String cellToFill = locator + "/table/tbody/tr[" + row + "]/td [" + column + "]";
    // Llenamos la celda
    Find(cellToFill).sendKeys(stringToSend);
 }
}


    
    

