package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Bowl bowl){
        if(satiety == true) {
            System.out.println("Котик не голоден");
            return;
        }
        if(bowl.getMountOfFood() < appetite){
            System.out.println("Котику " + name + " мало еды!");
            return;
        } else {
            bowl.decreaseFood(appetite);
            System.out.println("Котик " + name + " поел!");
            satiety = true;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        if (satiety) System.out.println("Котик "+ name + " сыт!");
        else System.out.println("Котик " + name + " голоден(");
        return satiety;
    }
}
