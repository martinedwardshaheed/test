package testPackage;

import Pages.BooksScreen;
import Pages.LoginScreen;
import Pages.RegisterForm;
import Pages.ShoppingScreen;
import org.testng.annotations.Test;

public class AutoTest extends TestClass {
    RegisterForm registerForm;
    LoginScreen loginScreen;
    BooksScreen booksScreen;
    ShoppingScreen shoppingScreen;
    @Test
    public void Register() {
        registerForm = new RegisterForm(driver);
        registerForm.clickOnRegister();
        registerForm.selectGender();
        registerForm.addFirstName();
        registerForm.addLastName();
        registerForm.selectDate();
        registerForm.selectMonth();
        registerForm.emailSet("martinnnn.edward@gmail.com");
        registerForm.passwordSet("1234567");
        registerForm.confirmPasswordSet("1234567");
        registerForm.registerBtn();
    }
    @Test (priority = 2)
    public void Login(){
        loginScreen = new LoginScreen(driver);
        loginScreen.clickOnContinueBtn();
        loginScreen.loginBtnClk();
        loginScreen.typeEmail("martinnnn.edward@gmail.com");
        loginScreen.typePassword("1234567");
        loginScreen.loginToWebsite();

    }
    @Test (priority = 3)
    public void CreateOrder() throws InterruptedException {
        booksScreen = new BooksScreen(driver);
        booksScreen.clickOnBooks();
//        booksScreen.chooseSortResult(10);
        booksScreen.clickOnList();
        booksScreen.chooseSecondOptionInTheList();
        booksScreen.addToCartBTN();
    }
    @Test (priority = 4)
    public void Checkout() throws InterruptedException {
        shoppingScreen = new ShoppingScreen(driver);
        shoppingScreen.checkOut();
    }
}


