package Test.java.pages;

import Test.java.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

    private WebDriver driver;

    public FlightsPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Origin']")
    WebElement departureCity;//input[@placeholder='Destination']
    public String getdepartureCity() {
        return departureCity.getText();}
    @FindBy(xpath = "//input[@placeholder='Destination']")
    WebElement Destination;
    public String getDestination() {
        return Destination.getText();}

    @FindBy(xpath = "//input[@aria-labelledby='depatureDate']")
    WebElement departureDate;
    public String getdepartureDate() {
            return departureDate.getText();}

    @FindBy(xpath = "//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-61z16t']//*[name()='svg']")
    WebElement btnsearch;
    public void buttonSearch() { btnsearch.click();}

    @FindBy(xpath = "//div[contains(text(),'Flights')]")
    WebElement menuFlights;
    public void MenuFlights() { menuFlights.click();}
    @FindBy(xpath = "//*[@id=\"FLIGHT_SEARCH_RESULT_CONTENT\"]/div[5]/div[2]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div[2]")
    WebElement btnChoose;
    public void buttonChoose() { btnChoose.click();}

    @FindBy(xpath = "//h4[normalize-space()='One-way / Round-trip']")
    WebElement roundTrip;
    public void RoundTrip() { roundTrip.click();}
    @FindBy(xpath = "//h1[normalize-space()='Your Trip']")
    WebElement txtDashboard;

    public String getTxtDashboard() {
        return txtDashboard.getText();}
//    public String getTxtInvalidCredentials() {
//        return txtInvalidCredentials.getText();
//    }



   // public void buttonLogout() { btnLogout.click();}


}


