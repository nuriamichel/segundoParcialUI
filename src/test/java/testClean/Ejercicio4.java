package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoist.NavBar;
import pomPages.todoist.SeccionLogin;
import pomPages.todoist.SeccionRegistro;
import singletonSession.Session;

public class Ejercicio4 {

    String email="nuriamichel33222@gmail.com";

    String nombreActualizado= "nuriaupdate";
    String nombre ="nuria";
    String pwd="12345678qwerty";
    NavBar navBar=new NavBar();
    SeccionRegistro seccionRegistro=new SeccionRegistro();
    SeccionLogin seccionLogin=new SeccionLogin();


    @Test
    public void verify_create_account_and_login_todoly() throws InterruptedException {

        Session.getSession().getDriver().get("https://todoist.com/");
        navBar.registrarseButton.click();
        seccionRegistro.emailTextBox.click();
        seccionRegistro.emailTextBox.set(email);
        seccionRegistro.registrarseButton.click();
        seccionRegistro.nonbreTextBox.set(nombre);
        seccionRegistro.passwordTextBox.set(pwd);
        seccionRegistro.submitButton.click();
        seccionLogin.IrASesionButton.click();

        Thread.sleep(2000);
        Assert.assertTrue("No se inicio sesión",seccionLogin.verfy.controlIsDisplayed());

        seccionLogin.verfy.click();
        seccionLogin.configuracionButton.click();

        seccionLogin.editarNombre.click();

        seccionLogin.editarNombreTextBox.click();
        seccionLogin.editarNombreTextBox.clear();
        seccionLogin.editarNombreTextBox.set(nombreActualizado);
        seccionLogin.guardar.click();
        Thread.sleep(2000);

        Assert.assertEquals("no se actualizo",nombreActualizado.equals(seccionLogin.verfyNombre.getText()));
//cerrar sesion
        seccionLogin.verfy.click();
seccionLogin.cerrasesion.click();



    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }
}
