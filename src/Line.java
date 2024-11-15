public class Line implements Lengthable{
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = new Point(start.getX(), start.getY());
        this.end = new Point(end.getX(), end.getY());
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public void setStart(Point start) {
        this.start = new Point(start.getX(), start.getY());
    }

    public void setStart(int x, int y) {
        this.start = new Point(x, y);
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }

    public void setEnd(int x, int y) {
        this.end = new Point(x, y);
    }

    public Point getStart() {
        return new Point(start.getX(), start.getY());
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    @Override
    public String toString() {
        return "Line from " + start + " to " + end;
    }
}