package co.prueba.tasks;

import co.prueba.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login automationPracticePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.LOGIN),
                Click.on(LoginPage.EMAIL),
                Enter.theValue("pruebachoucair@yopmail.com").into(LoginPage.EMAIL),
                Click.on(LoginPage.CONTRASEÑA),
                Enter.theValue("123456").into(LoginPage.CONTRASEÑA),
                Click.on(LoginPage.INGRESAR));
    }
}
