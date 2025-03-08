package co.com.bdb.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WebObjectEditUserUI {
    private WebObjectEditUserUI() {
    }

    public static final Target SEARCH_USER_FIELD = Target.the("Campo de búsqueda en Admin")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
    public static final Target SEARCH_BUTTON = Target.the("Botón Buscar")
            .located(By.xpath("//button[@type='submit']"));
    public static final Target EDIT_BUTTON = Target.the("Botón de edición del usuario")
            .located(By.xpath("(//button[@type='button'])[8]"));
    public static final Target USER_ROLE_DROPDOWN2 = Target.the("User Role dropdown")
            .located(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
    public static final Target OPTION_CSS = Target.the("Selecct CSS")
            .located(By.xpath("//div[@role='option' and span[text()='ESS']]"));
    public static final Target USERNAME_FIELD2 = Target.the(" User Name")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
    public static final Target STATUS_DROPDOWN2 = Target.the("Dropdown de Status")
            .located(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
    public static final Target OPTION_DISABLED = Target.the("Option Disabled en Status")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]"));
    public static final Target PASSWORD_FIELD2 = Target.the("Campo Password usuario")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
    public static final Target CONFIRM_PASSWORD_FIELD2 = Target.the("Campo Confirm Password")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));

    public static final Target CHANGE_PASSWORD_CHECKBOX = Target.the("Checkbox para cambiar contraseña")
            .located(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]"));
    public static final Target SAVE_BUTTON_MODIFY = Target.the("Botón Guardar en edición")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
    public static final Target ASSERT_USUARIO = Target.the("Usuario creado")
            .located(By.xpath("//div[contains(text(),'098ALEJANDRO12345')]"));
    // CORRECCIÓN: Adaptar este XPath a la estructura HTML de tu página.
    public static final Target USER_LIST_ITEMS = Target.the("Lista de nombres de usuario")
            .located(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']//div[@class='oxd-table-cell oxd-table-cell-2']"));

}