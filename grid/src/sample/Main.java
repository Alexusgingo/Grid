package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        Random rnd=new Random();
        int[][] massiv=new int[5][5];
        int a=0;
        for(int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                massiv[i][j]=rnd.nextInt(10);
                a=massiv[i][j];
                Label lb=new Label();
                lb.setText(Integer.toString(a));
                // Put on cell (0,0), span 2 column, 1 row.
                root.add( lb,0, 0, 2, 1);

            }
        }

        root.setPadding(new Insets(20));
        root.setHgap(25);
        root.setVgap(15);

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("GridPanel Layout Demo (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
