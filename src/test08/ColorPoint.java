package test08;




public class ColorPoint extends Point {

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setPoint(10, 20);
        cp.setColor("GREEN");
        cp.show();

    }

    int xx,yy;
    String co;

    public ColorPoint(int x, int y, String color) {
        super(x,y);
    }


    public void setPoint(int x, int y) {
        move(x,y);
        xx = getX();
        yy = getY();
    }

    public void setColor(String color) {
        co = color;
    }

    public void show() {
        //GREEN색으로 (10, 20)
        System.out.println(co + "색으로 (" + xx + "," + yy + ")");
    }


}
