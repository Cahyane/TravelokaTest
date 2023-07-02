package Test.java;

import Test.java.pages.FlightsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//import static Test.java.Hooks.extentTest;

public class TestFlightsPage {
    public static WebDriver driver;
    public static FlightsPage loginPage = new FlightsPage();

    public TestFlightsPage(){

        driver = Hooks.driver;

    }
    @Given("User open browser and url")
    public void user_open_browser_url(){
        driver.get("https://www.traveloka.com/en-id");
        System.out.println("User open browser and url");
    }
    @When("User click flight")
    public void User_click_flight() {
        loginPage.MenuFlights();
        System.out.println("User click flight");
    }

    @And("User click one way around")
    public void User_click_one_way_around() {
        loginPage.RoundTrip();
        System.out.println("User click one way around");
    }

    @And("User select departure")
    public void User_select_departure() {
        loginPage.getdepartureCity();
        System.out.println("User select departure");
    }
    @And("User select destination")
    public void User_select_destination() {
        loginPage.getDestination();
        System.out.println("User select destination");
    }
    @And("User fill in departure date")
    public void User_fill_in_departure_date() {
        loginPage.getdepartureDate();
        System.out.println("User fill in departure date");
    }

    @And("User click button search flight")
    public void User_click_button_search_flight() {
        loginPage.buttonSearch();
        System.out.println("User click button search flight");
    }


    @Then("User chooses a flight and click choose button")
    public void User_chooses_a_flight_and_click_choose_button (){
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtDashboard(),"YourTrip");
    }



}


