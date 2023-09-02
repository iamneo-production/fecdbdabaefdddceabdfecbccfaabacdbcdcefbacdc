package stepDefination;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


public class stepDef {
    WebDriver driver=null;

    @Given("^User is on registration page$")
    
    public void goToRegistration(){
        
        driver.navigate().to("https://flipkart.com");
    }

    @Given("^User navigates to Login page$")
    public void goToLoginPage(){
        driver.findElement(By.linkText("login")).click();
    }
    @Given("^User enters username and password")
    public void fillDetails(){
        driver.findElement(By.id("Username")).sendKeys("ABC@!23");
        driver.findElement(By.id("password")).sendKeys("qwerty@123");
    }
    @Then("^Login success or not")
    public void verifyLogin(){
        String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String orgTitle = driver.getTitle();
        if(expTitle.equals(orgTitle)){
            System.out.println("You have successfully logged into your account! There are multiple discount offers waiting for you!!");
        }
        else{
            System.out.println("Login failed!!");
        }
        driver.close();
    }
}
