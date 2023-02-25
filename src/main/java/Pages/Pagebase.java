package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {
    protected WebDriver driver;
    public Pagebase (WebDriver driver ) {
        PageFactory.initElements(driver, this);
    }
    protected static void clicbutton(WebElement button) {

        button.click();
    }
    protected static void selectElement(WebElement dropdown, int x){
        Select selectOptions = new Select(dropdown);
        selectOptions.selectByIndex(x);
    }
    protected static void selectElementString(WebElement dropdown, String y){
        Select selectOptions = new Select(dropdown);
        selectOptions.selectByValue("y");
    }

    protected static void setTextElementText(WebElement textElememnt, String value) {
        textElememnt.sendKeys(value);

    }
    protected static void clearElement(WebElement textElememnt) {
        textElememnt.clear();

    }


}
