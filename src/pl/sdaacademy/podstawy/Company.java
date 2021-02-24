package pl.sdaacademy.podstawy;

public class Company {
    private Country country;
    private String companyName;

    public Company(Country country, String companyName) {
        this.country = country;
        this.companyName = companyName;
    }

    public Country getCountry() {
        return country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String toString() {
        return companyName;
    }
}
