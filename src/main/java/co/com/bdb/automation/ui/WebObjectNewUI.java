package co.com.bdb.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WebObjectNewUI {
    private WebObjectNewUI() {}
    public static final Target ADMIN_MENU = Target.the("admin")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));

    public static final Target ADD_USER_BUTTON = Target.the("campo add")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i"));
    public static final Target USER_ROLE_DROPDOWN = Target.the("User Role dropdown")
            .located(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
    public static final Target OPTION_ADMIN = Target.the("Select Admin")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]"));
    public static final Target EMPLOYEE_NAME_FIELD = Target.the("User EMPLOYEE_NAME_FIELD")
            .located(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
   public static final Target SELECT = Target.the("Botón Selecionar")
           .located(By.cssSelector("div.oxd-autocomplete-dropdown.--positon-bottom"));
    public static final Target USERNAME_FIELD = Target.the(" User Name")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
    public static final Target STATUS_DROPDOWN = Target.the("Dropdown de Status")
            .located(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
    public static final Target OPTION_ENABLED = Target.the("Option Enabled en Status")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]"));
    public static final Target PASSWORD_FIELD = Target.the("Campo Password usuario")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Campo Confirm Password")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));

    public static final Target SAVE_BUTTON = Target.the("Botón Guardar en edición")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target ASSERT_USUARIO_CREADO = Target.the("Usuario creado")
            .located(By.xpath("//div[contains(text(),'1ALEJANDRO1234')]"));

    }
