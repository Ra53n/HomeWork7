package HomeWork7;

public class Bowl {
    private int mountOfFood;

    public void info(){
        System.out.println("В миске " + mountOfFood + " еды.");
    }

    public void decreaseFood(int appetite){
        mountOfFood -= appetite;
    }

    public void putFood(int food){
        mountOfFood += food;
    }

    public int getMountOfFood() {
        return mountOfFood;
    }
}
