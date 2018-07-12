import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {

    @FindBy(xpath = Constant.checkoutLink)
    private WebElement clickLink;

    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
    private WebElement greenTea;

    public void checkoutbtn(){
        clickLink.click();
    }

    public String checkWord(){
        return greenTea.getText();
    }
}
