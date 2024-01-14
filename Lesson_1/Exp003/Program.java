package Lesson_1.Exp003;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        a.setX(0);
        a.setY(2);
        System.out.println(a.getX());
        System.err.println(a.getY());

        //System.out.println(a.getInfo()); - вывести точку с помощью метода getInfo, если бы он был public

        Point2D b = new Point2D(0);
        System.out.println(b);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);

    }

}
