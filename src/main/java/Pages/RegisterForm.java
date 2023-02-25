package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class RegisterForm extends Pagebase {
    public RegisterForm(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "gender-male")
    WebElement gender;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement register;
    @FindBy(id = "FirstName")
    WebElement firstName;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
    WebElement dateOption;
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearOption;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
    WebElement monthOption;
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement button;
    public void clickOnRegister() {
        clicbutton(register);
    }
    public void addFirstName(){
        setTextElementText(firstName,"Martin");
    }
    public void addLastName(){
        setTextElementText(lastName,"Edward");
    }
    public void selectGender() {
        clicbutton(gender);
    }
    public void selectDate(){
       selectElement(dateOption,23);
   }
   public void selectMonth(){
        selectElement(monthOption,8);
   }
   public void selectYear(){
        selectElement(yearOption, 1914);
   }
   public void emailSet(String mail){
        setTextElementText(email,mail);
   }
   public void passwordSet(String passwordtest){
        setTextElementText(password,passwordtest);
   }
    public void confirmPasswordSet(String confirmpasswordtest){
        setTextElementText(confirmPassword,confirmpasswordtest);
    }
    public void registerBtn() {
        clicbutton(button);
    }
}
