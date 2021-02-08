package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

import java.util.Random;

public class Controller {
 @FXML
    private GridPane gridPane;

 Random rnd=new Random();
 public void Table(){
     int[][] massiv=new int[5][5];
     for(int i=0;i<5;i++)
     {
         for (int j=0;j<5;j++)
         {
            massiv[i][j]=rnd.nextInt(10);

         }
     }



 }






}
