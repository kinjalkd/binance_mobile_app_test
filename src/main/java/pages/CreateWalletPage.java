package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class CreateWalletPage extends BasePage {

    public CreateWalletPage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Create new wallet\"]")
    WebElement createNewWallet;

    public void clickOnCreateANewWallet(){
        createNewWallet.click();
    }




}
