public class MeowGroup {
    public void groupping(Meowable... objects){
        for(Meowable object: objects){
            object.meow();
        }
    }
}
