public class Parrot implements Singable {
    private String text;
    public Parrot(String text){
        this.text = text;
    }

    public void sing(){
        System.out.println(text);
    }


}