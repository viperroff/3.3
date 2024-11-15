public class AreaSum {
    public double sum(Areable... objects) {
        double areaSum = 0;
        for (Areable object : objects) {
            areaSum += object.area();
        }
        return areaSum;
    }
}