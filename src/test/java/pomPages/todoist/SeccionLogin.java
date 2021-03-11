package pomPages.todoist;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class SeccionLogin {
    public Button IrASesionButton = new Button(By.xpath("//a[@class=\"tdo-button js-cta js-cta-finish\"]"));
    public Label verfy =new Label(By.xpath("//img[@class=\"user_avatar big settings_avatar\"]\n"));
    public Button configuracionButton= new Button(By.xpath("//span[contains(.,'Configuración') and @class=\"user_menu_label\"]"));
    public Button editarNombre = new Button(By.xpath("//dd[@class='ajax_edit_cell']//a[@class=\"inline_edit_link\" and contains(.,'Editar')]"));
public TextBox editarNombreTextBox = new TextBox(By.xpath("//dd[@class=\"ajax_edit_cell\"]//input[@type=\"text\"]"));
public Button guardar = new Button(By.xpath("//a[@class=\"inline_edit_link\" and contains(.,'Guardar')]"));

public Button cerrasesion =new Button(By.xpath("//span[@class=\"user_menu_label\" and contains(.,'Cerrar')]"));
    public Label verfyNombre =new Label(By.xpath("//dd[@class='ajax_edit_cell']//a[@class=\"inline_edit_link\" and contains(.,'Editar')]"));




    public SeccionLogin(){}
}
