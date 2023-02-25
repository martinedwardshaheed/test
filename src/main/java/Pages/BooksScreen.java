package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksScreen extends Pagebase{
    public BooksScreen(WebDriver driver) {
        super(driver);
    }
    @FindBy(partialLinkText = "Books")
    WebElement books;
    @FindBy(css = "#products-orderby")
    WebElement sortResults;
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement list;
    @FindBy(css = "div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.category-page div.page-body div.products-container div.products-wrapper div.product-list div.item-grid div.item-box:nth-child(1) div.product-item div.picture a:nth-child(1) > img:nth-child(1)")
    WebElement secondOptionInTheList;
    @FindBy(id = "add-to-cart-button-37")
    WebElement addToCart;

    public void clickOnBooks(){
        clicbutton(books);
    }
    public void chooseSortResult(int value) throws InterruptedException {
        Thread.sleep(1000);
        selectElement(sortResults,value);
        Thread.sleep(3000);
    }
    public void clickOnList() throws InterruptedException {
        clicbutton(list);
        Thread.sleep(2000);
    }
    public void chooseSecondOptionInTheList() throws InterruptedException {
        Thread.sleep(2000);
        clicbutton(secondOptionInTheList);
        Thread.sleep(2000);

    }
    public void addToCartBTN(){
        clicbutton(addToCart);
    }
}
