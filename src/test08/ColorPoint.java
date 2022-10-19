package test08;

public class ColorPoint extends Point {


    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setPoint(10, 20);
        cp.setColor("GREEN");
        cp.show();
    }


    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public ColorPoint(int x, int y, String color) {
        super(x, y, color);
    }
    public void setPoint(int x, int y){
        getX();
        getY();
    }
    public void show() {
        System.out.println(getX());
    }

}

