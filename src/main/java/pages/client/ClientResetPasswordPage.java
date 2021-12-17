package pages.client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ClientResetPasswordPage extends BasePage {

    public ClientResetPasswordPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonCancel = By.className("mr-2 btn btn-outline-dark");

    public ClientResetPasswordPage clickCancel(){
        driver.findElement(buttonCancel).click();
        return this;
    }
}
