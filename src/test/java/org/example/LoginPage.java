package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    //найти поле с вводом логина и назвать его loginField
    @FindBy(xpath = "//*[contains(@id, 'input-18')]")
    private WebElement loginField;

    //найти поле с вводом пароля и назвать его passwdField
    @FindBy(xpath = "//*[contains(@id, 'input-22')]")
    private WebElement passwdField;

    //найти кнопку Войти и назвать его loginBtn
    @FindBy(xpath = "//*[contains(text(), 'Войти')]")
    private WebElement loginBtn;

    //метод ввода логина
    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    //метод ввода пароля
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    //метод нажатия кнопки
    public void clickLoginBtn() {
        loginBtn.click(); }
}
