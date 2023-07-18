package om.softwaretestingboard.magento.testsuite;

import om.softwaretestingboard.magento.customlisteners.CustomListeners;
import om.softwaretestingboard.magento.pages.GearTestPage;
import om.softwaretestingboard.magento.pages.HomePage;
import om.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    HomePage homePage;
    GearTestPage gearTestPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        gearTestPage = new GearTestPage();
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
gearTestPage.clickOnGearMenu();
gearTestPage.clickOnBags();
gearTestPage.clickOnOvernightDuffle();
gearTestPage.sendChangeQuantity();
gearTestPage.clickOnCart();
gearTestPage.getVerifyOvernightAdded();
gearTestPage.clickOnShoppingCart();
gearTestPage.getVerifyQuantity();
gearTestPage.getverifyPrice();
gearTestPage.sendQuantityChange();
gearTestPage.clickOnUpdateCart();
gearTestPage.getVerifyTxtPrice();

    }



}
