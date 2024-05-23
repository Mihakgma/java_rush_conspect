//import java.util.Arrays;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#####");

        Dog dog1 = new Dog("Spot");
        dog1.setWeigthKg(3);
        Dog dog2 = new Dog("Spot");
        dog2.setWeigthKg(3);
        dog2.setYearsOld(100);

        Cat cat1 = new Cat("Basilius");
        cat1.setWeigthKg(3.);

        dog1.setYearsOld(-999);
        System.out.println(dog1.getYearsOld());
        dog1.setYearsOld(1);
        System.out.println(dog1.getYearsOld());
        dog1.setYearsOld(100);
        System.out.println(dog1.getYearsOld());
        System.out.println(dog1.getWeigthKg());

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());

        System.out.println(dog1.name == dog2.name);
        System.out.println(dog1.name.equals(dog2.name));

        System.out.println(dog1.getWeigthKg() == dog2.getWeigthKg());
//        System.out.println(dog1.getWeigthKg().equals(dog2.getWeigthKg()));
        System.out.println("Hello, animals classes World!");
        dog1.move();
        cat1.move();
        dog1.says();
        cat1.says();

        Parasite flea = new Parasite("flea");
        flea.setWeigthKg(0.01);
        dog1.append_parazyte(flea);
        dog1.append_parazyte(flea);
        dog1.append_parazyte(flea);
        System.out.println(df.format(dog1.getWeigthKg()));
        for (int i = 0; i < dog1.parasitesLanded.size(); i++) {
            System.out.println(dog1.parasitesLanded.get(i).name);
        }
        System.out.println("cats weight before fleas landing is:");
        System.out.println(df.format(cat1.getWeigthKg()));
        dog1.shareParasites(cat1, true, 0);
        System.out.println("cats weight after fleas landing is:");
        System.out.println(df.format(cat1.getWeigthKg()));
        System.out.println(cat1.parasitesLanded);
    }
}
