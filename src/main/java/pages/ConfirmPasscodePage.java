package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class ConfirmPasscodePage extends BasePage {

    public ConfirmPasscodePage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='1']")
    WebElement one;

    @FindBy(xpath = "//android.widget.TextView[@text='2']")
    WebElement two;

    @FindBy(xpath = "//android.widget.TextView[@text='5']")
    WebElement five;

    @FindBy(xpath = "//android.widget.TextView[@text='8']")
    WebElement eight;

    @FindBy(xpath = "//android.widget.TextView[@text='0']")
    WebElement zero;

    public void confirmPasscode(){
        one.click();
        two.click();
        five.click();
        eight.click();
        zero.click();
        zero.click();
    }




}
