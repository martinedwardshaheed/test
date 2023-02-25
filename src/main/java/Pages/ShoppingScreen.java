package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingScreen extends Pagebase{
    public ShoppingScreen(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement cart;
    @FindBy(css = "#termsofservice")
    WebElement termsOfService;
    @FindBy(css ="#checkout")
    WebElement checkOut;

    public void checkOut() throws InterruptedException {
        clicbutton(cart);
        Thread.sleep(3000);
        clicbutton(termsOfService);
        Thread.sleep(3000);
        clicbutton(checkOut);
    }


}
