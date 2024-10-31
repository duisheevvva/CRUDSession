package task1;

import java.time.LocalDate;

public class School extends EducationCenter{
    public School() {
    }

    public School(String name, String locatedCountry, LocalDate foundationDate) {
        super(name, locatedCountry, foundationDate);
    }
}
