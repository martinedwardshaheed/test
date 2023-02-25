package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginScreen extends Pagebase{
    public LoginScreen(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")
    WebElement continueBtn;
    @FindBy(linkText ="Log in")
    WebElement loginBtn;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement setEmail;
    @FindBy(id = "Password")
    WebElement passwordForLogin;
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/button[1]")
    WebElement loginBtnLast;

    public void clickOnContinueBtn(){
        clicbutton(continueBtn);
    }
    public void loginBtnClk(){
        clicbutton(loginBtn);
    }
    public void typeEmail(String mail){
        setTextElementText(setEmail,mail);
    }
    public void typePassword(String pass){
        setTextElementText(passwordForLogin,pass);
    }
    public void loginToWebsite(){
        clicbutton(loginBtnLast);
    }

}
