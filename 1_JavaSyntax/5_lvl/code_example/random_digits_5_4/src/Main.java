public class Main {
    public static int a = 41;
    public static int c = 11119;
    public static int m = 11113;
    public static int seed = 1;

    public static int getNextRandom()
    {
        seed = (a * seed + c) % m;
        // меняется значение переменной seed с помощью данной функции
        return seed;
    }

    public static int getRandomDiceNumber()
    {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(getNextRandom());
        }
        System.out.println("На самом деле случайные числа:");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(Math.random());
        }
        System.out.println("Случайные грани кубика:");
        for (int i = 0; i < 10; i++)
        {
            int x = getRandomDiceNumber();
            System.out.println(x);
        }
//        System.out.println("Hello world!");
    }
}