package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.bdb.automation.ui.WebObjectLoguinUI.*;
import static co.com.bdb.automation.ui.WebObjectNewUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NewUser implements Task {

    private final String EmployeeName;
    private final String nuevoUsuario;
    private final String clave;
    private final String confirmarClave;

    public NewUser(String employeeName, String nuevoUsuario, String clave, String confirmarClave) {
        this.EmployeeName = employeeName;
        this.nuevoUsuario = nuevoUsuario;
        this.clave = clave;
        this.confirmarClave = confirmarClave;
    }

    public static NewUser withData(String employeeName, String nuevoUsuario, String clave, String confirmarClave) {
        return instrumented(NewUser.class, employeeName, nuevoUsuario, clave, confirmarClave);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Login),
                Click.on(ADMIN_MENU),
                Click.on(ADD_USER_BUTTON),

                WaitUntil.the(USER_ROLE_DROPDOWN, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(USER_ROLE_DROPDOWN),
             Click.on(   OPTION_ADMIN),

                Enter.theValue(EmployeeName).into(EMPLOYEE_NAME_FIELD));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); //
        }
        actor.attemptsTo(

                Click.on(SELECT),
                Enter.theValue(nuevoUsuario).into(USERNAME_FIELD),

                Click.on(STATUS_DROPDOWN),
                Click.on(OPTION_ENABLED),

                Enter.theValue(clave).into(PASSWORD_FIELD),
                Enter.theValue(confirmarClave).into(CONFIRM_PASSWORD_FIELD),

                Click.on(SAVE_BUTTON),
                WaitUntil.the(SAVE_BUTTON, isNotVisible()).forNoMoreThan(15).seconds());
    }
}
