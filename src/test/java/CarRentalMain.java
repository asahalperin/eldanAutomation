import PageObjects.CarRental.HomePage;
import Utilities.CommonOps;
import org.testng.annotations.Test;

public class CarRentalMain extends CommonOps {

    @Test(testName = "Eldan car rental status")
    public static void EldanCarRentalStatus() {
        HomePage.goToHomPage();
    }
}
