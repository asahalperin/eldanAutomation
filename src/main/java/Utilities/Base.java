package Utilities;

import PageObjects.CarRental.HomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Base {
    protected static WebDriver driver;
    protected static ExtentReports extent;
    static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest test;
    public static String name;
    static String timeStamp = new SimpleDateFormat("yyyy-MM-dd/HH-mm-ss").format(Calendar.getInstance().getTime());

    // Initialize Web pages with elements
    public static HomePage homePage;
}
