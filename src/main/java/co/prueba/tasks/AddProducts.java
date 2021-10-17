package co.prueba.tasks;

import co.prueba.userinterface.LoginPage;
import co.prueba.userinterface.ToTheCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddProducts implements Task {

    public static AddProducts toTheCart() {
        return Tasks.instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ToTheCart.INGRESARPRODUCTO),
                Enter.theValue("Faded Short Sleeve T-shirts").into(ToTheCart.INGRESARPRODUCTO),
                Click.on(ToTheCart.BUSCARPRODUCTO),
                Click.on(ToTheCart.SELECCIONARPROD),
                Click.on(ToTheCart.AGREGARCARRITO),
                Click.on(ToTheCart.PAGO),
                Click.on(ToTheCart.NEXT),
                Click.on(ToTheCart.NEXT1),
                Click.on(ToTheCart.ACEPTARTERMINOS),
                Click.on(ToTheCart.NEXT2),
                Click.on(ToTheCart.MEDIOPAGO),
                Click.on(ToTheCart.CONFIRMACIONCOMPRA)
        );
    }
}
