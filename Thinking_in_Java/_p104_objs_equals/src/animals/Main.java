package animals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import animals_comparator.*;
import things.*;


/***
 @author Mikhail Tabakaev
 NB! Need to think about using Observer Pattern in this project. If this is really needed here...
 Objects Fabrique is necessary here or not - need to find out!!!
 In BasicAnimal class need to add removeParasite method and field parasitesLanded make protected
 to keep it save of unsanctional changes!!!
 */
public class Main {
    public static ArrayList<BasicAnimal> animals = new ArrayList<>();
    // some specialists recommend to save data in *.bin format cause of the data nature...
    public static String filename = "animals.dat";
    public static ArrayList<BasicAnimal> animalsArrayList = new ArrayList<>();
    public static ArrayList<BasicAnimal> animalsArrayListRead = new ArrayList<>();

    public static void main(String[] args) throws Throwable {
        DecimalFormat df = new DecimalFormat("#.#####");

        Dog dog1 = new Dog("Spot");
        dog1.setWeigthKg(7.3);
        Dog dog2 = new Dog("Spotify");
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
        print("bullTapeworm created!!!");
        print(bullTapeworm);
        bullTapeworm.setWeigthKg(0.47);
        bullTapeworm.printLegsNumber();
        dog1.append_parazyte(bullTapeworm);
        dog1.append_parazyte(bullTapeworm);
        print(df.format(dog1.getWeigthKg()));
        print(dog1);
        bullTapeworm.becomeDead();
        print(dog1);
        print(flea);
        print(bullTapeworm);
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
        cat1.parasitesLanded.remove(0);
        print("Количество паразитов на " + cat1.getName() + ":\n");
        print(cat1.parasitesLanded.size());

        print("\n A new class obj - bird");
        Bird sparrow = new Bird("Sparrow");
        sparrow.setWeigthKg(0.15);
        sparrow.move();
        sparrow.says();
        print("sparrow weight before being eaten is:");
        print(df.format(sparrow.getWeigthKg()));
        sparrow.fly();
        Parasite trematode = new Parasite("Trematode", Legs.Nolegs);
        sparrow.append_parazyte(trematode);
        print("Cat eats bird...");
        cat1.eatAnimal(sparrow);
        sparrow.fly();
        print("sparrow weight after being eaten is:");
        print(df.format(sparrow.getWeigthKg()));
        print("trying to do some actions by or with eaten sparrow:");
        sparrow.move();
        sparrow.says();
        print("\\nRacoon check...");
        Mammal racoon = new Mammal("Racoon", 4, 3.0);
        print(racoon);
        racoon.move();
        racoon.says();
        racoon.swim();
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
        eric.says();
        print("");
        Arthropod tarantula = new Spider("Tarantula spider");
//        tarantula.createCobWeb(); // cannot do this method because it is absent in Arthropod class!!!
        Spider tarantula2 = (Spider) tarantula;
        tarantula2.createCobWeb(); // now method became available!!!
        print(tarantula2);
        tarantula.setYearsOld(230, Spider.maxYearsOld);
        tarantula.setWeigthKg(0.85);
        print(tarantula);
        Arthropod.becomeImago(tarantula);
        tarantula.move();
        Arthropod arthropod = (Arthropod) tarantula;
        arthropod.move();
        arthropod.swim();
        tarantula2.swim();
        print("\nSorting created animals by their age (years):");
        Collections.addAll(animals,
                dog1, dog2, cat1, racoon,
                tarantula, tarantula2, eric, beast,
                sparrow, flea, bullTapeworm, trematode);
        // with comparator help sort animals by their age
        Collections.sort(animals, new AnimalAgeComparator()); // + use LegsNumberComparator simultaneously!!!
        for (BasicAnimal animal : animals) {
            print(animal);
            animal.swim();
        }

        // Writing Animal obj to file and reading data from it
        Collections.addAll(animalsArrayList,
                dog1, dog2, cat1, racoon,
                tarantula, tarantula2, eric, beast,
                sparrow, flea, bullTapeworm, trematode);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(animalsArrayList);
            print("File has been written");
        } catch (Exception ex) {
            print(ex.getMessage());
        }
        // reading from file:
        print("\n\n\nREADING FROM FILE!!!\n\n\n");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

            animalsArrayListRead = ((ArrayList<BasicAnimal>) ois.readObject());
        } catch (Exception ex) {

            print(ex.getMessage());
        }
        int animalsAliveNumber = 0;
        for (BasicAnimal a : animalsArrayListRead) {
            animalsAliveNumber += a.isAlive ? 1 : 0;
            print("\n" + a);
        }
        print("\n\nAnimals alive in ArrayList = " + animalsAliveNumber);
        print("Animals dead in ArrayList = " + (animalsArrayListRead.size() - animalsAliveNumber));
        print("Animals TOTAL amount = " + animalsArrayListRead.size());
    }

    static void print(Object obj) {
        System.out.println(obj);
    }
}
