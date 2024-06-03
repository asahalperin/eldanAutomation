package Interfaces;

import org.aeonbits.owner.Config;

//Interface that get values from properties file (for flexible run)
@Config.Sources({
        "classpath:Users/${user}.properties" // mention the property file name
})
public interface SiteProperties extends Config{
    public String user();
    public String userName();
    public String password();

    public String siteUrl();
}
