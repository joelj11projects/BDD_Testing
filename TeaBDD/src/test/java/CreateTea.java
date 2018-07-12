import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateTea {


    public WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        driver.quit();
    }

        @Given("^the correct web address$")
        public void the_correct_web_address() {
            driver.get(Constant.theWebsite);
        }

        @When("^I navigate to the 'Menu' page$")
        public void i_navigate_to_the_Menu_page() {
        Homepage homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.menubtn();
        }

        @Then("^I can browse a list of the available products\\.$")
        public void i_can_browse_a_list_of_the_available_products(){
        MenuPage menupage = PageFactory.initElements(driver, MenuPage.class);
        Assert.assertEquals("Green Tea",menupage.checkWord());

        }

        @When("^I click the checkout button$")
        public void i_click_the_checkout_button(){
        MenuPage menupage = PageFactory.initElements(driver, MenuPage.class);
        menupage.checkoutbtn();
        }

        @Then("^I am taken to the checkout page$")
        public void i_am_taken_to_the_checkout_page() {
        CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        Assert.assertEquals("Enter your billing information",checkoutPage.checkBilling());
        }



}
