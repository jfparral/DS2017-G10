
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
    Scene scene1, scene2,scene3, scene4, scene5,scene6,scene7,scene8, scene9;
    
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
                                window.setScene(scene5);
                            else if(userTextField.getText().equals("administrador") && !pwBox.getText().equals("")&& cbx.getValue().equals("Administrador"))
                                window.setScene(scene9);
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
        
        Text tittlecliente = new Text("Menu de Cliente");
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
                           window.setScene(scene4);
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
                           //accion de buscar platillo
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
        
        GridPane panelbuscar= new GridPane();
        panelbuscar.setAlignment(Pos.CENTER);
        panelbuscar.setHgap(10);
        panelbuscar.setVgap(10);
        panelbuscar.setPadding(new Insets(25, 25, 25, 25));
        
        Text tittlebuscar = new Text("Resultados de la Busqueda");
        tittlebuscar.setId("welcome-text");
        panelbuscar.add(tittlebuscar, 0, 0, 2, 1);
        
        Button btn4 = new Button("Regresar");
        HBox hbBtn4 = new HBox(10);
        hbBtn4.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn4.getChildren().add(btn4);
        panelbuscar.add(hbBtn4,4, 5);
        
        final Text actiontarget4 = new Text();
        panelbuscar.add(actiontarget4, 3, 6);
        actiontarget4.setId("actiontarget");
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene2);
                        }
                    }
        });
        
        Text buscar1= new Text("Buscar platillo:");
        buscar1.setId("buscar");
        panelbuscar.add(buscar1, 2, 3);
        
        TextField campobuscar1 = new TextField();
        panelbuscar.add(campobuscar1, 3, 3);
        
        Button btn5 = new Button("Ir");
        HBox hbBtn5 = new HBox(10);
        hbBtn5.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn5.getChildren().add(btn5);
        panelbuscar.add(hbBtn5,4, 3);        
        
        
        final Text actiontarget5 = new Text();
        panelbuscar.add(actiontarget5, 3, 6);
        actiontarget5.setId("actiontarget");
        
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           //accion de buscar platillo
                        }
                    }
        });
        
        
        scene3=new Scene(panelbuscar,700,400);
        
        GridPane panelcatg= new GridPane();
        panelcatg.setAlignment(Pos.CENTER);
        panelcatg.setHgap(10);
        panelcatg.setVgap(10);
        panelcatg.setPadding(new Insets(25, 25, 25, 25));
        
        Text tittlecatg = new Text("Categoria de Platillos");
        tittlecatg.setId("welcome-text");
        panelcatg.add(tittlecatg, 0, 0, 2, 1);
        
        Button btn6 = new Button("Regresar");
        HBox hbBtn6 = new HBox(10);
        hbBtn6.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn6.getChildren().add(btn6);
        panelcatg.add(hbBtn6,4, 5);
        
        final Text actiontarget6 = new Text();
        panelcatg.add(actiontarget6, 3, 6);
        actiontarget6.setId("actiontarget");
        
        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene2);
                        }
                    }
        });
        
        scene4= new Scene(panelcatg,700,400);
        
        GridPane panelasistente= new GridPane();
        panelasistente.setAlignment(Pos.CENTER);
        panelasistente.setHgap(10);
        panelasistente.setVgap(10);
        panelasistente.setPadding(new Insets(25, 25, 25, 25));
        
        Text tittleasis = new Text("Menu de Asistente");
        tittleasis.setId("welcome-text");
        panelasistente.add(tittleasis, 0, 0, 2, 1);
        
        Button btn9 = new Button("Agregar platillo");
        HBox hbBtn9 = new HBox(10);
        hbBtn9.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn9.getChildren().add(btn9);
        panelasistente.add(hbBtn9,2, 2);
        
        final Text actiontarget9 = new Text();
        panelasistente.add(actiontarget9, 3, 8);
        actiontarget9.setId("actiontarget");
        
        btn9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene6);
                        }
                    }
        });
        
        Button btn10= new Button("Listar platillo");
        HBox hbBtn10= new HBox(10);
        hbBtn10.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn10.getChildren().add(btn10);
        panelasistente.add(hbBtn10,2, 3);
        
        final Text actiontarget10 = new Text();
        panelasistente.add(actiontarget10, 3, 8);
        actiontarget10.setId("actiontarget");
        
        btn10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                            window.setScene(scene7);
                           //listar platillos del restaurante
                        }
                    }
        });
        
        Button btn11= new Button("Listar categoria de platillo");
        HBox hbBtn11= new HBox(10);
        hbBtn11.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn11.getChildren().add(btn11);
        panelasistente.add(hbBtn11,2, 4);
        
        final Text actiontarget11 = new Text();
        panelasistente.add(actiontarget11, 3, 8);
        actiontarget11.setId("actiontarget");
        
        btn11.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                            window.setScene(scene8);
                           //listar categoria de platillos del restaurante
                        }
                    }
        });
        
        Button btn14= new Button("Salir");
        HBox hbBtn14= new HBox(10);
        hbBtn14.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn14.getChildren().add(btn14);
        panelasistente.add(hbBtn14,2, 5);
        
        final Text actiontarget14 = new Text();
        panelasistente.add(actiontarget14, 3, 8);
        actiontarget14.setId("actiontarget");
        
        btn14.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                            Platform.exit();
                        }
                    }
        });
        
        scene5=new Scene(panelasistente,700,400);
        
        GridPane panelaaddplatillo= new GridPane();
        panelaaddplatillo.setAlignment(Pos.CENTER);
        panelaaddplatillo.setHgap(10);
        panelaaddplatillo.setVgap(10);
        panelaaddplatillo.setPadding(new Insets(25, 25, 25, 25));
        
        Text tittleaaddplatillo = new Text("Agregar Platillo");
        tittleaaddplatillo.setId("welcome-text");
        panelaaddplatillo.add(tittleaaddplatillo, 0, 0, 2, 1);
        
        Text nom= new Text("Nombre:");
        nom.setId("nom");
        panelaaddplatillo.add(nom, 1, 2);
        
        TextField camponom = new TextField();
        panelaaddplatillo.add(camponom, 2, 2);
        
        Text cat= new Text("Categoria:");
        cat.setId("nom");
        panelaaddplatillo.add(cat, 1, 3);
        
        TextField campocat = new TextField();
        panelaaddplatillo.add(campocat, 2, 3);
        
        Text desc= new Text("Descripcion:");
        desc.setId("nom");
        panelaaddplatillo.add(desc, 1, 4);
        
        TextField campodesc = new TextField();
        panelaaddplatillo.add(campodesc, 2, 4);
        
        Text serv= new Text("Servido:");
        serv.setId("nom");
        panelaaddplatillo.add(serv, 1, 5);
        
        TextField campserv = new TextField();
        panelaaddplatillo.add(campserv, 2, 5);
        
        Text tipo= new Text("Tipo:");
        tipo.setId("nom");
        panelaaddplatillo.add(tipo, 1, 6);
        
        TextField campotipo = new TextField();
        panelaaddplatillo.add(campotipo, 2, 6);
        
        Button btn7 = new Button("Regresar");
        HBox hbBtn7 = new HBox(10);
        hbBtn7.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn7.getChildren().add(btn7);
        panelaaddplatillo.add(hbBtn7,3, 7);
        
        final Text actiontarget7 = new Text();
        panelaaddplatillo.add(actiontarget7, 3, 8);
        actiontarget7.setId("actiontarget");
        
        btn7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene5);
                        }
                    }
        });
        
        Button btn8 = new Button("Guardar");
        HBox hbBtn8 = new HBox(10);
        hbBtn8.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn8.getChildren().add(btn8);
        panelaaddplatillo.add(hbBtn8,2, 7);
        
        final Text actiontarget8 = new Text();
        panelaaddplatillo.add(actiontarget8, 3, 8);
        actiontarget8.setId("actiontarget");
        
        btn8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                            //aqui codigo para registrar un platillo
                        }
                    }
        });
        
        scene6=new Scene(panelaaddplatillo,700,400);
        
        GridPane panellistplatillo= new GridPane();
        panellistplatillo.setAlignment(Pos.CENTER);
        panellistplatillo.setHgap(10);
        panellistplatillo.setVgap(10);
        panellistplatillo.setPadding(new Insets(25, 25, 25, 25));
        
        Text tittlepanellistplatillo = new Text("Lista de Platillos del Restaurante");
        tittlepanellistplatillo.setId("welcome-text");
        panellistplatillo.add(tittlepanellistplatillo, 0, 0, 2, 1);
        
        Button btn12 = new Button("Regresar");
        HBox hbBtn12 = new HBox(10);
        hbBtn12.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn12.getChildren().add(btn12);
        panellistplatillo.add(hbBtn12,3, 7);
        
        final Text actiontarget12 = new Text();
        panellistplatillo.add(actiontarget12, 3, 8);
        actiontarget12.setId("actiontarget");
        
        btn12.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene5);
                        }
                    }
        });
        
        scene7= new Scene(panellistplatillo,700,400);
        
        GridPane panelcatgplatillo= new GridPane();
        panelcatgplatillo.setAlignment(Pos.CENTER);
        panelcatgplatillo.setHgap(10);
        panelcatgplatillo.setVgap(10);
        panelcatgplatillo.setPadding(new Insets(25, 25, 25, 25));
        
        Text tittlepanelcatgplatillo = new Text("Lista de Categorias del Restaurante");
        tittlepanelcatgplatillo.setId("welcome-text");
        panelcatgplatillo.add(tittlepanelcatgplatillo, 0, 0, 2, 1);
        
        Button btn13 = new Button("Regresar");
        HBox hbBtn13 = new HBox(10);
        hbBtn13.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn13.getChildren().add(btn13);
        panelcatgplatillo.add(hbBtn13,3, 7);
        
        final Text actiontarget13 = new Text();
        panelcatgplatillo.add(actiontarget13, 3, 8);
        actiontarget13.setId("actiontarget");
        
        btn13.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene5);
                        }
                    }
        });
        
        scene8= new Scene(panelcatgplatillo,700,400);
        
        GridPane paneladministrador= new GridPane();
        paneladministrador.setAlignment(Pos.CENTER);
        paneladministrador.setHgap(10);
        paneladministrador.setVgap(10);
        paneladministrador.setPadding(new Insets(25, 25, 25, 25));
        
        Text tittlepaneladministrador = new Text("Menu de Administrador");
        tittlepaneladministrador.setId("welcome-text");
        paneladministrador.add(tittlepaneladministrador, 0, 0, 2, 1);
        
        Button btn15 = new Button("Agregar Restaurante desde XML");
        HBox hbBtn15 = new HBox(10);
        hbBtn15.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn15.getChildren().add(btn15);
        paneladministrador.add(hbBtn15,2, 2);
        
        final Text actiontarget15 = new Text();
        paneladministrador.add(actiontarget15, 3, 8);
        actiontarget15.setId("actiontarget");
        
        btn15.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene9);
                        }
                    }
        });
        
        Button btn16 = new Button("Listar restaurante");
        HBox hbBtn16 = new HBox(10);
        hbBtn16.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn16.getChildren().add(btn16);
        paneladministrador.add(hbBtn16,2, 3);
        
        final Text actiontarget16 = new Text();
        paneladministrador.add(actiontarget16, 3, 8);
        actiontarget16.setId("actiontarget");
        
        btn16.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene9);
                        }
                    }
        });
        Button btn17 = new Button("Agregar usuario");
        HBox hbBtn17 = new HBox(10);
        hbBtn17.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn17.getChildren().add(btn17);
        paneladministrador.add(hbBtn17,2, 4);
        
        final Text actiontarget17 = new Text();
        paneladministrador.add(actiontarget17, 3, 8);
        actiontarget17.setId("actiontarget");
        
        btn17.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           window.setScene(scene9);
                        }
                    }
        });
        
        Button btn18 = new Button("Salir");
        HBox hbBtn18 = new HBox(10);
        hbBtn18.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn18.getChildren().add(btn18);
        paneladministrador.add(hbBtn18,3, 5);
        
        final Text actiontarget18 = new Text();
        paneladministrador.add(actiontarget18, 3, 8);
        actiontarget18.setId("actiontarget");
        
        btn18.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                        {
                           Platform.exit();
                        }
                    }
        });
        scene9= new Scene(paneladministrador,700,400);
        
        scene9.getStylesheets().add(INDescompress.class.getResource("administrador.css").toExternalForm());
        scene8.getStylesheets().add(INDescompress.class.getResource("asistente.css").toExternalForm());
        scene7.getStylesheets().add(INDescompress.class.getResource("asistente.css").toExternalForm());
        scene6.getStylesheets().add(INDescompress.class.getResource("asistente.css").toExternalForm());
        scene5.getStylesheets().add(INDescompress.class.getResource("asistente.css").toExternalForm());
        scene4.getStylesheets().add(INDescompress.class.getResource("categoria.css").toExternalForm());
        scene3.getStylesheets().add(INDescompress.class.getResource("buscar.css").toExternalForm());
        scene2.getStylesheets().add(INDescompress.class.getResource("cliente.css").toExternalForm());
        scene1.getStylesheets().add(INDescompress.class.getResource("Login.css").toExternalForm());
        window.setScene(scene1);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
        
        
    }
}