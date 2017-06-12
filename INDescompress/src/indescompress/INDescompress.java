
package indescompress;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import indescompress.Cliente;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

/**
 *
 * @author usuario
 */
public class INDescompress extends Application {
    Stage window;
    Scene scene1, scene2,scene3, scene4, scene5,scene6,scene7,scene8;
    
    @Override
    public void start(Stage primaryStage) throws ParserConfigurationException {
        window = primaryStage;
        
        
        window.setTitle("Descompress");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Bienvenido al Login de FIEC");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Text combo = new Text("Tipo de Usuario:");
        combo.setId("user");
        grid.add(combo, 2, 2);
        
        ObservableList<String> mdesp = FXCollections.observableArrayList();
        mdesp.addAll("Cliente", "Administrador", "Asistente");

        ComboBox<String> cbx = new ComboBox<>(mdesp);
        grid.add(cbx,3,2);
        
        Text userName = new Text("Usuario:");
        userName.setId("user");
        grid.add(userName, 2, 3);

        TextField userTextField = new TextField();
        grid.add(userTextField, 3, 3);

        Text pw = new Text("Contraseña:");
        pw.setId("ps");
        grid.add(pw, 2, 4);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 3, 4);

        Button btn = new Button("Ingresar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 4, 5);        
        
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 3, 6);
        actiontarget.setId("actiontarget");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                            if(userTextField.getText().equals("") && pwBox.getText().equals(""))
                                actiontarget.setText("Ingrese Usuario y contraseña");
                            else if(!userTextField.getText().equals("") && pwBox.getText().equals(""))
                                actiontarget.setText("Ingrese Usuario y contraseña");
                            else if(userTextField.getText().equals("") && !pwBox.getText().equals(""))
                                actiontarget.setText("Ingrese Usuario y contraseña");
                            else if(userTextField.getText().equals("cliente") && !pwBox.getText().equals("") && cbx.getValue().equals("Cliente"))
                                window.setScene(scene2);
                            else if(userTextField.getText().equals("asistente") && !pwBox.getText().equals("") && cbx.getValue().equals("Asistente"))
                                window.setScene(scene3);
                            else if(userTextField.getText().equals("administrador") && !pwBox.getText().equals("")&& cbx.getValue().equals("Administrador"))
                                window.setScene(scene4);
                            else
                            {
                                actiontarget.setText("Clave o usuario errados");
                            }
                        }
                    }
        });



        scene1 = new Scene(grid, 700, 400);
        
        GridPane panelcliente= new GridPane();
        panelcliente.setAlignment(Pos.CENTER);
        panelcliente.setHgap(10);
        panelcliente.setVgap(10);
        panelcliente.setPadding(new Insets(25, 25, 25, 25));
        
        Text tittlecliente = new Text("Menu de Usuario");
        tittlecliente.setId("welcome-text");
        panelcliente.add(tittlecliente, 0, 0, 2, 1);
        
        Button btn1 = new Button("Listar Categoria de platos");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn1.getChildren().add(btn1);
        panelcliente.add(hbBtn1,2, 2);        
        
        
        final Text actiontarget1 = new Text();
        panelcliente.add(actiontarget1, 3, 6);
        actiontarget1.setId("actiontarget");
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene3);
                        }
                    }
        });
        
        Text buscar= new Text("Buscar platillo:");
        buscar.setId("buscar");
        panelcliente.add(buscar, 2, 3);
        
        TextField campobuscar = new TextField();
        panelcliente.add(campobuscar, 3, 3);
        
        Button btn3 = new Button("Ir");
        HBox hbBtn3 = new HBox(10);
        hbBtn3.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn3.getChildren().add(btn3);
        panelcliente.add(hbBtn3,4, 3);        
        
        
        final Text actiontarget3 = new Text();
        panelcliente.add(actiontarget3, 3, 6);
        actiontarget3.setId("actiontarget");
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene3);
                        }
                    }
        });
        
        Button btn2 = new Button("Cerrar Sesion");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn2.getChildren().add(btn2);
        panelcliente.add(hbBtn2,4, 5);        
        
        
        final Text actiontarget2 = new Text();
        panelcliente.add(actiontarget2, 3, 6);
        actiontarget2.setId("actiontarget");
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                            userTextField.setText("");
                            pwBox.setText("");
                           window.setScene(scene1);
                        }
                    }
        });
        
        scene2 = new Scene(panelcliente, 700, 400);
        
        scene2.getStylesheets().add(INDescompress.class.getResource("almuerzo.css").toExternalForm());
        scene1.getStylesheets().add(INDescompress.class.getResource("Login.css").toExternalForm());
        window.setScene(scene1);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
        
        
    }
}