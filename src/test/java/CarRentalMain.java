import PageObjects.CarRental.HomePage;
import Utilities.CommonOps;
import org.testng.annotations.Test;

public class CarRentalMain extends CommonOps {

    @Test(testName = "Eldan car rental status - Hebrew")
    public static void EldanCarRentalStatusHebrew() {
        driver.get("https://rent.eldan.co.il/he");
        HomePage.goToHomPage();
    }

    @Test(testName = "Eldan car rental status - French")
    public static void EldanCarRentalStatusFrench() {
        driver.get("https://rent.eldan.co.il/fr");
        HomePage.goToHomPage();
    }

    @Test(testName = "Eldan car rental status - English")
    public static void EldanCarRentalStatusEnglish() {
        driver.get("https://rent.eldan.co.il/en");
        HomePage.goToHomPage();
    }
}
