public class Bath extends Thing {
    public void washAnimal(BasicAnimal animal) {
        animal.becameClean();
        System.out.println(animal.getName() + " has been successfully washed!");
    }
}
