package pl.sdaacademy.podstawy;

public class Main {

    public static void main(String[] args) {
        Country countryPoland = new Country(65, "Poland");
        Country countryGermany = new Country(65, "Poland");

        for( Country c: new Country[]{countryPoland, countryGermany})
        {
            System.out.println(c);
        }
    }


}
