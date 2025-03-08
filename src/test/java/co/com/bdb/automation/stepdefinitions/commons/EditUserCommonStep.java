package co.com.bdb.automation.stepdefinitions.commons;

import co.com.bdb.automation.questions.CommonQuestions;
import co.com.bdb.automation.task.LoguinTask;
import co.com.bdb.automation.task.User;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.java.gl.Dado;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import java.util.List;
import java.util.Map;
import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;
import static co.com.bdb.automation.ui.WebObjectLoguinUI.Login;
import static co.com.bdb.automation.ui.WebObjectNewUI.ADMIN_MENU;
import static co.com.bdb.automation.ui.WebObjectEditUserUI.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;



public class EditUserCommonStep {
    private static final String Kata = "pages.Kata";

    @Dado("que el usuario se encuentra en la pagina de orange")
    public void queelusuarioseencuentraenlapaginadeorange() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(Kata));
    }
    @Cuando("hace login")
    public void hacelogin(List<Map<String, String>> dataMapList) {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(LoguinTask.formulario(parameters));
        Click.on(Login);
    }
    @Y("busque el usuario {string}")
    public void busqueElUsuario(String nuevoUsuario) {
        COMMON_ACTOR.attemptsTo(
                Click.on(Login),
                Click.on(ADMIN_MENU),
                Enter.theValue(nuevoUsuario).into(SEARCH_USER_FIELD));
        COMMON_ACTOR.attemptsTo(Click.on(SEARCH_BUTTON));
    }
    @Entonces("modificara el usuario {string}, {string}, {string}")
    public void modificaraelusuario(String usuario, String claveNueva, String confirmarClave) throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                Click.on(EDIT_BUTTON));
        COMMON_ACTOR.attemptsTo(
                User.withDataNew( usuario, claveNueva, confirmarClave));
        COMMON_ACTOR.attemptsTo(Click.on(SAVE_BUTTON_MODIFY));
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals("098ALEJANDRO12345", ASSERT_USUARIO)));
        Thread.sleep(5000);
    }
}




