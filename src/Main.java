public class Main {
    public static void main(String[] args) {
        Point pointA = new Point("A", 5, -7);
        Point pointB = new Point("B", 5, -7);
        Point pointC = new Point("C", 5, 4);
        Point pointD = new Point("D", 4, 5);
        Point pointE = new Point("E", 5, -7);

        System.out.println(pointA);
        System.out.println(pointB);
        System.out.println(pointC);
        System.out.println(pointD);
        System.out.println(pointE);

        System.out.println(pointA.equals(pointB));
        System.out.println(pointA.equals(pointE));
        System.out.println(pointA.equals(pointC));
        System.out.println(pointB.equals(pointC));
        System.out.println(pointC.equals(pointD));
        System.out.println(pointA.equals("Point C"));
        System.out.println(pointA.equals(null));
        Polygon poly = new Polygon(4);
        System.out.println(pointA.equals(poly));

        ThreeDPoint pointF = new ThreeDPoint("F", 12, -3, 8);
        ThreeDPoint pointG = new ThreeDPoint("G", 12, -3, 8);
        ThreeDPoint pointH = new ThreeDPoint("H", 12, -3, 4);
        ThreeDPoint pointI = new ThreeDPoint("I", 10, -3, 8);
        ThreeDPoint pointJ = new ThreeDPoint("J", 10, 15, 8);

        System.out.println(pointF);
        System.out.println(pointG);
        System.out.println(pointH);
        System.out.println(pointI);
        System.out.println(pointJ);

        System.out.println(pointF.equals(pointG));
        System.out.println(pointG.equals(pointH));
        System.out.println(pointG.equals(pointI));
        System.out.println(pointH.equals(pointI));
        System.out.println(pointI.equals(pointJ));
        System.out.println(pointI.equals(new Point("K", 10, -3)));
        System.out.println(pointF.equals("hello"));
        System.out.println(pointF.equals(null));
        Polygon poly2 = new Polygon(4);
        System.out.println(pointF.equals(poly2));
    }
}