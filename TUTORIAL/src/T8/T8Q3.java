package T8;

public class T8Q3 {
    public static void main(String[] args) {
        Coordinate defaultCoord = new Coordinate();
        defaultCoord.displayCoordinates();

        Coordinate point = new Coordinate(3.5, 7.8);
        point.displayCoordinates();

        point.setX(5.0);
        point.setY(10.0);
        point.displayCoordinates();
    }
}

class Coordinate {
    private double x;
    private double y;
    
    public Coordinate() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void displayCoordinates() {
        System.out.println("Coordinates: (" + x + ", " + y + ") ");
    }
}
