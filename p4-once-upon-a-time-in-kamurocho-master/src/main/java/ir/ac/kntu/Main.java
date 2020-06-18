package ir.ac.kntu;

import ir.ac.kntu.Graphic.EventHandling;
import ir.ac.kntu.Graphic.Field;
import ir.ac.kntu.Soldier.Ally.*;
import ir.ac.kntu.Soldier.Soldier;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<String> allyTeam = new ArrayList<>();
    public static Group root = new Group();
    public static Scene scene = new Scene(root, 800, 500, Color.GRAY);
    public static double cash = 100;
    public static Button container = new Button("Container");
    public static Button powerShovel = new Button("PowerShovel");
    public static Button steelFramework = new Button("SteelFramework");
    public static Button truck = new Button("Truck");
    public static Button van = new Button("Van");
    public static Button levelUp = new Button("Level UP???");
    public static Button missions = new Button("Missions");
    public static Button missions1 = new Button("Mission 1");
    public static Button missions2 = new Button("Mission 2");
    public static Button organization = new Button("Organization");
    public static Button train = new Button("Train");
    public static Button fortify = new Button("FortifyHQ");
    public static Button recruit = new Button("Recruit Employee");
    public static Button help = new Button("Help");
    public static Button back = new Button("Back to Main Menu");
    public static Button exit = new Button("Exit");
    public static Button sound = new Button("Sound");
    public static String path = "sound/backgroundSound.mp3";
    public static Media media = new Media(new File(path).toURI().toString());
    public static MediaPlayer mediaPlayer = new MediaPlayer(media);
    public static Soldier soldier1 = new DaigoDojima();
    public static Button s1 = new Button(soldier1.getName());
    public static Soldier soldier2 = new FutoshiShimano();
    public static Button s2 = new Button(soldier2.getName());
    public static Soldier soldier3 = new GoroMajima();
    public static Button s3 = new Button(soldier3.getName());
    public static Soldier soldier4 = new KaoruSayama();
    public static Button s4 = new Button(soldier4.getName());
    public static Soldier soldier5 = new MakotoDate();
    public static Button s5 = new Button(soldier5.getName());
    public static Soldier soldier6 = new OsamuKashiwagi();
    public static Button s6 = new Button(soldier6.getName());
    public static Soldier soldier7 = new RyoTakashima();
    public static Button s7 = new Button(soldier7.getName());
    public static Soldier soldier8 = new RyujiGoda();
    public static Button s8 = new Button(soldier8.getName());
    public static Soldier soldier9 = new SoheiDojima();
    public static Button s9 = new Button(soldier9.getName());
    public static Soldier soldier10 = new TaigaSaejima();
    public static Button s10 = new Button(soldier10.getName());

    @Override
    public void init() {
        System.out.println("Initializing The Game...");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ir.ac.kntu.Graphic.Button.button();
//        Field.backGroundGame();
        mediaPlayer.play();
        mediaPlayer.setVolume(0.3);
        mediaPlayer.setAutoPlay(true);
        EventHandling.menuEventHandling();
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Once Upon a Time in Kamurocho by Soroush Azizi");
        primaryStage.setResizable(false);

    }

    @Override
    public void stop() {
        System.out.println("Closing....");
    }

    public static void main(String[] args) {
        launch(args);
    }
}