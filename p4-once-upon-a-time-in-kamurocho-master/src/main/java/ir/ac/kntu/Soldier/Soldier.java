package ir.ac.kntu.Soldier;

public class Soldier {
    private String name;
    private int health, attack, speed, level;
    private double fieldOfView, attackRange;

    public Soldier(String name, int health, int attack, int speed, double fieldOfView, double attackRange, int level) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.fieldOfView = fieldOfView;
        this.attackRange = attackRange;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public double getFieldOfView() {
        return fieldOfView;
    }

    public void setFieldOfView(double fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(double attackRange) {
        this.attackRange = attackRange;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", speed=" + speed +
                ", level=" + level +
                ", fieldOfView=" + fieldOfView +
                ", attackRange=" + attackRange +
                '}';
    }
}
