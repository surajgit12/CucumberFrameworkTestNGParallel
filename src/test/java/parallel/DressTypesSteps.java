package parallel;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.AccountsPage;
import com.pages.DressTypesPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DressTypesSteps {

	private DressTypesPage dressTypesPage = new DressTypesPage(DriverFactory.getDriver());

	@Given("Dresses option is available")
	public void dresses_option_is_available() {

		dressTypesPage.dressesMenuOptionIsAvailable();

	}

	@When("User  just move the mouseohver on the dressesOption link")
	public void user_just_move_the_mouseohver_on_the_dresses_option_link() throws InterruptedException {

		dressTypesPage.dressesTypesOptionLinksOptions();
	}

	@Then("Mulitple dresses options should be available")
	public void mulitple_dresses_options_should_be_available() throws InterruptedException {

         dressTypesPage.multipleDressesOptionIsVisible();;

	}

	@Then("click on on casual dresses option link")
	public void click_on_on_casual_dresses_option_link() throws InterruptedException {
		dressTypesPage.clickOnCasualDressesOptionLink();
	}

	@Then("page title should be\"Casual Dresses - My Shop\"")
	public void page_title_should_be_casual_dresses_my_shop() {
		dressTypesPage.getTheTitlePageOfCasualDresses();
	}

}
