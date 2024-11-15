public class Length {
    public double getWholeLength(Lengthable... objects){
        double wholeLenght = 0;
        for(Lengthable object : objects){
            wholeLenght += object.getLength();
        }
        return wholeLenght;
    }
}
