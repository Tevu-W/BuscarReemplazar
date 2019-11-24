package dad.javafx.BR;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BRApp extends Application {

	private GridPane gridVerde, gridAmarillo;
	private VBox botones, botones1, botones2;
	private HBox buscarHbox, reemplazarHbox;
	private BorderPane border;
	private Label buscarLabel, reemplazarLabel;
	private Button buscarButton, reemplazarButton, reemplazarTodo, cerrar, ayuda;
	private TextField buscarTexto, reemplazarTexto;
	private RadioButton mayus_minus, buscarAtras, expresion, resaltar;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		gridAmarillo = new GridPane();
		gridVerde = new GridPane();
		border = new BorderPane();

		mayus_minus = new RadioButton("Mayúsculas y minúsculas");
		buscarAtras = new RadioButton("Buscar hacia atrás");
		expresion = new RadioButton("Expresión regular");
		resaltar = new RadioButton("Resaltar resultados");
		
		buscarLabel = new Label("Buscar: ");
		reemplazarLabel = new Label("Reemplazar con: ");
		
		buscarTexto = new TextField();
		reemplazarTexto = new TextField();
		
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodo = new Button("Reemplazar todo");
		cerrar = new Button("Cerrar");
		ayuda = new Button("Ayuda");
		
		botones = new VBox(5, buscarButton, reemplazarButton, reemplazarTodo, cerrar, ayuda);
		botones.setPadding(new Insets(10));
		
		buscarButton.setPrefWidth(120);
		reemplazarButton.setPrefWidth(120);
		reemplazarTodo.setPrefWidth(120);
		cerrar.setPrefWidth(120);
		ayuda.setPrefWidth(120);
		
		gridAmarillo.setHgap(10);
		gridAmarillo.setVgap(10);
		gridAmarillo.add(mayus_minus, 0, 0);
		gridAmarillo.add(buscarAtras, 1, 0);
		gridAmarillo.add(expresion, 0, 1);
		gridAmarillo.add(resaltar, 1, 1);
		
		gridVerde.setVgap(10);
		gridVerde.setHgap(10);
		gridVerde.setPadding(new Insets(10));
		gridVerde.add(buscarLabel, 0, 0);
		gridVerde.add(buscarTexto, 1, 0);
		gridVerde.add(reemplazarLabel, 0, 1);
		gridVerde.add(reemplazarTexto, 1, 1);
		gridVerde.add(gridAmarillo, 1, 2);
		
		border.setRight(botones);
		border.setLeft(gridVerde);
		
		Scene scene = new Scene(border, 550, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
