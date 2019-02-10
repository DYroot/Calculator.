package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    @FXML
    private TextField num2Field;

    @FXML
    private TextField num1Field;

    @FXML
    private TextField resultField1;

    private int num1;
    private int num2;
    private int result;
    private Model model=new Model();

   @FXML
    public void anyButtonClick(ActionEvent actionEvent){
       Button button = (Button) actionEvent.getSource();
       String string = button.getText();
       char operator = string.charAt(0);

       num1 = Integer.parseInt(num1Field.getText());
       num2 = Integer.parseInt(num2Field.getText());
       result = model.calculate(num1,num2,operator);
       resultField1.setText(String.valueOf(result));
   }

   }


