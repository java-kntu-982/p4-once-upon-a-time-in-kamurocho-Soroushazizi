package ir.ac.kntu.Graphic;
import ir.ac.kntu.Main;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class EventHandling {
    public static void menuEventHandling(){
        Main.missions.setOnMouseClicked(mouseEvent ->{
            dontShowMenu();
            Main.missions1.setVisible(true);
            Main.missions2.setVisible(true);
            Main.back.setVisible(true);
            Main.back.setOnMouseClicked(mouseEvent1 -> {
                showMenu();
            });
        });

        Main.fortify.setOnMouseClicked(mouseEvent -> {
            dontShowMenu();
            showItems();
            Main.back.setOnMouseClicked(mouseEvent1 -> {
                dontShowItems();
                showMenu();
            });
        });

        Main.train.setOnMouseClicked(mouseEvent -> {
            showSoldier();
            Main.s1.setOnMouseClicked(mouseEvent1 -> {
                String s1 = "Level = " + Main.soldier1.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier1.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text1 = new Text(s1);
                text1.setTranslateX(50);
                text1.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash >= Main.soldier1.getLevel()*10){
                        Main.root.getChildren().remove(text1);
                        setCash(Main.cash - Main.soldier1.getLevel()*10);
                        Main.soldier1.setLevel(Main.soldier1.getLevel()+1);
                    }else{
                        Main.s1.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text1);
            });
            Main.s2.setOnMouseClicked(mouseEvent1 -> {
                String s2 = "Level = " + Main.soldier2.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier2.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text2 = new Text(s2);
                text2.setTranslateX(50);
                text2.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash >= Main.soldier2.getLevel()*10){
                        Main.root.getChildren().remove(text2);
                        setCash(Main.cash - Main.soldier2.getLevel()*10);
                        Main.soldier2.setLevel(Main.soldier2.getLevel()+1);
                    }else{
                        Main.s2.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text2);
            });
            Main.s3.setOnMouseClicked(mouseEvent1 -> {
                String s3 = "Level = " + Main.soldier3.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier3.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text3 = new Text(s3);
                text3.setTranslateX(50);
                text3.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash >= Main.soldier3.getLevel()*10){
                        Main.root.getChildren().remove(text3);
                        setCash(Main.cash - Main.soldier3.getLevel()*10);
                        Main.soldier3.setLevel(Main.soldier3.getLevel()+1);
                    }else{
                        Main.s3.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text3);
            });
            Main.s5.setOnMouseClicked(mouseEvent1 -> {
                String s5 = "Level = " + Main.soldier5.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier5.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text5 = new Text(s5);
                text5.setTranslateX(50);
                text5.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash >= Main.soldier5.getLevel()*10){
                        Main.root.getChildren().remove(text5);
                        setCash(Main.cash - Main.soldier5.getLevel()*10);
                        Main.soldier5.setLevel(Main.soldier5.getLevel()+1);
                    }else{
                        Main.s5.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text5);
            });
            Main.s4.setOnMouseClicked(mouseEvent1 -> {
                String s4 = "Level = " + Main.soldier4.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier4.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text4 = new Text(s4);
                text4.setTranslateX(50);
                text4.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash > Main.soldier4.getLevel()*10){
                        Main.root.getChildren().remove(text4);
                        setCash(Main.cash - Main.soldier4.getLevel()*10);
                        Main.soldier4.setLevel(Main.soldier4.getLevel()+1);
                    }else{
                        Main.s4.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text4);
            });
            Main.s6.setOnMouseClicked(mouseEvent1 -> {
                String s6 = "Level = " + Main.soldier6.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier6.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text6 = new Text(s6);
                text6.setTranslateX(50);
                text6.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash > Main.soldier6.getLevel()*10){
                        Main.root.getChildren().remove(text6);
                        setCash(Main.cash - Main.soldier6.getLevel()*10);
                        Main.soldier6.setLevel(Main.soldier6.getLevel()+1);
                    }else{
                        Main.s6.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text6);
            });
            Main.s7.setOnMouseClicked(mouseEvent1 -> {
                String s7 = "Level = " + Main.soldier7.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier7.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text7 = new Text(s7);
                text7.setTranslateX(50);
                text7.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash > Main.soldier7.getLevel()*10){
                        Main.root.getChildren().remove(text7);
                        setCash(Main.cash - Main.soldier7.getLevel()*10);
                        Main.soldier7.setLevel(Main.soldier7.getLevel()+1);
                    }else{
                        Main.s7.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text7);
            });
            Main.s8.setOnMouseClicked(mouseEvent1 -> {
                String s8 = "Level = " + Main.soldier8.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier8.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text8 = new Text(s8);
                text8.setTranslateX(50);
                text8.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash > Main.soldier8.getLevel()*10){
                        Main.root.getChildren().remove(text8);
                        setCash(Main.cash - Main.soldier8.getLevel()*10);
                        Main.soldier8.setLevel(Main.soldier8.getLevel()+1);
                    }else{
                        Main.s8.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text8);
            });
            Main.s9.setOnMouseClicked(mouseEvent1 -> {
                String s9 = "Level = " + Main.soldier9.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier9.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text9 = new Text(s9);
                text9.setTranslateX(50);
                text9.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash > Main.soldier9.getLevel()*10){
                        Main.root.getChildren().remove(text9);
                        setCash(Main.cash - Main.soldier9.getLevel()*10);
                        Main.soldier9.setLevel(Main.soldier9.getLevel()+1);
                    }else{
                        Main.s9.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text9);
            });
            Main.s10.setOnMouseClicked(mouseEvent1 -> {
                String s10 = "Level = " + Main.soldier10.getLevel() + '\n' + "LevelUp Costs = " + Main.soldier10.getLevel()*10 + "\nCurrent Money = "+ Main.cash;
                Text text10 = new Text(s10);
                text10.setTranslateX(50);
                text10.setTranslateY(50);
                Main.levelUp.setVisible(true);
                Main.levelUp.setOnMouseClicked(mouseEvent2 -> {
                    if(Main.cash > Main.soldier10.getLevel()*10){
                        Main.root.getChildren().remove(text10);
                        setCash(Main.cash - Main.soldier10.getLevel()*10);
                        Main.soldier10.setLevel(Main.soldier10.getLevel()+1);
                    }else{
                        Main.s10.setStyle("-fx-background-color: #FF0000;");
                    }
                });
                Main.root.getChildren().add(text10);
            });
            Main.back.setOnMouseClicked(mouseEvent1 -> {
                dontShowSoldier();
                Main.levelUp.setVisible(false);
            });
        });
        Main.organization.setOnMouseClicked(mouseEvent -> {
            showSoldier();
            Main.s1.setOnMouseClicked(mouseEvent1 -> {
                Main.s1.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier1.getName());
            });
            Main.s2.setOnMouseClicked(mouseEvent2 -> {
                Main.s2.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier2.getName());
            });
            Main.s3.setOnMouseClicked(mouseEvent3 -> {
                Main.s3.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier3.getName());
            });
            Main.s4.setOnMouseClicked(mouseEvent4 -> {
                Main.s4.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier4.getName());
            });
            Main.s5.setOnMouseClicked(mouseEvent5 -> {
                Main.s5.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier5.getName());
            });
            Main.s6.setOnMouseClicked(mouseEvent6 -> {
                Main.s6.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier6.getName());
            });
            Main.s7.setOnMouseClicked(mouseEvent7 -> {
                Main.s7.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier7.getName());
            });
            Main.s8.setOnMouseClicked(mouseEvent8 -> {
                Main.s8.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier8.getName());
            });
            Main.s9.setOnMouseClicked(mouseEvent9 -> {
                Main.s9.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier9.getName());
            });
            Main.s10.setOnMouseClicked(mouseEvent10 -> {
                Main.s10.setStyle("-fx-background-color: #008000\t;");
                addSoldier(Main.soldier10.getName());
            });
            Main.back.setOnMouseClicked(mouseEvent1 -> {
                dontShowSoldier();
            });
        });

        Main.exit.setOnMouseClicked(mouseEvent -> System.exit(1));

        Main.sound.setOnMouseClicked(mouseEvent -> {
            if(Main.mediaPlayer.isMute()){
                Main.mediaPlayer.setMute(false);
            }else {
                Main.mediaPlayer.setMute(true);
            }
        });

        Main.help.setOnMouseClicked(mouseEvent -> {
            Text text = new Text(help());
            text.setStroke(Color.BLACK);
            Main.root.getChildren().add(text);
            dontShowMenu();
            Main.back.setVisible(true);
            Main.back.setTranslateX(320);
            Main.back.setTranslateY(230);
            Main.back.setOnMouseClicked(mouseEvent1 -> {
                Main.root.getChildren().remove(text);
                showMenu();
            });
        });
    }

    public static void addSoldier(String soldierName){
        Main.allyTeam.add(soldierName);
    }

    public static String help() {
        String helpText = "\n\n\n\n\tWelcome!\n" +
                "\t1. Missions = click on missions to view the missions of this game (once you have finished the first mission, you can play the next one!)" + '\n' +
                "\t2. Organization = you can choose your employees to go to war!" + '\n' +
                "\t3. Train = you can train and upgrade your employees to make them stronger" + '\n' +
                "\t4. FortifyHQ = you can upgrade and Fortify your stuff to make them less vulnerabil!" + '\n' +
                "\t5. Recruit Employee = you can randomly recruit an employee and add them on your team!" + '\n';
        return helpText;
    }

    public static void showItems(){
        Main.container.setVisible(true);
        Main.powerShovel.setVisible(true);
        Main.steelFramework.setVisible(true);
        Main.truck.setVisible(true);
        Main.van.setVisible(true);
        Main.back.setVisible(true);
        Main.exit.setTranslateY(470);
        Main.exit.setTranslateX(650);
        Main.back.setTranslateX(0);
        Main.back.setTranslateY(470);
    }

    public static void dontShowItems(){
        showMenu();
        Main.container.setVisible(false);
        Main.powerShovel.setVisible(false);
        Main.steelFramework.setVisible(false);
        Main.truck.setVisible(false);
        Main.van.setVisible(false);
    }

    public static void showMenu(){
        Main.missions.setVisible(true);
        Main.train.setVisible(true);
        Main.recruit.setVisible(true);
        Main.organization.setVisible(true);
        Main.train.setVisible(true);
        Main.fortify.setVisible(true);
        Main.help.setVisible(true);
        Main.missions1.setVisible(false);
        Main.missions2.setVisible(false);
        Main.back.setVisible(false);
    }
    public static void dontShowMenu(){
        Main.missions.setVisible(false);
        Main.train.setVisible(false);
        Main.recruit.setVisible(false);
        Main.organization.setVisible(false);
        Main.train.setVisible(false);
        Main.fortify.setVisible(false);
        Main.help.setVisible(false);
    }
    public static void showSoldier(){
        dontShowMenu();
        Main.s1.setVisible(true);
        Main.s2.setVisible(true);
        Main.s3.setVisible(true);
        Main.s4.setVisible(true);
        Main.s5.setVisible(true);
        Main.s6.setVisible(true);
        Main.s7.setVisible(true);
        Main.s8.setVisible(true);
        Main.s9.setVisible(true);
        Main.s10.setVisible(true);
        Main.back.setVisible(true);
        Main.exit.setTranslateY(470);
        Main.exit.setTranslateX(650);
        Main.back.setTranslateX(0);
        Main.back.setTranslateY(470);
    }
    public static void dontShowSoldier(){
        showMenu();
        Main.s1.setVisible(false);
        Main.s2.setVisible(false);
        Main.s3.setVisible(false);
        Main.s4.setVisible(false);
        Main.s5.setVisible(false);
        Main.s6.setVisible(false);
        Main.s7.setVisible(false);
        Main.s8.setVisible(false);
        Main.s9.setVisible(false);
        Main.s10.setVisible(false);
    }

    public static double getCash(){
        return Main.cash;
    }

    public static void setCash(double cash){
        Main.cash = cash;
    }

}
