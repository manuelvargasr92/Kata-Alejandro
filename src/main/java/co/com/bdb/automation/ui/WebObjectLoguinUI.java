package co.com.bdb.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WebObjectLoguinUI {
    private WebObjectLoguinUI() {}

    public static final Target Usuario = Target.the("campo User")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    public static final Target Password = Target.the("campo Password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    public static final Target Login = Target.the("button login")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
    public static final Target LOGUIN_INVALID = Target.the("Invalid credentials")
            .locatedBy("//div[@class='oxd-alert-content oxd-alert-content--error']");
    public static final Target LOGUIN_Required = Target.the("Required")
            .locatedBy("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']");
    public static final Target LOGUIN_Required2 = Target.the("Required2")
            .locatedBy("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]");
}
