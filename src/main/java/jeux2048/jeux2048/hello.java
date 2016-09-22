package jeux2048.jeux2048;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class hello extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
//        root.getChildren().add(new Text(30,30,"Hello World!"));
        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");
        grid.setAlignment(Pos.CENTER);
        for(int i = 0; i < 4; i++) {
            ColumnConstraints column = new ColumnConstraints(40);
            grid.getColumnConstraints().add(column);
        }

        for(int i = 0; i < 4; i++) {
            RowConstraints row = new RowConstraints(40);
            grid.getRowConstraints().add(row);
        }

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}