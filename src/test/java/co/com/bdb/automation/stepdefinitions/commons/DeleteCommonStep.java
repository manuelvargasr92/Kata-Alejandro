package co.com.bdb.automation.stepdefinitions.commons;

import co.com.bdb.automation.questions.UserList;
import co.com.bdb.automation.task.DeleteTask;
import co.com.bdb.automation.task.LoguinTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;
import java.util.Map;

import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;
import static co.com.bdb.automation.ui.WebObjectEditUserUI.SEARCH_BUTTON;
import static co.com.bdb.automation.ui.WebObjectEditUserUI.SEARCH_USER_FIELD;
import static co.com.bdb.automation.ui.WebObjectLoguinUI.Login;
import static co.com.bdb.automation.ui.WebObjectNewUI.ADMIN_MENU;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class DeleteCommonStep {

    private static final String Kata = "pages.Kata";

    @Dado("que el usuario esta en la pagina")
    public void queelusuarioestaenlapagina() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(Kata));
    }

    @Y("hace login en orange")
    public void haceloginenorange(List<Map<String, String>> dataMapList) {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(LoguinTask.formulario(parameters));
        COMMON_ACTOR.attemptsTo(Click.on(Login));
    }

    @Cuando("busque un usuario registrado {string}")
    public void busqueunusuarioregistrado(String nuevoUsuario) {
        COMMON_ACTOR.attemptsTo(
                Click.on(ADMIN_MENU),
                Enter.theValue(nuevoUsuario).into(SEARCH_USER_FIELD),
                Click.on(SEARCH_BUTTON)
        );
    }

    @Entonces("dara clic en la opcion eliminar y confirmara la eliminacion")
    public void daraClicEnLaOpcionEliminar() {
        COMMON_ACTOR.attemptsTo(DeleteTask.deleteUser());
        COMMON_ACTOR.should(seeThat(UserList.doesNotContain("Franklin Kuvalis V"), is(true)));
    }
}