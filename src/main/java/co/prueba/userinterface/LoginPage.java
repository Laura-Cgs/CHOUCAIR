package co.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target LOGIN = Target.the("boton de para ingresar user y pass")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
    public static final Target EMAIL = Target.the("ingreso usuario")
            .located(By.xpath("//*[@id=\"email\"]"));
    public static final Target CONTRASEÑA = Target.the("ingreso contraseña")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
    public static final Target INGRESAR = Target.the("boton ingresar")
            .located(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
}
