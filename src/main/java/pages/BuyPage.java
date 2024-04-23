package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class BuyPage {

    protected AppiumDriver driver;

    public BuyPage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Bitcoin\"]")
    WebElement btcPopular;

    public void clickOnBtcFromPopular(){
        btcPopular.click();

    }
}
