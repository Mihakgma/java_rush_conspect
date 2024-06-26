//import java.util.Arrays;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#####");

        Dog dog1 = new Dog("Spot");
        dog1.setWeigthKg(7.3);
        Dog dog2 = new Dog("Spot");
        dog2.setWeigthKg(3);
        dog2.setYearsOld(100);

        Cat cat1 = new Cat("Basilius");
        cat1.setWeigthKg(3.);

        dog1.setYearsOld(-999);
        print(dog1.getYearsOld());
        dog1.setYearsOld(1);
        print(dog1.getYearsOld());
        dog1.setYearsOld(100);
        print(dog1.getYearsOld());
        print(dog1.getWeigthKg());

        print(dog1 == dog2);
        print(dog1.equals(dog2));
        print(dog1.hashCode());
        print(dog2.hashCode());

        print(dog1.getName() == dog2.getName());
        print(dog1.getName().equals(dog2.getName()));

        print(dog1.getWeigthKg() == dog2.getWeigthKg());
//        print(dog1.getWeigthKg().equals(dog2.getWeigthKg()));
        print("Hello, animals classes World!");
        dog1.move();
        cat1.move();
        dog1.says();
        cat1.says();

        Parasite flea = new Parasite("Flea", Legs.Insects);
        flea.setWeigthKg(0.01);
        flea.printLegsNumber();
        dog1.append_parazyte(flea);
        dog1.append_parazyte(flea);
        dog1.append_parazyte(flea);
        var bullTapeworm = new Parasite("Bull tapeworm", Legs.Nolegs);
        bullTapeworm.setWeigthKg(0.47);
        bullTapeworm.printLegsNumber();
        dog1.append_parazyte(bullTapeworm);
        dog1.append_parazyte(bullTapeworm);
        print(df.format(dog1.getWeigthKg()));
        print("\nParasites on an animal:");
        for (int i = 0; i < dog1.parasitesLanded.size(); i++) {
            print(dog1.parasitesLanded.get(i).getName());
        }
        print("Количество паразитов на " + dog1.getName() + ":\n");
        print(dog1.parasitesLanded.size() + "\n");
        print("cats weight before fleas landing is:");
        print(df.format(cat1.getWeigthKg()));
        dog1.shareParasites(cat1, true, 0);
        print("cats weight after fleas landing is:");
        print(df.format(cat1.getWeigthKg()));
        print("Количество паразитов на " + cat1.getName() + ":\n");
        print(cat1.parasitesLanded.size());
        cat1.parasitesLanded.remove(1);
        print("Количество паразитов на " + cat1.getName() + ":\n");
        print(cat1.parasitesLanded.size());

        print("\n A new class obj - bird");
        Bird sparrow = new Bird("Sparrow");
        sparrow.setWeigthKg(0.15);
        sparrow.move();
        sparrow.says();
        print("sparrow weight before being eaten is:");
        print(df.format(sparrow.getWeigthKg()));
        cat1.eatAnimal(sparrow);
        print("sparrow weight after being eaten is:");
        print(df.format(sparrow.getWeigthKg()));
        print("trying to do some actions by or with eaten sparrow:");
        sparrow.move();
        sparrow.says();
        print("\\nRacoon check...");
        Mammal racoon = new Mammal("Racoon", 4);
        print(racoon);
        racoon.move();
        racoon.says();
        Bath bath = new Bath();
        bath.washAnimal(racoon);
        print(racoon);
        Mammal beast = new Mammal();
        print(beast);
        Human eric = new Human("Eric");
        eric.setYearsOld(19);
        eric.setWeigthKg(69.0);
        bath.washAnimal(eric);
        print(eric);
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
}
