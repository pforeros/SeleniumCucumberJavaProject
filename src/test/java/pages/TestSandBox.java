package pages;


public class TestSandBox extends BasePage {
    private String categoryDropdown = "//select[@id='testingDropdown']";
    private String dropdown = "//select[@id='testingDropdown']";

    public TestSandBox(){
        super(driver);
    }
    public void navigateToTheSandbox(){
        navigateTo("https://artoftesting.com/samplesiteforselenium");
    }
    //public void selectCategory(String category){
      //  selectFromDropdownByValue(categoryDropdown,category);
    //}
    public void selectCategory(String text){
        selectFromDropdownByText(dropdown,text);
    }
}