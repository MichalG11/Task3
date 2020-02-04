package pl.michalgorski.task3.models;

public class Player {

    private String name;
    private double points;

    public Player(String name, double points) {
        this.name = name;
        this.points = points;
    }

    public Player(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

}