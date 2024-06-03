package PageObjects.CarRental;

import Extensions.Click.Verify;
import Utilities.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

    @FindBy(className = "main-banner-area")
    private static WebElement pickupLocationField;

    public static void goToHomPage() {
        Verify.elementExists(pickupLocationField, "Pickup location field", 10);
    }

}
