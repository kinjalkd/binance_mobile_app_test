package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class BuyCalculatorPage {

    protected AppiumDriver driver;

    public BuyCalculatorPage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Buy with Credit card\"]")
    WebElement buyWithCreditCard;

    public void clickOnBuyWithCreditCard(){
        buyWithCreditCard.click();
    }
}
