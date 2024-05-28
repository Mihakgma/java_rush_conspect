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

        print(dog1.name == dog2.name);
        print(dog1.name.equals(dog2.name));

        print(dog1.getWeigthKg() == dog2.getWeigthKg());
//        print(dog1.getWeigthKg().equals(dog2.getWeigthKg()));
        print("Hello, animals classes World!");
        dog1.move();
        cat1.move();
        dog1.says();
        cat1.says();

        Parasite flea = new Parasite("Flea");
        flea.setWeigthKg(0.01);
        dog1.append_parazyte(flea);
        dog1.append_parazyte(flea);
        dog1.append_parazyte(flea);
        var bullTapeworm = new Parasite("Bull tapeworm");
        bullTapeworm.setWeigthKg(0.47);
        dog1.append_parazyte(bullTapeworm);
        dog1.append_parazyte(bullTapeworm);
        print(df.format(dog1.getWeigthKg()));
        print("\nParasites on an animal:");
        for (int i = 0; i < dog1.parasitesLanded.size(); i++) {
            print(dog1.parasitesLanded.get(i).name);
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
//        cat1.parasitesLanded.remove(2);
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
}
