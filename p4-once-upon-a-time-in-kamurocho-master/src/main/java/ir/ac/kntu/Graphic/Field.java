package ir.ac.kntu.Graphic;


import ir.ac.kntu.Main;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Field {

    public static void backGroundGame(){
        Rectangle enemy = new Rectangle(150, 400, Color.BLACK);
        enemy.setTranslateX(5);
        enemy.setTranslateY(50);
        Main.root.getChildren().add(enemy);

        Rectangle obstacle1 = new Rectangle(20,100,Color.FIREBRICK);
        obstacle1.setTranslateX(420);
        Main.root.getChildren().add(obstacle1);

        Rectangle obstacle2 = new Rectangle(20,100,Color.FIREBRICK);
        obstacle2.setTranslateX(420);
        obstacle2.setTranslateY(135);
        Main.root.getChildren().add(obstacle2);

        Rectangle obstacle3 = new Rectangle(20,100,Color.FIREBRICK);
        obstacle3.setTranslateX(420);
        obstacle3.setTranslateY(270);
        Main.root.getChildren().add(obstacle3);

        Rectangle obstacle4 = new Rectangle(20,100,Color.FIREBRICK);
        obstacle4.setTranslateX(420);
        obstacle4.setTranslateY(400);
        Main.root.getChildren().add(obstacle4);

        Rectangle obstacle5 = new Rectangle(150,10,Color.FIREBRICK);
        obstacle5.setTranslateX(650);
        obstacle5.setTranslateY(250);
        Main.root.getChildren().add(obstacle5);

        Rectangle item1 = new Rectangle(100,100,Color.WHITE);
        item1.setTranslateX(700);
        item1.setTranslateY(70);
        Main.root.getChildren().add(item1);

        Rectangle item2 = new Rectangle(100,100,Color.WHITE);
        item2.setTranslateX(700);
        item2.setTranslateY(335);
        Main.root.getChildren().add(item2);

    }

}
