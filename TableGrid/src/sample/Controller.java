package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {

    @FXML
    private Label _1,_2,_3,_4,_5;
    @FXML
    private Label randy,exec;


    public int[] Mas=new int[5];
    public String lab="_";
   @FXML
    public void RandNum(){
       Random rnd=new Random();
       for(int i=0;i<Mas.length;i++)
       {
           Mas[i]=rnd.nextInt(7);

           if(i==0) _1.setText(Integer.toString(Mas[i]));
           if(i==1) _2.setText(Integer.toString(Mas[i]));
           if(i==2) _3.setText(Integer.toString(Mas[i]));
           if(i==3) _4.setText(Integer.toString(Mas[i]));
           if(i==4) _5.setText(Integer.toString(Mas[i]));
       }

   }

   @FXML
    public void Exercise(){
       int max=Mas[0],min=Mas[0];
        for(int i=0;i<Mas.length;i++)
        {
            if(Mas[i]>max)max=Mas[i];
        }
       for(int i=0;i<Mas.length;i++)
       {
           if(Mas[i]<min)min=Mas[i];
       }
       randy.setText(Integer.toString(max));
       exec.setText(Integer.toString(min));
   }




}
