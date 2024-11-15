import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polyline implements Lengthable{
    private List<Point> points;

    public Polyline() {
        this.points = new ArrayList<>();
    }

    public Polyline(Point... pts) {
        this.points = new ArrayList<>(Arrays.asList(pts));
    }

    public Polyline(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public void addPoints(Point... pts) {
        points.addAll(Arrays.asList(pts));
    }

    public void addPoints(List<Point> pts) {
        points.addAll(pts);
    }

    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }

    public void displayPoints() {
        System.out.println("Points in Polyline:");
        for (Point point : points) {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
    }

    public double getLength() {
        double totalLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            totalLength += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }
        return totalLength;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ломаная: ");
        for (Point p : points) {
            sb.append("(").append(p.getX()).append(", ").append(p.getY()).append(") ");
        }
        return sb.toString();
    }
}