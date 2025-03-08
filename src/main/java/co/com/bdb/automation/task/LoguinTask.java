package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static co.com.bdb.automation.ui.WebObjectLoguinUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoguinTask implements Task {

    private final Map<String, String> data;

    public LoguinTask(Map<String, String> data){ this.data = data; }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Enter.keyValues(data.get("Usuario")).into(Usuario),
                Enter.keyValues(data.get("Password")).into(Password)

        );
    }
    public static LoguinTask formulario(Map<String, String> data){
        return instrumented(LoguinTask.class,data);
    }
}
