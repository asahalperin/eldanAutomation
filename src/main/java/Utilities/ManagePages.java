package Utilities;

import PageObjects.CarRental.HomePage;
import org.openqa.selenium.support.PageFactory;

// Initialize Web pages
public class ManagePages extends Base{

    public static void initWeb () {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
}
