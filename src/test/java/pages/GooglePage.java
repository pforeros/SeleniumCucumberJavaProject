package pages;


public class GooglePage extends BasePage {

 private String searchButton = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";
 // private String searchButton = "//input[@id='ybar-sbq']";
 // private String searchTextField = "//input[@title='Buscar']";
 private String searchTextField = "//textarea[@id='APjFqb']";
  //private String searchTextField = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";

    public GooglePage(){
        super(driver);
      }

public void navigateToGoogle(){
    navigateTo("https://www.google.com");
  }

  public void clickGoogleSearch(){
    clickElement(searchButton);
  }

  public void enterSearchCriteria(String criteria){
    write(searchTextField, criteria);

  }
}
