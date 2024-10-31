package task1;

import java.time.LocalDate;

public class University extends EducationCenter{
    public University() {
    }

    public University(String name, String locatedCountry, LocalDate foundationDate) {
        super(name, locatedCountry, foundationDate);
    }
}
