
public class Rectangle extends Polygon {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + ", length = " + length + ", width = " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle objRect = (Rectangle) obj;

        return (super.equals(objRect) &&
                length == objRect.length &&
                width == objRect.width);
    }
}
