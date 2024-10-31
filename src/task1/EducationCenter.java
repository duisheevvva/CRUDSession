package task1;

import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String locatedCountry;
    private LocalDate foundationDate;

    public EducationCenter() {
    }

    public EducationCenter(String name, String locatedCountry, LocalDate foundationDate) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationDate = foundationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    @Override
    public String toString() {
        return "task1.EducationCenter{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", foundationDate=" + foundationDate +
                '}';
    }
}
