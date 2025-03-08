package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.bdb.automation.ui.WebObjectEditUserUI.*;
import static co.com.bdb.automation.ui.WebObjectNewUI.SAVE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class User implements Task {


    private final String Usuario1;
    private final String clavenueva;
    private final String confirmarClave;

    public User( String usuario, String claveNueva, String confirmarClave) {

        this.Usuario1 = usuario;
        this.clavenueva = claveNueva;
        this.confirmarClave = confirmarClave;
    }
    public static User withDataNew(String usuario, String claveNueva, String confirmarClave) {
        return instrumented(User.class, usuario, claveNueva, confirmarClave);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USER_ROLE_DROPDOWN2, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(USER_ROLE_DROPDOWN2),
                Click.on(OPTION_CSS),

                WaitUntil.the(USERNAME_FIELD2, isVisible()).forNoMoreThan(3).seconds(),
                Enter.theValue(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE)).into(USERNAME_FIELD2),
                Enter.theValue(Usuario1).into(USERNAME_FIELD2),
                Click.on(STATUS_DROPDOWN2),
                Click.on(OPTION_DISABLED),
                Click.on(CHANGE_PASSWORD_CHECKBOX),
                Enter.theValue(clavenueva).into(PASSWORD_FIELD2),
                Enter.theValue(confirmarClave).into(CONFIRM_PASSWORD_FIELD2),

                Click.on(SAVE_BUTTON),
                WaitUntil.the(SAVE_BUTTON, isNotVisible()).forNoMoreThan(5).seconds());
    }
    public static User user(){
        return instrumented(User.class);

    }
}
