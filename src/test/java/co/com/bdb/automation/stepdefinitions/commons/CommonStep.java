package co.com.bdb.automation.stepdefinitions.commons;

import co.com.bdb.automation.questions.CommonQuestions;
import co.com.bdb.automation.task.LoguinTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.gl.Dado;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;


import java.util.List;
import java.util.Map;

import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;
import static co.com.bdb.automation.ui.WebObjectLoguinUI.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class CommonStep {
    private static final String Kata = "pages.Kata";


    @Dado("que el usuario ingrese a la pagina de orange")
    public void queElUsuarioIngreseALaPaginaDeorange() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(Kata));


    }
    @Cuando("complete el formulario con la siguiente informacion,luego da clic boton login")
    public void completeElFormularioConLaSiguienteInformacion(List<Map<String, String>> dataMapList) {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(LoguinTask.formulario(parameters));


    }
    @Entonces("visualizara el mensaje de error {string}")
    public void visualizaraelmensajedeerror(String Error) {
        COMMON_ACTOR.attemptsTo(Click.on(Login));

        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(Error, LOGUIN_INVALID)));

    }

    @Entonces("vera el mensaje en el campo Username {string}")
    public void veraelmensajeenelcampoUsername(String Error) {
        COMMON_ACTOR.attemptsTo(Click.on(Login));

        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(Error, LOGUIN_Required)));

    }
    @Entonces("vera el mensaje en los campos Username y Password {string}")
    public void veraelmensajeenloscamposUsernameyPassword(String Error) {
        COMMON_ACTOR.attemptsTo(Click.on(Login));

        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(Error, LOGUIN_Required)));
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(Error, LOGUIN_Required2)));

    }



}




