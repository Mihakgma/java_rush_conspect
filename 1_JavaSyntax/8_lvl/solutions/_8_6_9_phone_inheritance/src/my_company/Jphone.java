package my_company;

public class Jphone extends SmartPhone {
    private final int memory;
    public Jphone(int memory) {
        if (memory > minMemory) {
            this.memory = memory;
        } else {
            this.memory = minMemory;
        }
    }
    public int getMemory() {
        return this.memory;
    }
}
