Feature: Login to sauceLabsDemo page Application

  @ValidCredentials
  Scenario: Login with valid credentials
    Given User is on sauceLabsDemo page "https://www.saucedemo.com/"
    When User enters username as "standard_user" and password as "secret_sauce"
    Then User should be able to login sucessfully and new page open

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
   	Given User is on sauceLabsDemo page "https://www.saucedemo.com/"
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to see error message "<errorMessage>"

    Examples: 
      | username | password  | errorMessage                                                              |
      | Admin    | admin12$$ | Epic sadface: Username and password do not match any user in this service |
      | admin$$  | admin123  | Epic sadface: Username and password do not match any user in this service |
      | abc123   | xyz$$     | Epic sadface: Username and password do not match any user in this service |
      
  @FaceBookLink
  Scenario: Verify FaceBook Icon on Login Page
    Given User is on FaceBook page "https://www.facebook.com/login/"
    Then User should be able to see FaceBook Icon

  @FlipkartLink
  Scenario: Verify FlipkartLink Icon on Login Page
    Given User is on FlipkartLogin page "https://www.flipkart.com/"
    Then User should be able to see Flipkart Icon
