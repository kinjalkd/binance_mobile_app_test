package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class WelcomePage extends BasePage {

    public WelcomePage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button")
    WebElement startUsingTrustWallet;

    public void clickOnStartUsingTrustWallet(){
        startUsingTrustWallet.click();
    }




}
