import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000451990420\"]/div/pre/strong/span")
    private WebElement billingPage;

    public String checkBilling(){
        return billingPage.getText();
    }
}
