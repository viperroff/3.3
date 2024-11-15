import java.util.ArrayList;
import java.util.List;

public class PolylineMerger {
    public static Polyline mergePolylines(Polychainable[] figures) {
        List<Point> combinedPoints = new ArrayList<>();

        for (Polychainable figure : figures) {
            Polyline polyline = figure.getWholePolyline();
            combinedPoints.addAll(polyline.getPoints());
        }

        return new Polyline(combinedPoints);
    }
}