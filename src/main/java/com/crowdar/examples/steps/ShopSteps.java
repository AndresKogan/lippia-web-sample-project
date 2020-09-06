package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {



    @Given("El cliente se encuentra en la página de home")

    public void elClienteSeEncuentraEnLaPaginaHome() {
        Injector._page(ShopHomePage.class).go();
        Injector._page(ShopHomePage.class).verifyHome();

    }

    @When("el cliente hace click en el botón (.*)")
    public void elClienteHaceClickEnElBotónSignIn() {
        Injector._page(ShopHomePage.class).clickSignInButton();
        Injector._page(ShopHomePage.class).verifyHome();

    }

    @Then("el cliente verifica que fue redireccionado a la pantalla (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeLogin(String pantalla) {

    }

    @When("el cliente ingresa su email: (.*)")
    public void elClienteIngresaSuEmailTestingDrieccionFalsaLiseCom(String email) {

    }

    @And("el cliente ingresa su password: {int}")
    public void ElClienteIngresaSuPassword(String arg0) {

    }





    }




