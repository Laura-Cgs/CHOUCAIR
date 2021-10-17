package co.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ToTheCart extends PageObject {
    public static final Target INGRESARPRODUCTO = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"search_query_top\"]"));
    public static final Target BUSCARPRODUCTO = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"searchbox\"]/button"));
    public static final Target SELECCIONARPROD = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
    public static final Target AGREGARCARRITO = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
    public static final Target PAGO = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
    public static final Target NEXT = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
    public static final Target NEXT1 = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
    public static final Target ACEPTARTERMINOS = Target.the("buscar producto")
            .located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
    public static final Target NEXT2 = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"form\"]/p/button/span"));
    public static final Target MEDIOPAGO = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    public static final Target CONFIRMACIONCOMPRA = Target.the("buscar producto")
            .located(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));

}
