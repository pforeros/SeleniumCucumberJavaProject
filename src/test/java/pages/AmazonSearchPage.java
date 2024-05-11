package pages;

public class AmazonSearchPage extends BasePage {

    private String searchBox = "//input[@id='twotabsearchtextbox']"; 
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String linkText = "//span[@class='s-pagination-strip']/a[1]";
    private String linkTextUl = "//span[@class='s-pagination-strip']/ul/li[2]";
    private int ItemNumber = 3;
    private String thirdItem = String.format("//body/div[@id='a-page']/div[@id='search']/div[@class='s-desktop-width-max "
      + "s-desktop-content s-opposite-dir s-wide-grid-style sg-row']/div[@class='sg-col-20-of-24 s-matching-dir "
      + "sg-col-16-of-20 sg-col sg-col-8-of-12 sg-col-12-of-16']/div[@class='sg-col-inner']/span[@class='rush-component "
      + "s-latency-cf-section']/div[@class='s-main-slot s-result-list s-search-results sg-row']/div[%d]"
      + "/div[1]/div[1]/span[@class='a-declarative']/div[1]/div[1]/div[1]/div[1]/div[1]",
      ItemNumber + 1);
      private String addedMessageText = "//div[@id='sw-atc-details-single-container']/div[2]/div[1]/div[1]";
      private String addtoCartButton = "//input[@id='add-to-cart-button']";
      

    public AmazonSearchPage(){
        super(driver);
    }
    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com");
        }

    public void enterSearchCriteria(String criteria){
        write(searchBox, criteria);
            }    

    public void clickSearch() {
        clickElement(searchButton);
                }
    
    public void goToPage2() {
        try {
            clickElement(linkText);
          } catch (Exception e) {
            clickElement(linkTextUl);
          }
    }

    public void pick3rdItem() {
            clickElement(thirdItem);
            }

    public void addToCart(){
           clickElement(addtoCartButton);
                }   
                
    public String addedToCartMessage(){
           return textFromElement(addedMessageText);
                    }           
}
