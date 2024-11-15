import java.util.Random;

public class Cuckoo implements Singable {
    public void sing() {
        Random random = new Random();
        int randInt = random.nextInt(10) + 1;
        for (int i = 0; i < randInt; i++) {
            System.out.println("Ку-ку");
        }
    }

}
