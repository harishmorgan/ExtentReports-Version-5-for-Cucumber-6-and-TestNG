package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class HomePageLocators {
 
    @FindBy(xpath = "//span[@class='title']")
    public  WebElement homePageUserName;
}