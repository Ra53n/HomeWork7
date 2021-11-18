package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 50);// 1-4,6 Задания
        Bowl bowl = new Bowl();
        bowl.putFood(10);
        bowl.info();
        cat.eat(bowl);
        cat.isSatiety();
        bowl.putFood(40);
        cat.eat(bowl);
        cat.isSatiety();

        System.out.println();

        Bowl bowlForCats = new Bowl();
        bowlForCats.putFood(40);
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Vasya", 10);
        catArray[1] = new Cat("Borya", 30);
        catArray[2] = new Cat("Murka", 20);

        for(Cat cats : catArray){
            cats.eat(bowlForCats);
            cats.isSatiety();
        }
    }
}
