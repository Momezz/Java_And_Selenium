package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends TestBase{
  @Given("^El usuario se encuentra en la categoria Home de imalittletester$")
  public void el_usuario_se_encuentra_en_la_categoria_Home_de_imalittletester() throws Throwable {
    Assert.assertTrue(homePage.homePageIsDisplayed());
  }

  @When("^Hace click sobre el boton The little tester comics$")
  public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
    homePage.clickOnTitleComics();
  }

  @Then("^Se debe redirigir a la pantalla Comics$")
  public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
    Assert.assertTrue("No se redirecciono correctamnete a la pagina Comics", comicsPage.isTitleComicsDisplayed());
  }
}
