package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class TrustWalletPage extends BasePage {

    public TrustWalletPage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
    WebElement dontAllowButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Buy\"]")
    WebElement buyButton;

    public void clickOnDontAllowNotifications(){
        dontAllowButton.click();
    }

    public void clickOnBuy(){
        buyButton.click();
    }




}
