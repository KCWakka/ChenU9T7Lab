public class Point {
    private int x;
    private int y;
    private String label;
    public Point(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  Point)) {
            return false;
        }
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }
}
