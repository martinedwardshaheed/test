package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends Pagebase {

    public SearchResult(WebDriver driver) {
        super(driver);
    }


    @FindBy(partialLinkText = "1")
    WebElement PageNumber;
    public static By pageNumberReturn() {
        return By.partialLinkText("1");
    }
    public static By searchForSpecs(){
return By.cssSelector("//span[contains(text(),'A is for athletic: Turbo power, seven speeds, four')]");
    }
}
