import animal.Animal;
import checken.Checken;
import edible.Edible;
import tiger.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] anm = new Animal[2];
        anm[0] = new Tiger();
        anm[1] = new Checken();
        for (Animal ans:anm) {
            System.out.println(ans.makeSound());
            if (ans instanceof Checken){
                Edible edibler= (Edible) ans;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
