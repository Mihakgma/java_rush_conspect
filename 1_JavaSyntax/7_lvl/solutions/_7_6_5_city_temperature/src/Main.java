public class Main {
    public static void main(String[] args) {
        String cityName = "Дубай";
        int cityTemp = 40;
        City cityDubai = new City(cityName, cityTemp);
        showWeather(cityDubai);
    }
    public static void showWeather(City city) {
        //напишите тут ваш код
        System.out.println(String.format("В городе %s сегодня температура воздуха %d",
                                         city.getName(), city.getTemperature()));
    }
}
