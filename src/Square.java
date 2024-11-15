class Square extends Figure {
    private double sideLength;

    public Square(Point topLeft, double sideLength) {
        super(); // Если есть конструктор для Figure
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }
}
