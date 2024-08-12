public class Cycle {
    int WHEELS_NUMBER = 0;
    protected int wheelsNumber;
    public Cycle(){
        this.wheelsNumber = WHEELS_NUMBER;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public Cycle(int wheelsNum){
        this.wheelsNumber = wheelsNum;
    }
    public void ride(){
        System.out.println("Wheels = " + wheels());
    }
    private int wheels(){
        return this.wheelsNumber;
    }
}
