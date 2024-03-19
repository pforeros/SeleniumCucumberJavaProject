package pages;


public class GooglePage extends BasePage {

  private String searchButton = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";


    public GooglePage(){
        super(driver);
      }

public void navigateToGoogle(){
    navigateTo("https://www.google.com");
  }

  public void clickGoogleSearch(){
    clickElement(searchButton);
  }
}
