package tests;

import org.testng.annotations.Test;
import pages.*;

public class BuyTest extends BaseTest {

    @Test(description = "User to be able to confirm the amount of currency to buy")
    public void calculatingBuyAmount() {

        //From homepage click on get started
        new HomePage().clickOnGetStarted();

        //From Create Wallet Page click on Create a new wallet
        new CreateWalletPage().clickOnCreateANewWallet();

        //Click on Skip Backup
        new BackUpPage().clickOnSkipBackup();

        //Create Passcode 125800
        new CreatePasscodePage().createPasscode();

        //Confirm Passcode
        new ConfirmPasscodePage().confirmPasscode();

        //Click on start using Trust Wallet
        new WelcomePage().clickOnStartUsingTrustWallet();

        //Click on dont allow notifications
        new TrustWalletPage().clickOnDontAllowNotifications();

        //Click on Buy
        new TrustWalletPage().clickOnBuy();

        //Click on BTC
        new BuyPage().clickOnBtcFromPopular();

        //Click on Buy with Credit Card
        new BuyCalculatorPage().clickOnBuyWithCreditCard();
    }
}