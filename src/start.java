import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class start extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane rootPane = new Pane();
        rootPane.setMinSize(500, 500);
        Scene startScene = new Scene(rootPane);
        Button plus = new Button("+");
        Button min = new Button("-");
        Button keer = new Button("*");
        plus.relocate(0,50);
        min.relocate(40,50);
        keer.relocate(100,50);
        rootPane.getChildren().add(plus);
        rootPane.getChildren().add(min);
        rootPane.getChildren().add(keer);

        primaryStage.setScene(startScene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();




    }
}
