package ir.ac.kntu;

import ir.ac.kntu.Items.Container;
import ir.ac.kntu.Items.Items;
import ir.ac.kntu.Soldier.Ally.SoheiDojima;
import ir.ac.kntu.Soldier.Enemy.RedSoldier;
import ir.ac.kntu.Soldier.Soldier;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new RedSoldier();
        System.out.println(soldier.toString());
        Soldier soldier1 = new SoheiDojima();
        System.out.println(soldier1.toString());
        Items items = new Container();
        System.out.println(items.toString());
    }
}