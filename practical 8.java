class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 5;
        this.y = 5;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(10, 20);
        Point p3 = new Point(p2);

        p1.display();
        p2.display();
        p3.display();
    }
}