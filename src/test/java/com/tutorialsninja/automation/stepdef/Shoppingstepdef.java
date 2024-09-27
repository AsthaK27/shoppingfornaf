package com.tutorialsninja.automation.stepdef;

import io.cucumber.java.en.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class Shoppingstepdef {

	    WebDriver driver;

	    @Given("Nafisa has registered and logged into the shopping site")
	    public void nafisa_has_registered_and_logged_into_the_shopping_site()
	    {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	      
	        
	        // Navigate to login/registration page
	        driver.get("https://automationexercise.com/login");

	        // Maximize browser window
	        driver.manage().window().maximize();
	        /*

	        // Fill out the registration form
	        WebElement signupName = driver.findElement(By.xpath("//input[@name='name']"));
	        WebElement signupEmail = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
	        WebElement signupButton = driver.findElement(By.xpath("//button[text()='Signup']"));

	        // Enter user details for registration
	        signupName.sendKeys("Astha Test");
	        signupEmail.sendKeys("astha4@example.com"); // Unique email
	        signupButton.click();

	        // Fill out additional information after clicking Signup button
	        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	        WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
	        WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
	        WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
	        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
	        WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
	        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
	        WebElement zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
	        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobile_number']"));
	        
	        // Fill the form with user information
	        password.sendKeys("Test@12345");
	        firstName.sendKeys("Test");
	        lastName.sendKeys("User");
	        address.sendKeys("123 Street, Some City");
	        country.sendKeys("India");
	        state.sendKeys("TestState");
	        city.sendKeys("TestCity");
	        zipcode.sendKeys("123456");
	        mobileNumber.sendKeys("8173976548");

	        // Click on Create Account button
	        WebElement createAccountButton = driver.findElement(By.xpath("//button[text()='Create Account']"));
	        createAccountButton.click();

	        // Verify account creation success message
	        WebElement successMessage = driver.findElement(By.xpath("//b[text()='Account Created!']"));
	        if (successMessage.isDisplayed()) {
	            System.out.println("User registration successful!");
	        } else {
	            System.out.println("User registration failed.");
	        }
	        //click on continue button 
	        WebElement continuebutton1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
	        continuebutton1.click();
	        		
	        // Log out after registration
	        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
	        logoutButton.click();
	        System.out.println("Logged out after registration.");
*/
	        // Part 2: Login with the same credentials
	        System.out.println("Starting login process...");

	        // Fill out the login form
	        WebElement loginEmail = driver.findElement(By.xpath("//input[@name='email']"));
	        WebElement loginPassword = driver.findElement(By.xpath("//input[@name='password']"));
	        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));

	        loginEmail.sendKeys("astha3@example.com");
	        loginPassword.sendKeys("Test@12345");
	        loginButton.click();

	    
	    }

	    @When("Nafisa adds items to the cart for her brother, his wife, and their nieces")
	    public void nafisa_adds_items_to_the_cart_for_her_brother_his_wife_and_their_nieces() throws InterruptedException {
	    	
	        // Add first item (for brother)
	        driver.get("https://automationexercise.com/products");
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)");
	        
	        Thread.sleep(2000);
	        
	        WebElement firstProduct = driver.findElement(By.xpath("//a[text()='Add to cart'][1]"));
	        firstProduct.click();
	        
	        Thread.sleep(3000);
	        WebElement continuebutton = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));

	        if (continuebutton.isDisplayed()) {

	        // Close the modal dialog

	       driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

	        }

	        
	    
	        
	        // Add second item (for wife)
	        WebDriverWait wait = new WebDriverWait(driver,10);

	        WebElement view2product = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/ul/li/a"));
	        view2product.click();
	        Thread.sleep(3000);
	        WebElement secondproduct = driver.findElement(By.xpath("//button[contains(@class, 'btn-default') and contains(@class, 'cart')]"));
	        secondproduct.click();
	        //click on continue button
	        Thread.sleep(3000);
	        WebElement continuebutton1 = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));

	        if (continuebutton1.isDisplayed()) {

	        // Close the modal dialog

	       driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

	        }

	        Thread.sleep(5000);
	        driver.navigate().back();

	        // Add third item (for nieces)
	        

	        WebElement view3product = driver.findElement(By.xpath("//a[@href='/product_details/7']"));
	        view3product.click();
	        Thread.sleep(3000);
	        WebElement thirdproduct = driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(@class, 'cart')]"));
	        thirdproduct.click();
	        //click on continue button
	        Thread.sleep(3000);
	        WebElement continuebutton2 = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));

	        if (continuebutton2.isDisplayed()) {

	        // Close the modal dialog

	       driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

	        }

	        Thread.sleep(3000);
	        driver.navigate().back();
	        
	        //add 4 th product
	        
	        WebElement view4product = driver.findElement(By.xpath("//a[@href='/product_details/4']"));
	        view4product.click();
	        Thread.sleep(3000);
	        WebElement fourthproduct = driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(@class, 'cart')]"));
	        fourthproduct.click();
	        //click on continue button
	        Thread.sleep(3000);
	        WebElement continuebutton3 = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));

	        if (continuebutton3.isDisplayed()) {

	        // Close the modal dialog

	       driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

	        }

	        Thread.sleep(3000);
	        driver.navigate().back();
	        
       //add 4 th product 2nd time
	        
	        WebElement view4product2 = driver.findElement(By.xpath("//a[@href='/product_details/4']"));
	        view4product2.click();
	        Thread.sleep(3000);
	        WebElement fourthproduct2 = driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(@class, 'cart')]"));
	        fourthproduct2.click();
	        //click on continue button
	        Thread.sleep(3000);
	        WebElement continuebutton4 = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));

	        if (continuebutton4.isDisplayed()) {

	        // Close the modal dialog

	       driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

	        }

	        Thread.sleep(3000);
	        driver.navigate().back();
	        
	        //add 4th product 3 rd time

	        
	        WebElement view4product3 = driver.findElement(By.xpath("//a[@href='/product_details/4']"));
	        view4product3.click();
	        Thread.sleep(3000);
	        WebElement fourthproduct3 = driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(@class, 'cart')]"));
	        fourthproduct3.click();
	        //click on continue button
	        Thread.sleep(3000);
	        WebElement continuebutton5 = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));

	        if (continuebutton5.isDisplayed()) {

	        // Close the modal dialog

	       driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

	        }

	        Thread.sleep(3000);
	        driver.navigate().back();
	        
//add 4th product 4th  time

	        
	        WebElement view4product4 = driver.findElement(By.xpath("//a[@href='/product_details/4']"));
	        view4product4.click();
	        Thread.sleep(3000);
	        WebElement fourthproduct4 = driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(@class, 'cart')]"));
	        fourthproduct4.click();
	        //click on continue button
	        Thread.sleep(3000);
	        WebElement continuebutton6 = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));

	        if (continuebutton6.isDisplayed()) {

	        // Close the modal dialog

	       driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

	        }

	        Thread.sleep(3000);
	        driver.navigate().back();
	        
	        
	        

	    }

	    @When("Nafisa proceeds to checkout")
	    public void nafisa_proceeds_to_checkout() {
	        // Proceed to checkout
	        WebElement cartButton = driver.findElement(By.xpath("//a[@href='/view_cart']"));
	        cartButton.click();
	        WebElement checkoutButton = driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
	        checkoutButton.click();
	    }

	    @Then("the total amount should be between Rs {int} and Rs {int}")
	    public void the_total_amount_should_be_between_rs_and_rs(Integer int1, Integer int2) {
	        // Fetch total amount
	        WebElement totalAmountElement = driver.findElement(By.xpath("//span[@id='total_price']"));
	        String totalAmountText = totalAmountElement.getText();
	        int totalAmount = Integer.parseInt(totalAmountText.replaceAll("[^0-9]", ""));
	        Assert.assertTrue(totalAmount >= 8000 && totalAmount <= 10000);
	    }

	    @Then("Nafisa should be able to download the invoice")
	    public void nafisa_should_be_able_to_download_the_invoice() {
	        // Simulate invoice download step (clicking on invoice download button)
	        WebElement downloadInvoiceButton = driver.findElement(By.xpath("//a[text()='Download Invoice']"));
	        downloadInvoiceButton.click();

	        // Assuming we handle file downloads and verify
	        // Here you would verify the download with further logic
	    }
	}



