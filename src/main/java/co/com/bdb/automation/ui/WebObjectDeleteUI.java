package co.com.bdb.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WebObjectDeleteUI {
    private WebObjectDeleteUI() {
    }


    public static final Target ELIMINAR_BUTTON = Target.the("Botón de eliminar del usuario")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]"));

    public static final Target POPUP = Target.the("Se abre PoPup")
            .located(By.xpath("(//div[@role='document'])[1]"));

    public static final Target CONFIRM_DELETE_BUTTON = Target.the("Botón de confirmar eliminación")
            .located(By.xpath("(//button[normalize-space()='Yes, Delete'])[1]")); // Reemplaza con el locator correcto


}
