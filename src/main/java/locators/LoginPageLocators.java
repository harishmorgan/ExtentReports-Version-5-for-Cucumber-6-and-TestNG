package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginPageLocators {
 
    @FindBy(id = "user-name")
    public WebElement userName;
  
    @FindBy(id = "password")
    public WebElement password;
  
    @FindBy(css = "div.login_logo")
    public WebElement titleText;
  
    @FindBy(id = "login-button")
    public WebElement login;
  
    @FindBy(css = "div.error-message-container.error")
    public  WebElement errorMessage;
     
    @FindBy(css = "img.aqQN50")
    public  WebElement FlipkartIcon;
     
    @FindBy(css = "img._97vu.img") 
    public  WebElement faceBookIcon;
      
}