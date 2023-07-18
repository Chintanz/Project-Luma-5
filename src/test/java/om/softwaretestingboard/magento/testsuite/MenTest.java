package om.softwaretestingboard.magento.testsuite;

import om.softwaretestingboard.magento.pages.HomePage;
import om.softwaretestingboard.magento.pages.MenTestPage;
import om.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage;
    MenTestPage menPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        menPage = new MenTestPage();
    }
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException{
        menPage.clickOnMenMenu();
        menPage.clickOnBottoms();
        menPage.clickOnPants();
        menPage.clickOnCronusYoga();
        menPage.clickOnSize32();
        menPage.clickOnBlackColour();
        menPage.clickOnAddToCart();
        menPage.getVerifyCronusMessage();
        String exCronus = "You added Cronus Yoga Pant to your shopping cart";
        String acCronus = menPage.getVerifyCronusMessage();
        Assert.assertEquals(acCronus,exCronus,"You added Cronus Yoga Pant to your shopping cart");
        menPage.clickOnShoppingCart();
        menPage.getVerifyShoppingCart();
        String exShoppingCart = "Shopping Cart";
        String acShoppingCart = menPage.getVerifyShoppingCart();
        Assert.assertEquals(acShoppingCart,exShoppingCart,"Shopping Cart");
        menPage.getVerifyCronusName();
        String exCronusYogaPant = "Cronus Yoga Pant";
        String acCronusYogaPant = menPage.getVerifyCronusName();
        Assert.assertEquals(acCronusYogaPant,exCronusYogaPant,"CronusYogaPant");


        menPage.getVerifySize();
        String exSize32   = "32";
        String acSize32   = menPage.getVerifySize();
        Assert.assertEquals(acSize32,exSize32,"32");


        menPage.getVerifyColourBlack();
        String exColourBlack   = "Black";
        String acClourBlack   = menPage.getVerifyColourBlack();
        Assert.assertEquals(acClourBlack,exColourBlack,"Black");

    }























}
