package co.com.bdb.automation.task;

import co.com.bdb.automation.ui.WebObjectDeleteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

public class DeleteTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WebObjectDeleteUI.ELIMINAR_BUTTON),
                WaitUntil.the(WebObjectDeleteUI.POPUP, WebElementStateMatchers.isVisible()), //Esperar a que el popup sea visible
                Click.on(WebObjectDeleteUI.CONFIRM_DELETE_BUTTON)
        );
    }

    public static DeleteTask deleteUser() {
        return new DeleteTask();
    }
}