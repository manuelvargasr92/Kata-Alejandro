package co.com.bdb.automation.stepdefinitions.commons;

import co.com.bdb.automation.questions.CommonQuestions;
import co.com.bdb.automation.task.LoguinTask;
import co.com.bdb.automation.task.NewUser;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.gl.Dado;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;
import java.util.Map;

import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;

import static co.com.bdb.automation.ui.WebObjectNewUI.ASSERT_USUARIO_CREADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class NewUserCommonStep {
    private static final String Kata = "pages.Kata";


    @Dado("que el usuario ingresa a orange")
    public void queElUsuarioIngresaADeorange() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(Kata));
    }
    @Cuando("ingrese los datos correctos,luego da clic boton login")
    public void ingreselosdatoscorrectosluegodaclicbotonlogin(List<Map<String, String>> dataMapList) {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(LoguinTask.formulario(parameters));
    }
    @Entonces("ingresara un nuevo usuario {string}, {string}, {string}, {string}")
    public void ingresaraUnNuevoUsuario(String employeeName, String nuevoUsuario, String clave, String confirmarClave) throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                NewUser.withData(employeeName, nuevoUsuario, clave, confirmarClave));
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals("1ALEJANDRO1234", ASSERT_USUARIO_CREADO)));
        Thread.sleep(5000);
    }
}




