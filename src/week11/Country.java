package week11;

public class Country {

    public static String planet;
    public static double worldPopulation;  // represents in billions
    public static double co2Level;  // represents in ppm

    String name;
    double population;
    String continent;

    static {
        planet = "Earth";
        worldPopulation = 7.88;
        co2Level = 417.83;
    }

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public static void countryInfo(){
        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation);
        System.out.println(Country.co2Level);
    }

    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }




}
