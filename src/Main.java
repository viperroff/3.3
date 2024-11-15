import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.sum(2, 3.0 / 5.0, 2.3);
        calculate.sum(3.6, 49.0 / 12.0, 3, 3.0/2.0);
        calculate.sum(1.0 / 3, 1);

        //3.3.2

        Singable parrot = new Parrot("Я попугай, изучающий Java. Моя задача - писать бэкэнд");
        Singable cuckoo = new Cuckoo();
        Singable sparrow = new Sparrow();
        parrot.sing();
        cuckoo.sing();
        sparrow.sing();

        //3.3.3

        Point circleCenter = new Point(0, 0);
        Circle circle = new Circle(circleCenter, 5);
        System.out.println("Площадь круга: " + circle.area());

        Point squareTopLeft = new Point(1, 1);
        Square square = new Square(squareTopLeft, 4);
        System.out.println("Площадь квадрата: " + square.area());

        Point rectangleTopLeft = new Point(2, 2);
        Rectangle rectangle = new Rectangle(rectangleTopLeft, 6, 3);
        System.out.println("Площадь прямоугольника: " + rectangle.area());

        Point triangleVertex1 = new Point(0, 0);
        Point triangleVertex2 = new Point(4, 0);
        Point triangleVertex3 = new Point(2, 3);
        Triangle triangle = new Triangle(triangleVertex1, triangleVertex2, triangleVertex3);
        System.out.println("Площадь треугольника: " + triangle.area());

        AreaSum areaSum1 = new AreaSum();
        System.out.println(areaSum1.sum(square, rectangle));
        System.out.println(areaSum1.sum(circle, triangle));

        //3.3.4

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();

        MeowGroup meowGroup = new MeowGroup();
        meowGroup.groupping(cat1, cat2);


        //3.3.5

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(7, 8);
        Line line = new Line(p1, p2);
        Polyline polyline = new Polyline(p1, p2, p3);
        Length length1 = new Length();
        System.out.println(polyline.getLength());
        System.out.println(line.getLength());
        System.out.println(length1.getWholeLength(polyline, line));

        //3.3.6

        SquareTwo squareTwo1 = new SquareTwo(0, 0, 5);
        List<Point>polyline1 = squareTwo1.getPolyline();
        for(Point point : polyline1){
            System.out.println(point);
        }

        //3.3.7

        Point p5 = new Point(0, 0);
        Point p6 = new Point(4, 0);
        Point p7 = new Point(2, 3);
        Triangle triangle2 = new Triangle(p5, p6, p7);
        Point p8 = new Point(1, 1);
        Point p9 = new Point(5, 1);
        Point p10 = new Point(3, 4);
        Triangle triangle3 = new Triangle(p8, p9, p10);
        Polyline polyline2 = triangle2.getWholePolyline();
        Polyline polyline3 = triangle2.getWholePolyline();
        List<Point> combinedPoints = new ArrayList<>();
        combinedPoints.addAll(triangle3.getPoints());
        combinedPoints.addAll(triangle2.getPoints());
        Polyline combinedPolyline = new Polyline(combinedPoints);
        combinedPolyline.displayPoints();

        //3.3.8

        Gun gun1 = new Gun("Кольт 45",2);
        Gun gun2 = new Gun("Бистервия", 5);
        Shooter shooter1 = new Shooter("James", gun1);

        shooter1.shoot(); // Вывод: Бах!
        shooter1.shoot(); // Вывод: Бах!
        System.out.println(shooter1.getWeapon().load(4));
        gun1.recharge(5);
        System.out.println(gun1.getCharge());
        shooter1.changeWeapon(gun2);
        shooter1.shoot();

        //3.3.9

        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");

        a.addConnections(b, 100);
        a.addConnections(c, 200);
        b.addConnections(d, 400);
        b.addConnection(c, 350);
        d.addConnections(e, 500);
        e.addConnection(c, 50);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


    }
}