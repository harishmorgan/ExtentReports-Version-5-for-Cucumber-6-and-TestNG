package stepDef;

import org.testng.Assert;
import actions.HomePageActions;
import actions.LoginPageActions;
import utils.helper.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginPageDefinitions{  
 
    LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();
         
  
    @Given("User is on sauceLabsDemo page {string}")
    public void loginTest(String url) {
         
        HelperClass.openPage(url);
  
    }
  
    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
  
        // login to application
        objLogin.login(userName, passWord);
  
        // go the next page
         
    }
  
    @Then("User should be able to login sucessfully and new page open")
    public void verifyLogin() {
  
        // Verify home page
        Assert.assertTrue(objHomePage.getHomePageText().contains("Products"));
  
    }
     
    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
  
        // Verify home page
        Assert.assertEquals(objLogin.getErrorMessage(),expectedErrorMessage);
  
    }
    
    @Given("User is on FaceBook page {string}")
    public void user_is_on_FaceBook_page(String url) {
    	
    	 HelperClass.openPage(url);
    	
    	
    }
     
    @Then("User should be able to see Flipkart Icon")
    public void verifyLinkedInIcon( ) {
         
        Assert.assertTrue(objLogin.getLinkedInIcon());
    }
     
    @Given("User is on FlipkartLogin page {string}")
    public void user_is_on_flipkart_login_page(String url) {
    
    }
    	
    @Then("User should be able to see FaceBook Icon")
    public void verifyFaceBookIcon( ) {
         
        Assert.assertTrue(objLogin.getFaceBookIcon());
    }
       
}