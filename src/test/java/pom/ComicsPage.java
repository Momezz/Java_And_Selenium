package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicsPage extends BasePage{
    private By pageTitleLocator = By.xpath("//*[@id=\"comp-lc61aui31\"]/h2/span/span/span");
    private String titlePage = "HE LITTLE TESTER COMICS SERIES";

    public ComicsPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }
}
