package co.prueba.tasks;

import co.prueba.userinterface.AutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {
    private AutomationPractice automationPractice;
    public static Performable thePage() {
        return Tasks.instrumented(OpenPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationPractice));

    }

}
