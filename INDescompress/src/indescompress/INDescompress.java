
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
import javafx.concurrent.Task;
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
    Scene scene1, scene2,scene3, scene4, scene5;
    String stud1, stud2, ejecu1, ejecu2, clientenom, clientematri, clientecantidad, clientetotal,clientevuelto;
    int acant, acant1;
    double ctotal, cvuelto,cpago;
    private Date fecha=new Date();
    private List<Cliente> ventas=new LinkedList<>();
    private ArrayList<LineItem> items = new ArrayList<LineItem>();
    Task copyWorker;
    Text Mstuden1, Mstuden2,Mejecu1,Mejecu3;
    
    @Override
    public void start(Stage primaryStage) throws ParserConfigurationException {
        window = primaryStage;
        
        
        window.setTitle("Descompress");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Bienvenido al Comedor FIEC");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        Text userName = new Text("Usuario:");
        userName.setId("user");
        grid.add(userName, 2, 2);

        TextField userTextField = new TextField();
        grid.add(userTextField, 3, 2);

        Text pw = new Text("Contraseña:");
        pw.setId("ps");
        grid.add(pw, 2, 3);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 3, 3);

        Button btn = new Button("Ingresar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 4, 4);        
        
        
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
                            else
                            {
                                actiontarget.setText("Ingresando");
                                window.setScene(scene2);
                            }
                        }
                    }
        });



        scene1 = new Scene(grid, 700, 400);
        
        GridPane grid1 = new GridPane();
        grid1.setAlignment(Pos.CENTER);
        grid1.setHgap(10);
        grid1.setVgap(10);
        grid1.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle1 = new Text("Bienvenido al Comedor FIEC");
        scenetitle1.setId("welcome-text");
        grid1.add(scenetitle1, 0, 0, 2, 1);
        
        Text Menu1 = new Text("Almuerzo Estudiantil 1:");
        Menu1.setId("menu1");
        grid1.add(Menu1, 0, 1);

        TextField estudiantil1 = new TextField();
        grid1.add(estudiantil1, 1, 1);
        
        
        Text Menu2 = new Text("Almuerzo Estudiantil 2:");
        Menu2.setId("menu2");
        grid1.add(Menu2, 0, 2);

        TextField estudiantil2 = new TextField();
        grid1.add(estudiantil2, 1, 2);
        
        
        Text Menu3 = new Text("Almuerzo Ejecutiivo 1:");
        Menu3.setId("menu3");
        grid1.add(Menu3, 0, 3);

        TextField ejecutivo1 = new TextField();
        grid1.add(ejecutivo1, 1, 3);
        
        
        Text Menu4 = new Text("Almuerzo Ejecutivo 2:");
        Menu4.setId("menu4");
        grid1.add(Menu4, 0, 4);

        TextField ejecutivo2 = new TextField();
        grid1.add(ejecutivo2, 1, 4);
        
        
        Button btn1 = new Button("Publicar Menú");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn1.getChildren().add(btn1);
        grid1.add(hbBtn1, 1, 6);        
        
        
        final Text almuerzo = new Text();
        grid1.add(almuerzo, 1, 7);
        almuerzo.setId("almuerzo");
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                
                {
                    if((estudiantil1.getText().equals("") && estudiantil2.getText().equals("")))
                        almuerzo.setText("Ingrese al menos un almuerzo estudiantil");
                    else if(ejecutivo1.getText().equals("") && ejecutivo2.getText().equals(""))
                        almuerzo.setText("Ingrese al menos un almuerzo ejecutivo"); 
                    else
                    {
                        almuerzo.setText("Ingresando");
                        window.setScene(scene3);
                    }
                }
            }
        });
        
        scene2 = new Scene(grid1, 700, 400);
        
        GridPane grid2 = new GridPane();
        grid2.setAlignment(Pos.CENTER);
        grid2.setHgap(20);
        grid2.setVgap(20);
        grid2.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle2 = new Text("Venta Comedor FIEC");
        scenetitle2.setId("welcome-text");
        grid2.add(scenetitle2, 0, 0, 8, 1);
        
        Text nombre=new Text("Nombre");
        nombre.setId("nombre");
        grid2.add(nombre,0,1);
        
        TextField nom= new TextField();
        grid2.add(nom,1,1);
        
        
        Text matricula= new Text("Matricula");
        matricula.setId("matricula");
        grid2.add(matricula,0,2);
        
        TextField mat= new TextField();
        grid2.add(mat,1,2);
        
        Text total= new Text("Total");
        total.setId("total");
        grid2.add(total,2,1);
        
        Text total1=new Text("");
        total1.setId("total1");
        grid2.add(total1,3,1);
        
        
        Text Vuelto= new Text("Vuelto");
        Vuelto.setId("vuelto");
        grid2.add(Vuelto,2,2);
        
        Text vuelto1= new Text("");
        vuelto1.setId("vuelto1");
        grid2.add(vuelto1,3,2);
        
        Text Cantidad = new Text("Cantidad Estudiantil");
        Cantidad.setId("cantidad");
        grid2.add(Cantidad,0,3);
        
        TextField cant= new TextField();
        grid2.add(cant, 1, 3);
        
        Text cantidad1 = new Text("Cantidad Ejecutivo");
        cantidad1.setId("cantidad");
        grid2.add(cantidad1,2,3);
        
        TextField cant1= new TextField();
        grid2.add(cant1, 3, 3);
        
        Text pago = new Text("Pago");
        pago.setId("cantidad");
        grid2.add(pago,0,5);
        
        TextField pago1= new TextField();
        grid2.add(pago1, 1, 5);
        
        Text talmuerzo= new Text("Tipo de Almuerzo");
        talmuerzo.setId("almuerzo");
        grid2.add(talmuerzo,0 , 4);
        
        Button btn3 = new Button("Estudiantil");
        HBox hbBtn3 = new HBox(10);
        hbBtn3.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn3.getChildren().add(btn3);
        grid2.add(hbBtn3, 1, 4);        
        
        
        final Text menu = new Text();
        grid2.add(menu, 1, 7);
        menu.setId("almuerzo");
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                if(cant.getText().equals(""))
                {
                    menu.setText("Ingrese cantidad de almuerzo estudiantil");
                }
                else
                {
                    menu.setText("Menu ingresado");
                }
            }
        });
        
        Button btn4 = new Button("Ejecutivo");
        HBox hbBtn4 = new HBox(10);
        hbBtn4.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn4.getChildren().add(btn4);
        grid2.add(hbBtn4, 2, 4);        
        
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                if(cant1.getText().equals(""))
                {
                    menu.setText("Ingrese cantidad de almuerzo ejecutivo");
                }
                else
                {
                    menu.setText("Menu ingresado");
                }
            }
        });
        
        Button btn5 = new Button("Calcular");
        HBox hbBtn5 = new HBox(10);
        hbBtn5.setAlignment(Pos.CENTER);
        hbBtn5.getChildren().add(btn5);
        grid2.add(hbBtn5, 0, 6);        
        
        
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                if(cant.getText().equals(""))
                {
                    menu.setText("Ingrese cantidad de almuerzo estudiantil");
                }
                else if(cant1.getText().equals(""))
                    menu.setText("Ingrese cantidad de almuerzo ejecutivo");
                else if(pago1.getText().equals(""))
                    menu.setText("Ingrese pago para calcular");
                else
                {
                    menu.setText("Venta calculada");
                    acant=Integer.parseInt(cant.getText());
                    acant1=Integer.parseInt(cant1.getText());
                    cpago=Integer.parseInt(pago1.getText());
                    ctotal=(acant*2)+(acant1*2.75);
                    cvuelto=cpago-ctotal;
                    vuelto1.setText(""+cvuelto);
                    total1.setText(""+ctotal);
                }
            }
        });
        
        Button btn6 = new Button("Mostar Menú");
        HBox hbBtn6 = new HBox(10);
        hbBtn6.setAlignment(Pos.CENTER);
        hbBtn6.getChildren().add(btn6);
        grid2.add(hbBtn6, 1, 6);        
        
        
        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                Mstuden1.setText(estudiantil1.getText());
                Mstuden2.setText(estudiantil2.getText());
                Mejecu1.setText(ejecutivo1.getText());
                Mejecu3.setText(ejecutivo2.getText());
                window.setScene(scene4);
            }
        });
        
        Button btn7 = new Button("Imprimir");
        HBox hbBtn7 = new HBox(10);
        hbBtn7.setAlignment(Pos.CENTER);
        hbBtn7.getChildren().add(btn7);
        grid2.add(hbBtn7, 2, 6);        
        
        Text imprimir=new Text();
        imprimir.setId("imprimir");
        grid2.add(imprimir, 1, 8);
        
        btn7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                if(nom.getText().equals("") && mat.getText().equals(""))
                {
                    nom.setText("Consumidor Final");
                    mat.setText("99999999");       
                }
                else
                {
                    Cliente savecliente=new Cliente(nom.getText(),mat.getText(),acant+acant1,ctotal,fecha);
                    imprimir.setText("Venta Exitosa!!");
                    ventas.add(savecliente);
                    items.add(new LineItem(savecliente));
                }
            }
        });
        
        Button salir = new Button("Salir");
        HBox salir1 = new HBox(10);
        salir1.setAlignment(Pos.CENTER);
        salir1.getChildren().add(salir);
        grid2.add(salir1, 3, 8);        
        
        BorderPane mainPane = new BorderPane();
        grid2.add(mainPane,2,8);

        final Label label = new Label("Files Transfer:");
        final ProgressBar progressBar = new ProgressBar(0);

        final HBox hb4 = new HBox();
        hb4.setSpacing(5);
        hb4.setAlignment(Pos.CENTER);
        hb4.getChildren().addAll(label, progressBar);
        mainPane.setTop(hb4);
        
        salir.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                menu.setText("Guardando...");
                try {
                    ItemListBuilder builder = new ItemListBuilder();
                    Document doc = builder.build(items);
                    DOMImplementation impl = doc.getImplementation();
                    DOMImplementationLS implLS
                            = (DOMImplementationLS) impl.getFeature("LS", "3.0");
                    LSSerializer ser = implLS.createLSSerializer();
                    String out = ser.writeToString(doc);
                    System.out.println(out);
                    salir.setDisable(true);
                    progressBar.setProgress(0);
                    copyWorker = createWorker();

                    progressBar.progressProperty().unbind();
                    progressBar.progressProperty().bind(copyWorker.progressProperty());

                    copyWorker.messageProperty().addListener(new ChangeListener<String>() {
                        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                            System.out.println(newValue);
                        }
                    });
                    for(int i=0;i<1;i++)
                    {
                        new Thread(copyWorker).start();
                        Thread.sleep(2000);
                    }
                    Platform.exit();
                    Thread.interrupted();
                }
                 catch (ParserConfigurationException ex) {
                    Logger.getLogger(INDescompress.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(INDescompress.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        Button clean = new Button("Limpiar");
        HBox hbBtn9 = new HBox(10);
        hbBtn9.setAlignment(Pos.CENTER);
        hbBtn9.getChildren().add(clean);
        grid2.add(hbBtn9, 3, 6);        
        
        
        clean.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                nom.clear();
                mat.clear();
                cant.clear();
                cant1.clear();
                pago1.clear();
                imprimir.setText("");
                menu.setText("");
            }
        });
        
        
        scene3 = new Scene(grid2, 700, 500);
        
        GridPane grid3 = new GridPane();
        grid3.setAlignment(Pos.CENTER);
        grid3.setHgap(10);
        grid3.setVgap(10);
        grid3.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle3 = new Text("Menú Comedor FIEC");
        scenetitle3.setId("welcome-text");
        grid3.add(scenetitle3, 0, 0, 2, 1);
        
        Text Mestudent= new Text("Almuerzo Estudiantil 1: ");
        Mestudent.setId("stun1");
        grid3.add(Mestudent,0,1);
        
        Mstuden1= new Text();
        Mstuden1.setId("stun2");
        grid3.add(Mstuden1,1,1);
        
        Text Mestudent1= new Text("Almuerzo Estudiantil 2: ");
        Mestudent1.setId("stun1");
        grid3.add(Mestudent1,0,2);
        
        Mstuden2= new Text();
        Mstuden2.setId("stun2");
        grid3.add(Mstuden2,1,2);
        
        Text Mejecu= new Text("Almuerzo Ejecutivo 1: ");
        Mejecu.setId("stun1");
        grid3.add(Mejecu,0,3);
                        
        Mejecu1= new Text();
        Mejecu1.setId("stun2");
        grid3.add(Mejecu1,1,3);
        
        Text Mejecu2= new Text("Almuerzo Ejecutivo 2: ");
        Mejecu2.setId("stun1");
        grid3.add(Mejecu2,0,4);
        
        Mejecu3= new Text();
        Mejecu3.setId("stun2");
        grid3.add(Mejecu3,1,4);
        
        Button btn8 = new Button("Regresar");
        HBox hbBtn8 = new HBox(10);
        hbBtn8.setAlignment(Pos.CENTER_LEFT);
        hbBtn8.getChildren().add(btn8);
        grid3.add(hbBtn8, 3, 6);        
        
        
        btn8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) 
            {
                window.setScene(scene3);
            }
        });
        
        scene4 = new Scene(grid3,700,400);
        
        
        
        
        
        scene4.getStylesheets().add(INDescompress.class.getResource("menu.css").toExternalForm());
        scene3.getStylesheets().add(INDescompress.class.getResource("factura.css").toExternalForm());
        scene2.getStylesheets().add(INDescompress.class.getResource("almuerzo.css").toExternalForm());
        scene1.getStylesheets().add(INDescompress.class.getResource("Login.css").toExternalForm());
        window.setScene(scene1);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
        
        
    }
    
    public Task createWorker() {
        return new Task() {
            @Override
            protected Object call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(1000);
                    updateProgress(i+10, 10);
                }
                Thread.interrupted();
                return true;
            }
        };
    }
}