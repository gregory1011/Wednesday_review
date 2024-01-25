package week11;

import java.awt.*;

public class UsingCountry {

    public static void main(String[] args) {

        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation);
        System.out.println(Country.co2Level);

        System.out.println("------------------");
        Country.countryInfo();

        System.out.println("------------------");


        // Country.name; name is instance variable, so it can not be accessed in a static way.

        Country us = new Country("US", 350, "North America");
        System.out.println(us);
        System.out.println("Name = "+us.name);



    }

}
