package ir.ac.kntu.Items;

public class Items {
    private String name;
    private int health, level;

    public Items(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                '}';
    }
}
