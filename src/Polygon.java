public class Polygon {
    private int sides;

    public Polygon(int sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "sides = " + sides;
    }

    @Override
    public boolean equals(Object obj) {
        // immediately returns false if obj is not a Polygon or is null
        if (!(obj instanceof Polygon)) {
            return false;
        }

        // obj is a Polygon (or subclass), so cast obj to Polygon
        Polygon objPoly = (Polygon) obj;

        return (sides == objPoly.sides);
    }
}
