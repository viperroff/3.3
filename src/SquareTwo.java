import java.util.ArrayList;
import java.util.List;

public class SquareTwo implements Addable{
        private int x;
        private int y;
        private int sideLength;

        public SquareTwo(int x, int y, int sideLength){
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
        }

        public List<Point> getPolyline() {
            List<Point> points = new ArrayList<>();
            points.add(new Point(x, y));
            points.add(new Point(x + sideLength, y));
            points.add(new Point(x + sideLength, y + sideLength));
            points.add(new Point(x, y + sideLength));
            return points;
        }
}

